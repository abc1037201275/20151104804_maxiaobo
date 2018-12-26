package com.nmg.entity;
import java.io.Serializable;



//管理员
public class Manager implements Serializable{
	
	private static final long serialVersionUID = -117947798302585032L;

	private int id;//主键
	
	private String username;//用户名
	
	private String password;//密码
	
	private int managerlock;//是否删除的字段，0表示未删除，1表示删除



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getManagerlock() {
		return managerlock;
	}

	public void setManagerlock(int managerlock) {
		this.managerlock = managerlock;
	}

	

	
}
