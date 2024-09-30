package com.incedo;

import java.util.ArrayList;
import java.util.HashMap;

public class User implements iValidate {

	private String userid;
	private String password;
	private static HashMap<String, String > hm=new HashMap<String, String>();
	public User(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean IsAuthenticated(String userid, String password) {
		if(password.equals(hm.get(userid)))
		{ 
			return true;
		}
		
		return false;
	}
	public void addUser(String userid, String password)
	{
		hm.put(userid, password);
	}
	
	@Override
	public String toString() {
		return "User [userid=" + userid + ", password=" + password + "]";
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
