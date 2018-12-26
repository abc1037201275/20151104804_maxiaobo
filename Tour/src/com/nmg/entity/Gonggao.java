package com.nmg.entity;


import java.util.Date;


//动态新闻

public class Gonggao {
	


	private int id;//主键
	
	
    private String biaoti;//新闻标题
	
	private String content;//新闻内容
	
	private Date createtime;//添加时间

	private int gonggaolock;//删除状态  0表示未删除 1表示已删除
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGonggaolock() {
		return gonggaolock;
	}

	public void setGonggaolock(int gonggaolock) {
		this.gonggaolock = gonggaolock;
	}

	public String getBiaoti() {
		return biaoti;
	}

	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
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
	

	
}
