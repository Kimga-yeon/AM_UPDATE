package com.kh.am_admin.common.filter;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.am_admin.member.model.vo.Member;


// 로그인 필터 (로그인이 필요한 서비스를 로그인 되지 않은 상태에서 url 직접 입력으로 접근한 경우 차단)
@WebFilter(urlPatterns = "/board/*") // member관련 요청이 필터를 거치게 함.
public class LoginFilter implements Filter{

	// 로그인이 되어있지 않아도 되는 url 경로를 Set 형태로 등록
	private static final Set<String> NOT_ALLOWED_PATH
	= new HashSet<String>(Arrays.asList("loginAction"));
	
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)request;
		// HttpServletRequest는 ServletRequest의 자식이므로 강제 형변환 가능
		
		HttpServletResponse res = (HttpServletResponse)response;
		// HttpServletResponse는 ServletResponse의 자식이므로 강제 형변환 가능
		
		// 현재 session을 얻어옴
		HttpSession session = req.getSession();
		

		// 요청 경로 확인
		String path = req.getRequestURI().substring((req.getContextPath()+"/member/").length());
		
		// 로그인 여부 확인
		boolean isLogin = ((Member)session.getAttribute("loginMember") != null);
		
		// 요청 주소가 제외 목록에 있는 값인지 확인
		boolean isNotAllowdPath = NOT_ALLOWED_PATH.contains(path);
		
		// 로그인이 되어 있거나, 제외 목록 주소가 아닌 경우
		if(isLogin || isNotAllowdPath) {
			chain.doFilter(request, response);
		}else {
			res.sendRedirect(req.getContextPath()); // 메인페이지로 이동
		}
	}

	@Override
	public void destroy() {}
	
}
