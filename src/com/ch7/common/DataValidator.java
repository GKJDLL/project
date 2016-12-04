package com.ch7.common;

import java.util.regex.Pattern;

/**
 * @author dalin
 *������֤��
 */
public class DataValidator {
	/**
	 * ��֤�ַ����Ƿ�Ϊ��
	 * @param input
	 * @return
	 */
	public static boolean isNullOrEmpty(String input){
		return "".equals(input)||input==null;
	}
	/**
	 * ƥ��������ʽ
	 * @param input--->��Ҫ����ƥ����ַ���
	 * @param pattern--->������ʽ
	 * @return
	 */
	public static boolean regexMatch(String input,String pattern){
		if(isNullOrEmpty(input)){
			return false;
		}
		return Pattern.compile(pattern).matcher(input).matches();
	}
	
}
