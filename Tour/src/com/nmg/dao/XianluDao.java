package com.nmg.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nmg.entity.Xianlu;
@Repository
public interface XianluDao {

	
	//插入新纪录
	public void insertXianluBean(Xianlu bean);
	
	//根据用户id删除纪录
	public void deleteXianluBean(Xianlu bean);
	
	//根据用户id更新纪录
	public void updateXianluBean(Xianlu bean);

	//获取信息列表,带查询功能，start 表示当前页，limit表示每页显示的条数 start=1,lmit=10
	public List<Xianlu> selectXianluBeanList(final int start,final int limit,final String where);
	
	
	//查询记录的总的条数
	public long selectXianluBeanCount(final String where);
	
	//查询用户信息
	public Xianlu selectXianluBean(String where);
	

}
