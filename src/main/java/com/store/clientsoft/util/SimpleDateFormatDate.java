package com.store.clientsoft.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class SimpleDateFormatDate {
	
	/*
	 * 获取系统当前时间返回date
	 */
	public Date DataInfo(){
		SimpleDateFormat df=new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str=df.format(new Date());
		Date date=null;
		try {
			date=df.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return date;
	}
	
	/*
	 * 获取当前时间返回string
	 */
	public String StringInfo(){
		SimpleDateFormat df=new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str=df.format(new Date());		
		return str;
	}
	/*
	 * 获取当前时间返回string
	 */
	public String StringYMDInfo(){
		SimpleDateFormat df=new  SimpleDateFormat("yyyy-MM-dd");
		String str=df.format(new Date());		
		return str;
	}
	/*
	 * 获取当前时间返回string
	 */
	public String DateToStrYear(){
		SimpleDateFormat df=new  SimpleDateFormat("yyyy");
		String str=df.format(new Date());	
		return str;
	}
	/*
	 * 获取当前时间返回string
	 */
	public String DateToStrMonth(){
		SimpleDateFormat df=new  SimpleDateFormat("yyyy-MM");
		String str=df.format(new Date());	
		return str;
	}
	
	/*
	 * Date时间格式转成String
	 */
	public String DateToString(Date date){
		SimpleDateFormat df=new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str=df.format(date);		
		return str;
	}
	/*
	 * String时间格式转成date
	 */
	
	public Date StringToData(String dateStr){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//小写的mm表示的是分钟   		
		Date date=null;
		try {
			date = sdf.parse(dateStr);
		} catch (ParseException e) {
			try {
				date=sdf.parse("0000-00-00 00:00:00");
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
		}
		return date;
	}
	/*
	 * 当前时间的短时间格式转换成String
	 */
	public String dateToString(){
		Date date=new Date();
		SimpleDateFormat df=new SimpleDateFormat("HH:mm:ss");
		String str=df.format(date);
		return str;
	}
	
	/*
	 * 当前时间的短时间格式返回Date
	 */
	public Date dateTodate(){
		SimpleDateFormat df=new SimpleDateFormat("HH:mm:ss");
		String str=df.format(new Date());
		Date date=null;
		try {
			date=df.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return date;
	}
	/*
	 * String短时间格式转成date
	 */
	
	public Date StringTodata(String dateStr){
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");//小写的mm表示的是分钟   		
		Date date=null;
		try {
			date = sdf.parse(dateStr);
		} catch (ParseException e) {
			try {
				date=sdf.parse("00:00:00");
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
		}
		return date;
	}
	/*
	 * String转成yyyy-MM-DD短时间
	 */

	public String StringYMDTtoStr(String datestr){
		SimpleDateFormat df=new  SimpleDateFormat("yyyy-MM-dd");
		Date date=null;
		try {
			date=df.parse(datestr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str=df.format(date);		
		return str;
	}
	
	
	
	
	public static void main(String[] args) throws Exception{
		String strnum="asdfgh";
		String str=strnum.substring(0,1);
		System.out.println(str);
	}

}