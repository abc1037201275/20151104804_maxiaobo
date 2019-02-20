package com.nmg.dao;
import java.util.List;

import com.nmg.entity.Reshotel;

public interface ReshotelDao {

	
	//插入新纪录
	public void insertReshotelBean(Reshotel bean);
	
	//根据用户id删除纪录
	public void deleteReshotelBean(Reshotel bean);
	
	//根据用户id更新纪录
	public void updateReshotelBean(Reshotel bean);
	public void deleteReshotelUserBean(Reshotel bean);
	//获取信息列表,带查询功能，start 表示当前页，limit表示每页显示的条数 start=1,lmit=10
	public List<Reshotel> selectReshotelBeanList(final int start,final int limit,final String where);
	
	
	//查询记录的总的条数
	public long selectReshotelBeanCount(final String where);
	
	//查询用户信息
	public Reshotel selectReshotelBean(String where);
	
	public List<Reshotel> selectReshotelBeanListByUid(final int start);
	
	
}
