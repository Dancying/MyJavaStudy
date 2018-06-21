package chapter9.character.boxing;

import java.util.Scanner;

/**
 * Character.isLetterOrDigit		-->	判断字符是否是字母或者数字
 * @author 一本正经修仙
 * @version 1.0
 * @time 2018年6月19日下午3:38:24
 */
public class charOfisLetterOrDigitDemo {
	
	public static boolean isLetterOrDigit(char ch) {
		if(ch >= '0' && ch <= '9') {
			return true;
		}else if(ch >= 'a' && ch <= 'z') {
			return true;
		}else if(ch >= 'A' && ch <= 'Z') {
			return true;
		}else {
			return false;
		}
		
		
		//return ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z';
	}
	
	public static void main(String[] args) {
		boolean isLetterOrDigit = true;
		System.out.print("输入:");
		@SuppressWarnings("resource")
		String value = new Scanner(System.in).next();
		for (int i = 0; i < value.length(); i++) {
			if(!isLetterOrDigit(value.charAt(i))) {
				isLetterOrDigit = false;
				break;
			}
		}
		
		if(isLetterOrDigit) {
			System.out.println("数字+字母");
		}else {
			System.out.println("非 数字+字母");
		}
		
	}

}
