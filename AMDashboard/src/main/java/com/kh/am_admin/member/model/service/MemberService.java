package com.kh.am_admin.member.model.service;

import java.util.List;

import com.kh.am_admin.member.model.vo.Admin;
import com.kh.am_admin.member.model.vo.Member;

public interface MemberService {

    /** 로그인 Service
     * @param member
     * @return loginMember
     */
    Member login(Member member);

    
	/** 관리자 정보수정 Service
	 * @param admin
	 * @return
	 */
	int updateProfile(Admin admin);




	/** 관리자 정보수정(멤버) 
	 * @param admin
	 * @return
	 */
	int updateProfileMember(Admin admin);

}
