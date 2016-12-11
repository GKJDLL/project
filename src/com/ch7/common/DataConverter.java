package com.ch7.common;

import java.text.SimpleDateFormat;
import java.util.Date;




/**
 * @author dalin
 *����ת����
 */
public class DataConverter {
	/**���ڸ�ʽ��Ϊ�ַ���
	 * @param date
	 * @return
	 */
	public static String dataToString(Date date){
		return dataToString(date,"yyyy-MM-dd HH:mm:ss");
		
	}
	public static String dataToString(Date date,String formatType){
		if(date==null){
			date=Utilty.getNowDateTime();
		}
		SimpleDateFormat formatter=new SimpleDateFormat(formatType);
		return formatter.format(date);
	}
	
	/**
	 * �ַ���ת��Ϊʱ��
	 * @param input
	 */
	public static Date toDate(String input){
		return toDate(input,"yyyy-MM-dd HH:mm:ss");
	}
	public static Date toDate(String input,String formatType){
		SimpleDateFormat format=new SimpleDateFormat(formatType);
		Date dt=new Date();
		if(DataValidator.isNullOrEmpty(input)){
			return dt;
		}
		try{
			dt=format.parse(input);
		}catch(Exception e){
			
		}
		return dt;
	}
	/**
	 * �ַ���ת��Ϊ�����ڸ�ʽ
	 * @param input
	 * @return
	 */
	public static java.util.Date toShortDate(String input){
		return toDate(input,"yyyy-MM-dd");
	}
	
	/**
	 * �ַ���ת��Ϊ�����ڸ�ʽ
	 * @param input
	 * @return
	 */
	public static java.util.Date toFullDate(String input) {
		// TODO Auto-generated method stub
		return toDate(input,"yyyy-MM-dd HH:mm:ss");
	}
	
	/**
	 * �ַ���ת��Ϊ���ͣ�����ͷ���0
	 * @param input
	 * @return
	 */
	public static int toInt(String input){
		try{
		return Integer.parseInt(input);
		}catch(Exception e){
			return 0;
		}
	}
}
