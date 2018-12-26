package com.nmg.entity;

import java.util.Date;


//酒店

public class Hotel {
	

	private int id;//主键
	private String imgpath;//酒店图片
	private String name;//酒店名称
	private int price;//单价  （元/日）
	private String tel;//联系电话
	private String address;//地址

	private String content;//酒店描述
	
	private Date createtime;//添加时间
	private int hotellock;//删除状态  0表示未删除 1表示已删除
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImgpath() {
		return imgpath;
	}

	public void setImgpath(String imgpath) {
		this.imgpath = imgpath;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getHotellock() {
		return hotellock;
	}

	public void setHotellock(int hotellock) {
		this.hotellock = hotellock;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", imgpath=" + imgpath + ", name=" + name + ", price=" + price + ", tel=" + tel
				+ ", address=" + address + ", content=" + content + ", createtime=" + createtime + ", hotellock="
				+ hotellock + "]";
	}

	
}
