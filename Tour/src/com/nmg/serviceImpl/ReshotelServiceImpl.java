package com.nmg.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nmg.dao.ReshotelDao;
import com.nmg.entity.Reshotel;
import com.nmg.service.ReshotelService;
@Service
public class ReshotelServiceImpl implements ReshotelService{
	@Resource
	public ReshotelDao reshotelDao;
	
	
	public ReshotelDao getReshotelDao() {
		return reshotelDao;
	}

	public void setReshotelDao(ReshotelDao reshotelDao) {
		this.reshotelDao = reshotelDao;
	}

	@Override
	public void insertReshotelBean(Reshotel bean) {
		// TODO Auto-generated method stub
		reshotelDao.insertReshotelBean(bean);
		
	}

	@Override
	public void deleteReshotelBean(Reshotel bean) {
		// TODO Auto-generated method stub
		reshotelDao.deleteReshotelBean(bean);
		
	}

	@Override
	public void updateReshotelBean(Reshotel bean) {
		// TODO Auto-generated method stub
		reshotelDao.updateReshotelBean(bean);
		
	}

	public Reshotel selectReshotelBean(String bean) {
		return reshotelDao.selectReshotelBean(bean);
		
	
	}

	public long selectReshotelBeanCount(final String where) {
		
		long count = reshotelDao.selectReshotelBeanCount(where);
		return count;
	}


	public List<Reshotel> selectReshotelBeanList(final int start,final int limit,final String where) {
			
				List<Reshotel> list = reshotelDao.selectReshotelBeanList(start, limit, where);
				return list;
			
		
	}
	//查询账户
	public Reshotel selectReshotelnameBean(String s){
		return reshotelDao.selectReshotelBean(s);
	}
	
	public List<Reshotel> selectReshotelBeanListByUid(final int start){
		List<Reshotel> list = reshotelDao.selectReshotelBeanListByUid(start);
		return list;
	}

	@Override
	public void deleteReshotelUserBean(Reshotel bean) {
		// TODO Auto-generated method stub
		reshotelDao.deleteReshotelUserBean(bean);
	}
}
