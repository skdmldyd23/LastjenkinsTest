package com.ryeom.demo.user.DTO;

public class Users {
	
	int user_Number;
	String user_ID;
	String user_PW;
	String user_Name;
	String user_Email;
	int user_postcode;
	String user_roadAddress;
	String user_jibunAddress;
	String user_detailAddress;
	String user_extraAddress;
	

	public int getUser_Number() {
		return user_Number;
	}
	public void setUser_Number(int user_Number) {
		this.user_Number = user_Number;
	}
	public String getUser_ID() {
		return user_ID;
	}
	public void setUser_ID(String user_ID) {
		this.user_ID = user_ID;
	}
	public String getUser_PW() {
		return user_PW;
	}
	public void setUser_PW(String user_PW) {
		this.user_PW = user_PW;
	}
	public String getUser_Name() {
		return user_Name;
	}
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
	public String getUser_Email() {
		return user_Email;
	}
	public void setUser_Email(String user_Email) {
		this.user_Email = user_Email;
	}
	public int getUser_postcode() {
		return user_postcode;
	}
	public void setUser_postcode(int user_postcode) {
		this.user_postcode = user_postcode;
	}
	public String getUser_roadAddress() {
		return user_roadAddress;
	}
	public void setUser_roadAddress(String user_roadAddress) {
		this.user_roadAddress = user_roadAddress;
	}
	public String getUser_jibunAddress() {
		return user_jibunAddress;
	}
	public void setUser_jibunAddress(String user_jibunAddress) {
		this.user_jibunAddress = user_jibunAddress;
	}
	public String getUser_detailAddress() {
		return user_detailAddress;
	}
	public void setUser_detailAddress(String user_detailAddress) {
		this.user_detailAddress = user_detailAddress;
	}
	public String getUser_extraAddress() {
		return user_extraAddress;
	}
	public void setUser_extraAddress(String user_extraAddress) {
		this.user_extraAddress = user_extraAddress;
	}

	@Override
	public String toString() {
		return "Users [user_Number=" + user_Number + ", user_ID=" + user_ID + ", user_PW=" + user_PW + ", user_Name="
				+ user_Name + ", user_Email=" + user_Email + ", user_postcode=" + user_postcode + ", user_roadAddress="
				+ user_roadAddress + ", user_jibunAddress=" + user_jibunAddress + ", user_detailAddress="
				+ user_detailAddress + ", user_extraAddress=" + user_extraAddress + "]";
	}
}
