package com.byzx.model;

public class UserInfo {

	private Integer u_id;
	private String userName;
	private String password;
	
	
	public Integer getU_id() {
		return u_id;
	}


	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * �޲ι��캯��
	 */
	public UserInfo() {
			}
	
	
	/**
	 * �вι��캯��
	 */
	
	
	
	
	public UserInfo(Integer u_id, String userName, String password) {
		super();
		this.u_id = u_id;
		this.userName = userName;
		this.password = password;
	}

	
	
	
	
	
}
