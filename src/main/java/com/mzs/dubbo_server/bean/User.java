/**
 * All rights Reserved, Designed By tydic.com
 * @Author mengzs
 * @Date 2017年11月13日 上午11:43:17
 */
package com.mzs.dubbo_server.bean;

import java.io.Serializable;

/**
 * @Author mengzs
 * @Date 2017年11月13日
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String username;

	private String password;

	public User() {
		super();
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}

}
