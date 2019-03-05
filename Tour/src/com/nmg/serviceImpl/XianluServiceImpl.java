package com.nmg.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nmg.dao.XianluDao;
import com.nmg.entity.Xianlu;
import com.nmg.service.XianluService;
@Service
public class XianluServiceImpl implements XianluService{
	@Resource
	public XianluDao xianluDao;
	
	
	public XianluDao getXianluDao() {
		return xianluDao;
	}

	public void setXianluDao(XianluDao xianluDao) {
		this.xianluDao = xianluDao;
	}

	@Override
	public void insertXianluBean(Xianlu bean) {
		// TODO Auto-generated method stub
		xianluDao.insertXianluBean(bean);
		
	}

	@Override
	public void deleteXianluBean(Xianlu bean) {
		// TODO Auto-generated method stub
		xianluDao.deleteXianluBean(bean);
		
	}

	@Override
	public void updateXianluBean(Xianlu bean) {
		// TODO Auto-generated method stub
		xianluDao.updateXianluBean(bean);
		
	}

	public Xianlu selectXianluBean(String bean) {
		return xianluDao.selectXianluBean(bean);
		
	
	}

	public long selectXianluBeanCount(final String where) {
		
		long count = xianluDao.selectXianluBeanCount(where);
		return count;
	}


	public List<Xianlu> selectXianluBeanList(final int start,final int limit,final String where) {
				System.out.println("jinru"+start+limit);
				List<Xianlu> list = xianluDao.selectXianluBeanList(start, limit, where);
				return list;
			
		
	}
	//查询账户
	public Xianlu selectXianlunameBean(String s){
		return xianluDao.selectXianluBean(s);
	}
}
