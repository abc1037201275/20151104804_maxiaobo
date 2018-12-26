package com.nmg.entity;


import java.util.Date;


//服务指南

public class Guide {
	


	private int id;//主键
	
	
    private String biaoti;//服务指南标题
	

	private String content;//服务指南内容
	
	private Date createtime;//添加时间

	private int guidelock;//删除状态  0表示未删除 1表示已删除
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getGuidelock() {
		return guidelock;
	}

	public void setGuidelock(int guidelock) {
		this.guidelock = guidelock;
	}
	

	
}
