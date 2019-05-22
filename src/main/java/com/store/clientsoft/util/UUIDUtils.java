package com.store.clientsoft.util;

import java.util.UUID;

public class UUIDUtils {
	/** 
     * ���һ��UUID 
     * @return String UUID 
     */ 
    public static String getUUID(){ 
        String s = UUID.randomUUID().toString(); 
        //ȥ����-������ 
        return s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24); 
    } 
    /** 
     * ���ָ����Ŀ��UUID 
     * @param number int ��Ҫ��õ�UUID���� 
     * @return String[] UUID���� 
     */ 
    public static String[] getUUID(int number){ 
        if(number < 1){ 
            return null; 
        } 
        String[] ss = new String[number]; 
        for(int i=0;i<number;i++){ 
            ss[i] = getUUID(); 
        } 
        return ss; 
    } 
}
