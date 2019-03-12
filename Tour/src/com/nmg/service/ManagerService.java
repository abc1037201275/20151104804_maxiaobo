package com.nmg.service;

import java.util.List;

import com.nmg.entity.Manager;

public interface ManagerService {
	
	//插入新纪录
	public void insertManagerBean(Manager bean);
	
	//根据用户id删除纪录
	public void deleteManagerBean(Manager bean);
	
	//根据用户id更新纪录
	public void updateManagerBean(Manager bean);

	//获取信息列表,带查询功能，start 表示当前页，limit表示每页显示的条数 start=1,lmit=10
	public List<Manager> selectManagerBeanList(final int start,final int limit,final String where);
	
	
	//查询记录的总的条数
	public long selectManagerBeanCount(final String where);
	
	//查询用户信息
	public List<Manager> selectManagerBean(Manager bean);
	//查询账户
	public int selectManagernameBean(String s);
}
