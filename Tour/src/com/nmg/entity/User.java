package com.nmg.entity;
import java.io.Serializable;
import java.util.Date;



//用户

public class User implements Serializable{
	
	private static final long serialVersionUID = -117947798302585032L;

	private int id;//主键
	
	private String username;//用户名
	
	private String password;//密码
	
	private String truename;//真实姓名
	
    private String telephone;//手机号
	
	private String jiguan;//籍贯
	
	private String address;//家庭地址
	
	private String xingbie;//性别
	
	private String age;//年龄
	
	private String email;//邮箱
	
	private Date createtime;//添加时间
	
	private int userlock;//是否删除的字段，0表示未删除，1表示删除



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

	public String getTruename() {
		return truename;
	}

	public void setTruename(String truename) {
		this.truename = truename;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public int getUserlock() {
		return userlock;
	}

	public void setUserlock(int userlock) {
		this.userlock = userlock;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getJiguan() {
		return jiguan;
	}

	public void setJiguan(String jiguan) {
		this.jiguan = jiguan;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getXingbie() {
		return xingbie;
	}

	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", truename=" + truename
				+ ", telephone=" + telephone + ", jiguan=" + jiguan + ", address=" + address + ", xingbie=" + xingbie
				+ ", age=" + age + ", email=" + email + ", createtime=" + createtime + ", userlock=" + userlock + "]";
	}

	
	
}
