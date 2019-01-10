package com.nmg.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import com.nmg.dao.GonggaoDao;
import com.nmg.entity.Gonggao;
import com.nmg.service.GonggaoService;
@Service
public class GonggaoServiceImpl implements GonggaoService{

	@Resource
	public GonggaoDao gonggaoDao;
	
	
	public GonggaoDao getGonggaoDao() {
		return gonggaoDao;
	}

	public void setGonggaoDao(GonggaoDao gonggaoDao) {
		this.gonggaoDao = gonggaoDao;
	}

	@Override
	public void insertGonggaoBean(Gonggao bean) {
		// TODO Auto-generated method stub
		gonggaoDao.insertGonggaoBean(bean);
		
	}

	@Override
	public void deleteGonggaoBean(Gonggao bean) {
		// TODO Auto-generated method stub
		gonggaoDao.deleteGonggaoBean(bean);
		
	}

	@Override
	public void updateGonggaoBean(Gonggao bean) {
		// TODO Auto-generated method stub
		gonggaoDao.updateGonggaoBean(bean);
		
	}

	public Gonggao selectGonggaoBean(String where) {
	
		return gonggaoDao.selectGonggaoBean(where);
	}

	public long selectGonggaoBeanCount(final String where) {
		
		long count = gonggaoDao.selectGonggaoBeanCount(where);
		return count;
	}


	public List<Gonggao> selectGonggaoBeanList(final int start,final int limit,final String where) {
				System.out.println("jinru"+start+limit);
				List<Gonggao> list = gonggaoDao.selectGonggaoBeanList(start, limit, where);
				return list;
			
		
	}

}
