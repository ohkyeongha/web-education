package com.kitri.mcvtest;

public class MemberVO {

	private String id;
	private String pw;
	private String name;
	private String address;
	private String email;
	private String phone;
	private String gender;
	private String[] hobby;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobby() {
		String result ="";
		for(String h : hobby) {
			result += h +", ";
			
		}
		
		return result;
	}
	
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	
	
}
