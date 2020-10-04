package com.kh.am_admin.member.model.vo;

public class Admin {

	private int memberNo;
	private String memberEmail;
	private String memberName;
    private String memberPhone;
	private String adminAddress;
	private String aboutMe;
	
	public Admin() {
	}

	public Admin(int memberNo, String memberEmail, String memberName, String memberPhone, String adminAddress,
			String aboutMe) {
		super();
		this.memberNo = memberNo;
		this.memberEmail = memberEmail;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.adminAddress = adminAddress;
		this.aboutMe = aboutMe;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getAdminAddress() {
		return adminAddress;
	}

	public void setAdminAddress(String adminAddress) {
		this.adminAddress = adminAddress;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	@Override
	public String toString() {
		return "Admin [memberNo=" + memberNo + ", memberEmail=" + memberEmail + ", memberName=" + memberName
				+ ", memberPhone=" + memberPhone + ", adminAddress=" + adminAddress + ", aboutMe=" + aboutMe + "]";
	}
	
	



	
	
}
