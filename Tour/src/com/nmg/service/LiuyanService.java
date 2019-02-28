package com.nmg.service;

import java.util.List;

import com.nmg.entity.Gonggao;
import com.nmg.entity.Jingdian;
import com.nmg.entity.Liuyan;

public interface LiuyanService {

	
	//插入新纪录
	public void insertLiuyanBean(Liuyan bean);
	
	//根据用户id删除纪录
	public void deleteLiuyanBean(Liuyan bean);
	
	//根据用户id更新纪录
	public void updateLiuyanBean(Liuyan bean);

	//获取信息列表,带查询功能，start 表示当前页，limit表示每页显示的条数 start=1,lmit=10
	public List<Liuyan> selectLiuyanBeanList(final int start,final int limit,final String where);
	
	
	//查询记录的总的条数
	public long selectLiuyanBeanCount(final String where);
	
	//查询用户信息
	public Liuyan selectLiuyanBean(String where);
	
	public void deleteLiuyanUserBean(Liuyan bean);
}
