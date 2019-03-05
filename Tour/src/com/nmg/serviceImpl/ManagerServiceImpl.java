package com.nmg.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nmg.dao.ManagerDao;
import com.nmg.entity.Manager;
import com.nmg.service.ManagerService;
@Service
public class ManagerServiceImpl implements ManagerService{
	@Resource
	public ManagerDao managerDao;
	
	
	public ManagerDao getManagerDao() {
		return managerDao;
	}

	public void setManagerDao(ManagerDao managerDao) {
		this.managerDao = managerDao;
	}

	@Override
	public void insertManagerBean(Manager bean) {
		// TODO Auto-generated method stub
		managerDao.insertManagerBean(bean);
		
	}

	@Override
	public void deleteManagerBean(Manager bean) {
		// TODO Auto-generated method stub
		managerDao.deleteManagerBean(bean);
		
	}

	@Override
	public void updateManagerBean(Manager bean) {
		// TODO Auto-generated method stub
		managerDao.updateManagerBean(bean);
		
	}

	public List<Manager> selectManagerBean(Manager bean) {
		List<Manager> list = managerDao.selectManagerBean(bean);
		
		return list;
	}

	public long selectManagerBeanCount(final String where) {
		
		long count = managerDao.selectManagerBeanCount(where);
		return count;
	}


	public List<Manager> selectManagerBeanList(final int start,final int limit,final String where) {
				System.out.println("jinru"+start+limit);
				List<Manager> list = managerDao.selectManagerBeanList(start, limit,where);
				return list;
			
		
	}
	//查询账户
	public int selectManagernameBean(String s){
		return managerDao.selectManagernameBean(s);
	}
}
