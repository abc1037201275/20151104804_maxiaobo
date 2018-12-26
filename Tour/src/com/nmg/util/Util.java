package com.nmg.util;




import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.nmg.entity.Manager;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.nmg.dao.ManagerDao;






public class Util {
	
	public static String getTime2(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		return sdf.format(date.getTime());
	}

	
	public static String getTime(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		return sdf.format(date.getTime());
	}
	
	public static String getTime3(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(date);
		return s;
	}
	
	
	public static Date getTime4(String s) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date ss = sdf.parse(s);
		return ss;
	}


		 public static void copyFile2(String srcPath, String destPath) throws Exception {
		        
		        // 打开输入流
		        FileInputStream fis = new FileInputStream(srcPath);
		        // 打开输出流
		        FileOutputStream fos = new FileOutputStream(destPath);
		        
		        // 读取和写入信息
		        int len = 0;
		        // 创建一个字节数组，当做缓冲区
		        byte[] b = new byte[1024];
		        while ((len = fis.read(b)) != -1) {
		            fos.write(b);
		        }
		        
		        // 关闭流  先开后关  后开先关
		        fos.close(); // 后开先关
		        fis.close(); // 先开后关
		        
		    }
	

	
	//增加天数
	public static String addDay(String riqi,int shuliang) throws ParseException  {
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Calendar c = Calendar.getInstance();
		
		c.setTime(df.parse(riqi));
		
		c.add(Calendar.DATE, shuliang); 
		return df.format(c.getTime());
	}
	
	public static void main(String[] args) throws ParseException {
		System.out.println(Util.addDay("2013-08-23 11:45:00", 50));
	}
	
}
