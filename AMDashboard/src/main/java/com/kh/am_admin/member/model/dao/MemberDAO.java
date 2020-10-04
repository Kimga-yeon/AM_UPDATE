package com.kh.am_admin.member.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.am_admin.member.model.vo.Admin;
import com.kh.am_admin.member.model.vo.Member;

@Repository
public class MemberDAO {

    @Autowired
    private SqlSessionTemplate sqlSession;
    
    
    /** 로그인 DAO
     * @param member
     * @return loginMember
     */
    public Member login(Member member) {
        return sqlSession.selectOne("memberMapper.loginMember", member);
    }


	/** 관리자 정보수정 DAO
	 * @param admin
	 * @return
	 */
	public int updateProfile(Admin admin) {
		return sqlSession.update("memberMapper.updateProfile",admin);
	}



	/** 관리자 정보 수정(멤버)
	 * @param admin
	 * @return
	 */
	public int updateProfileMember(Admin admin) {
		return sqlSession.update("memberMapper.updateProfileMember",admin);
	}

}
