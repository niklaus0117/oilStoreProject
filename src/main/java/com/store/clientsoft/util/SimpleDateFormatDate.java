package com.store.clientsoft.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class SimpleDateFormatDate {
	
	/*
	 * 鑾峰彇绯荤粺褰撳墠鏃堕棿杩斿洖date
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
	 * 鑾峰彇褰撳墠鏃堕棿杩斿洖string
	 */
	public String StringInfo(){
		SimpleDateFormat df=new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str=df.format(new Date());		
		return str;
	}
	/*
	 * 鑾峰彇褰撳墠鏃堕棿杩斿洖string
	 */
	public String StringYMDInfo(){
		SimpleDateFormat df=new  SimpleDateFormat("yyyy-MM-dd");
		String str=df.format(new Date());		
		return str;
	}
	/*
	 * 鑾峰彇褰撳墠鏃堕棿杩斿洖string
	 */
	public String DateToStrYear(){
		SimpleDateFormat df=new  SimpleDateFormat("yyyy");
		String str=df.format(new Date());	
		return str;
	}
	/*
	 * 鑾峰彇褰撳墠鏃堕棿杩斿洖string
	 */
	public String DateToStrMonth(){
		SimpleDateFormat df=new  SimpleDateFormat("yyyy-MM");
		String str=df.format(new Date());	
		return str;
	}
	
	/*
	 * Date鏃堕棿鏍煎紡杞垚String
	 */
	public String DateToString(Date date){
		SimpleDateFormat df=new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str=df.format(date);		
		return str;
	}
	/*
	 * String鏃堕棿鏍煎紡杞垚date
	 */
	
	public Date StringToData(String dateStr){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//灏忓啓鐨刴m琛ㄧず鐨勬槸鍒嗛挓   		
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
	 * 褰撳墠鏃堕棿鐨勭煭鏃堕棿鏍煎紡杞崲鎴怱tring
	 */
	public String dateToString(){
		Date date=new Date();
		SimpleDateFormat df=new SimpleDateFormat("HH:mm:ss");
		String str=df.format(date);
		return str;
	}
	
	/*
	 * 褰撳墠鏃堕棿鐨勭煭鏃堕棿鏍煎紡杩斿洖Date
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
	 * String鐭椂闂存牸寮忚浆鎴恉ate
	 */
	
	public Date StringTodata(String dateStr){
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");//灏忓啓鐨刴m琛ㄧず鐨勬槸鍒嗛挓   		
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
	 * String杞垚yyyy-MM-DD鐭椂闂�
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