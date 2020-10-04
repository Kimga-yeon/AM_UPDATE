package com.kh.am_admin.member.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kh.am_admin.member.model.service.MemberService;
import com.kh.am_admin.member.model.vo.Admin;
import com.kh.am_admin.member.model.vo.Member;

@SessionAttributes({"loginMember"})

@Controller
@RequestMapping("/member/*")
public class MemberController {

    
    @Autowired
    private MemberService memberService;
    
    
    
    // 로그인 동작
    @RequestMapping("loginAction")
    public String loginAction(Member member,Model model, RedirectAttributes rdAttr,
                              HttpServletResponse response) {
        

        Member loginMember = memberService.login(member);
        
        String status = null;
		String msg = null;
		String text = null;
		
        if(loginMember == null) {
        	status = "error";
			msg = "관리자 정보 수정 실패";
            
            return "redirect:/"; 

        }else {
            model.addAttribute("loginMember",loginMember);
        }
        
         return "member/main";
    }
    
    // 메인 화면 이동 
    @RequestMapping("main")
    public String main() {
        return "member/main";
    }
    
    // 로그아웃
    @RequestMapping("logout")
    public String logout(SessionStatus status) {
        status.setComplete();
        return "redirect:/";
    }
    
    
    
    // 관리자프로필 이동 
    @RequestMapping("adminProfile")
    public String adminProfile() {
        return "member/adminProfile";
    }
    
        
    // 관리자프로필 수정
    @RequestMapping("updateProfile")
    public String updateProfile(Admin admin,Model model, RedirectAttributes rdAttr, HttpServletRequest request) {
    	
		Member loginMember = (Member)model.getAttribute("loginMember");
		int memberNo = loginMember.getMemberNo();

    	
		admin.setMemberNo(loginMember.getMemberNo());
		
		int result = memberService.updateProfile(admin);
		int result2 = memberService.updateProfileMember(admin);
		
		System.out.println("프로필수정"+admin);
		
		String status = null;
		String msg = null;
		
		if(result > 0 ) {
			status = "success";
			msg = "회원 정보 수정 성공";

			model.addAttribute("loginMember", admin);

		}else if(result2 > 0){
			status = "success";
			msg = "관리자 정보 수정 성공";

			model.addAttribute("loginMember", admin);
		}

		else {
			status = "error";
			msg = "관리자 정보 수정 실패";
		}
		
		rdAttr.addFlashAttribute("status", status);
		rdAttr.addFlashAttribute("msg", msg);
		
		
		return "redirect:" + request.getHeader("referer");
			
	 }
    
    
    
    
    
    // DB 관련 예외가 발생할 경우 처리하는 메소드
    @ExceptionHandler({SQLException.class, BadSqlGrammarException.class}) 
    public String dbException(Exception e, Model model) {
        e.printStackTrace();
        
        model.addAttribute("errorMsg", "데이터베이스 관련 예외 발생");
        
        return "common/errorPage";
        
    }
    
    @ExceptionHandler(Exception.class) 
    public String etcException(Exception e, Model model, HttpServletRequest request) {
        e.printStackTrace();
        
        System.out.println(request.getRequestURI()); // 예외가 발생한 요청 주소
        System.out.println(e.getStackTrace()[0]); // 예외 내용의 첫 줄 
        System.out.println(e.getMessage()); // 예외 관련 메세지 출력
        
        model.addAttribute("errorMsg", "기타 예외 발생");
        return "common/errorPage";
        
    }
}
