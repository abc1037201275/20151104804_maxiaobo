package com.nmg.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nmg.dao.HotelDao;
import com.nmg.entity.Hotel;
import com.nmg.service.HotelService;
@Service
public class HotelServiceImpl implements HotelService{
	@Resource
	public HotelDao hotelDao;
	
	
	public HotelDao getHotelDao() {
		return hotelDao;
	}

	public void setHotelDao(HotelDao hotelDao) {
		this.hotelDao = hotelDao;
	}

	@Override
	public void insertHotelBean(Hotel bean) {
		// TODO Auto-generated method stub
		hotelDao.insertHotelBean(bean);
		
	}

	@Override
	public void deleteHotelBean(Hotel bean) {
		// TODO Auto-generated method stub
		hotelDao.deleteHotelBean(bean);
		
	}

	@Override
	public void updateHotelBean(Hotel bean) {
		// TODO Auto-generated method stub
		hotelDao.updateHotelBean(bean);
		
	}

	public Hotel selectHotelBean(String bean) {
		return hotelDao.selectHotelBean(bean);
		
	
	}

	public long selectHotelBeanCount(final String where) {
		
		long count = hotelDao.selectHotelBeanCount(where);
		return count;
	}


	public List<Hotel> selectHotelBeanList(final int start,final int limit,final String where) {
				System.out.println("jinru"+start+limit);
				List<Hotel> list = hotelDao.selectHotelBeanList(start, limit, where);
				return list;
			
		
	}
	//查询账户
	public Hotel selectHotelnameBean(String s){
		return hotelDao.selectHotelBean(s);
	}
}
