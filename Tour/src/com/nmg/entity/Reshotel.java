package com.nmg.entity;

import java.util.Date;


//酒店预定

public class Reshotel {
	

	private int id;//主键

	private Hotel hotel;//关联酒店 

	private User user;//关联用户
	private int numer;//预定天数
	private String times;//预定日期
	private int heji;//合计费用
	private Date createtime;//添加时间
	private int reshotellock;//删除状态  0表示未删除 1表示已删除
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getNumer() {
		return numer;
	}
	public void setNumer(int numer) {
		this.numer = numer;
	}
	public String getTimes() {
		return times;
	}
	public void setTimes(String times) {
		this.times = times;
	}
	public int getHeji() {
		return heji;
	}
	public void setHeji(int heji) {
		this.heji = heji;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public int getReshotellock() {
		return reshotellock;
	}
	public void setReshotellock(int reshotellock) {
		this.reshotellock = reshotellock;
	}

	
	

	
}
