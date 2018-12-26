package com.nmg.entity;


import java.util.Date;


//旅游景点

public class Jingdian {
	

	private int id;//主键
	private String imgpath;//景点图片
	private String name;//景点名称

	private String content;//景点描述
	private Date createtime;//添加时间
	private int jingdianlock;//删除状态  0表示未删除 1表示已删除
	
	
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

	public int getJingdianlock() {
		return jingdianlock;
	}

	public void setJingdianlock(int jingdianlock) {
		this.jingdianlock = jingdianlock;
	}

	public Jingdian(int id, String imgpath, String name, String content, int jingdianlock) {
		super();
		this.id = id;
		this.imgpath = imgpath;
		this.name = name;
		this.content = content;
		this.jingdianlock = jingdianlock;
	}

	public Jingdian(int id, String imgpath, String name, String content, Date createtime, int jingdianlock) {
		super();
		this.id = id;
		this.imgpath = imgpath;
		this.name = name;
		this.content = content;
		this.createtime = createtime;
		this.jingdianlock = jingdianlock;
	}

	public Jingdian() {
		super();
	}

	@Override
	public String toString() {
		return "Jingdian [id=" + id + ", imgpath=" + imgpath + ", name=" + name + ", content=" + content
				+ ", createtime=" + createtime + ", jingdianlock=" + jingdianlock + "]";
	}

	
	

	
}
