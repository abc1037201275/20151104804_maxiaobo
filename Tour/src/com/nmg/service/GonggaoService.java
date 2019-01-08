package com.nmg.service;

import java.util.List;

import com.nmg.entity.Gonggao;
import com.nmg.entity.Jingdian;

public interface GonggaoService {

	//插入新纪录
	public void insertGonggaoBean(Gonggao bean);
	
	//根据用户id删除纪录
	public void deleteGonggaoBean(Gonggao bean);
	
	//根据用户id更新纪录
	public void updateGonggaoBean(Gonggao bean);

	//获取信息列表,带查询功能，start 表示当前页，limit表示每页显示的条数 start=1,lmit=10
	public List<Gonggao> selectGonggaoBeanList(final int start,final int limit,final String where);
	
	
	//查询记录的总的条数
	public long selectGonggaoBeanCount(final String where);
	
	//查询用户信息
	public Gonggao selectGonggaoBean(String where);
}
