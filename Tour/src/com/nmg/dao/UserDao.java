package com.nmg.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nmg.entity.User;
@Repository
public interface UserDao {

	
	//插入新纪录
	public void insertUserBean(User bean);
	
	//根据用户id删除纪录
	public void deleteUserBean(User bean);
	
	//根据用户id更新纪录
	public void updateUserBean(User bean);

	//获取信息列表,带查询功能，start 表示当前页，limit表示每页显示的条数 start=1,lmit=10
	public List<User> selectUserBeanList(final int start,final int limit,final String where);
	
	
	//查询记录的总的条数
	public long selectUserBeanCount(final String where);
	
	//查询用户信息
	public List<User> selectUserBean(User bean);
	//查询账户
	public int selectUsernameBean(String s);

}
