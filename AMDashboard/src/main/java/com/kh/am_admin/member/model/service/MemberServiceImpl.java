package com.kh.am_admin.member.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kh.am_admin.member.model.dao.MemberDAO;
import com.kh.am_admin.member.model.vo.Admin;
import com.kh.am_admin.member.model.vo.Member;



@Service
public class MemberServiceImpl implements MemberService{
    
    @Autowired 
    private MemberDAO memberDAO;
    
    @Autowired
    private BCryptPasswordEncoder bcPwd;
    
    
    
    // 로그인 Service  
    @Override
    public Member login(Member member) {
        
    	
        Member loginMember = memberDAO.login(member);
        
        if(loginMember != null) {
			if(!bcPwd.matches(member.getMemberPwd(), 
						loginMember.getMemberPwd())) {
			// 입력한 비밀번호가 DB에 저장된 값과 같지 않을 경우 
			loginMember = null;
			
			}else {
				// 비교가 끝난 조회된 비밀번호 삭제 
				loginMember.setMemberPwd(null);
			}
		}
        
        return loginMember;
    }


    //관리자 정보수정 
	@Transactional(rollbackFor = Exception.class)
	@Override
	public int updateProfile(Admin admin) {
		return memberDAO.updateProfile(admin);
	}


	// 관리자 정보 수정(멤버)
	@Transactional(rollbackFor=Exception.class)
	@Override
	public int updateProfileMember(Admin admin) {
		return memberDAO.updateProfileMember(admin);
	}

}
