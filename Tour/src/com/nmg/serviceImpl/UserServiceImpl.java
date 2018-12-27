package com.nmg.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nmg.dao.UserDao;
import com.nmg.entity.User;
import com.nmg.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Resource
	public UserDao userDao;
	
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void insertUserBean(User bean) {
		// TODO Auto-generated method stub
		userDao.insertUserBean(bean);
		
	}

	@Override
	public void deleteUserBean(User bean) {
		// TODO Auto-generated method stub
		userDao.deleteUserBean(bean);
		
	}

	@Override
	public void updateUserBean(User bean) {
		// TODO Auto-generated method stub
		userDao.updateUserBean(bean);
		
	}

	public List<User> selectUserBean(User bean) {
		List<User> list = userDao.selectUserBean(bean);
		
		return list;
	}

	public long selectUserBeanCount(final String where) {
		
		long count = userDao.selectUserBeanCount(where);
		return count;
	}


	public List<User> selectUserBeanList(final int start,final int limit,final String where) {
				System.out.println("jinru"+start+limit);
				List<User> list = userDao.selectUserBeanList(start, limit, where);
				return list;
			
		
	}
	//查询账户
	public int selectUsernameBean(String s){
		return userDao.selectUsernameBean(s);
	}
}
