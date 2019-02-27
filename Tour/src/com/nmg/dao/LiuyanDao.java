package com.nmg.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nmg.entity.Liuyan;
@Repository
public interface LiuyanDao {

	
	//插入新纪录
	public void insertLiuyanBean(Liuyan bean);
	
	//根据用户id删除纪录
	public void deleteLiuyanBean(Liuyan bean);
	public void deleteLiuyanUserBean(Liuyan bean);
	
	//根据用户id更新纪录
	public void updateLiuyanBean(Liuyan bean);

	//获取信息列表,带查询功能，start 表示当前页，limit表示每页显示的条数 start=1,lmit=10
	public List<Liuyan> selectLiuyanBeanList(final int start,final int limit,final String where);
	
	
	//查询记录的总的条数
	public long selectLiuyanBeanCount(final String where);
	
	//查询用户信息
	public Liuyan selectLiuyanBean(String where);
	

}
