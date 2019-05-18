package com.store.clientsoft.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Base64Code {

	private static BASE64Encoder encoder = new BASE64Encoder();
	private static BASE64Decoder decoder = new BASE64Decoder();
	
	/**
	 * Base64 º”√‹
	 * @param String
	 * @return String
	 */
	public static String base64encode(String s){
		try{
			String encodeStr = encoder.encode(s.getBytes());
			
			return encodeStr;
		}catch(Exception e){
			return s;
		}
	}
	
	/**
	 * Base64 Ω‚√‹
	 * @param s
	 * @return
	 */
	public static String base64decode(String s){
		try{
			String decodeStr = new String(decoder.decodeBuffer(s));
						
			return decodeStr;
		}catch(Exception e){
			return s;
		}
	}
}
