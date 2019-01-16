package com.nmg.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nmg.dao.JingdianDao;
import com.nmg.entity.Jingdian;
import com.nmg.service.JingdianService;
@Service
public class JingdianServiceImpl implements JingdianService{

	@Resource
	public JingdianDao jingdianDao;
	
	
	public JingdianDao getJingdianDao() {
		return jingdianDao;
	}

	public void setJingdianDao(JingdianDao jingdianDao) {
		this.jingdianDao = jingdianDao;
	}

	@Override
	public void insertBean(Jingdian bean) {
		// TODO Auto-generated method stub
		jingdianDao.insertBean(bean);
		
	}

	@Override
	public void deleteBean(Jingdian bean) {
		// TODO Auto-generated method stub
		jingdianDao.deleteBean(bean);
		
	}

	@Override
	public void updateBean(Jingdian bean) {
		// TODO Auto-generated method stub
		jingdianDao.updateBean(bean);
		
	}

	public Jingdian selectBean(String where) {
	
		return jingdianDao.selectBean(where);
	}

	public long selectBeanCount(final String where) {
		
		long count = jingdianDao.selectBeanCount(where);
		return count;
	}


	public List<Jingdian> selectBeanList(final int start,final int limit,final String where) {
				System.out.println("jinru"+start+limit);
				List<Jingdian> list = jingdianDao.selectBeanList(start, limit, where);
				return list;
			
		
	}

}
