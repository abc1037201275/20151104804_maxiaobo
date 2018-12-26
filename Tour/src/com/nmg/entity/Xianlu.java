package com.nmg.entity;
import java.util.Date;


//旅游线路

public class Xianlu {



	private int id;//主键
    private String staraddress;//出发地
    private String endaddress;//目的地
	private String content;//线路描述
	private int price;//单价  （单人/元）
	private Date createtime;//添加时间
	private int xianlulock;//删除状态  0表示未删除 1表示已删除
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStaraddress() {
		return staraddress;
	}

	public void setStaraddress(String staraddress) {
		this.staraddress = staraddress;
	}

	public String getEndaddress() {
		return endaddress;
	}

	public void setEndaddress(String endaddress) {
		this.endaddress = endaddress;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public int getXianlulock() {
		return xianlulock;
	}

	public void setXianlulock(int xianlulock) {
		this.xianlulock = xianlulock;
	}

	
}
