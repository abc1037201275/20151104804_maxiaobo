package com.nmg.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nmg.dao.LiuyanDao;
import com.nmg.entity.Liuyan;
import com.nmg.service.LiuyanService;
@Service
public class LiuyanServiceImpl implements LiuyanService{
	@Resource
	public LiuyanDao liuyanDao;
	
	
	public LiuyanDao getLiuyanDao() {
		return liuyanDao;
	}

	public void setLiuyanDao(LiuyanDao liuyanDao) {
		this.liuyanDao = liuyanDao;
	}

	@Override
	public void insertLiuyanBean(Liuyan bean) {
		// TODO Auto-generated method stub
		liuyanDao.insertLiuyanBean(bean);
		
	}

	@Override
	public void deleteLiuyanBean(Liuyan bean) {
		// TODO Auto-generated method stub
		liuyanDao.deleteLiuyanBean(bean);
		
	}

	@Override
	public void updateLiuyanBean(Liuyan bean) {
		// TODO Auto-generated method stub
		liuyanDao.updateLiuyanBean(bean);
		
	}

	public Liuyan selectLiuyanBean(String bean) {
		return liuyanDao.selectLiuyanBean(bean);
		
	
	}

	public long selectLiuyanBeanCount(final String where) {
		
		long count = liuyanDao.selectLiuyanBeanCount(where);
		return count;
	}


	public List<Liuyan> selectLiuyanBeanList(final int start,final int limit,final String where) {
			
				List<Liuyan> list = liuyanDao.selectLiuyanBeanList(start, limit, where);
				return list;
			
		
	}
	//查询账户
	public Liuyan selectLiuyannameBean(String s){
		return liuyanDao.selectLiuyanBean(s);
	}

	@Override
	public void deleteLiuyanUserBean(Liuyan bean) {
		liuyanDao.deleteLiuyanUserBean(bean);
		
	}
	

}
