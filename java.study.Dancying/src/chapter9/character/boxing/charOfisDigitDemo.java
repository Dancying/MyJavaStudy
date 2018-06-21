package chapter9.character.boxing;

import java.util.Scanner;

/**
 * Character.isDigit		-->	判断字符是否为数字
 * @author 一本正经修仙
 * @version 1.0
 * @time 2018年6月19日下午3:24:09
 */
public class charOfisDigitDemo {
	//Character.isDigit方法
	public static boolean isDigit(char ch) {
		if(ch >= '0' && ch <= '9') {
			return true;
		}else {
			return false;
		}
		
		//return ch >= '0' && ch <= '9';
	}
	
	public static void main(String[] args) {
		boolean isDigit = true;
		System.out.print("输入:");
		@SuppressWarnings("resource")
		String value = new Scanner(System.in).next();
		for (int i = 0; i < value.length(); i++) {
			if(!isDigit(value.charAt(i))) {
				isDigit = false;
				break;
			}
		}
		
		if(isDigit) {
			System.out.println("全是数字");
		}else {
			System.out.println("不全是数字");
		}
		
	}

}
