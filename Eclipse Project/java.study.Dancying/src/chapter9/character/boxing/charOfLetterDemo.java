package chapter9.character.boxing;

import java.util.Scanner;

/**
 * Character.isLetter --> 用来判断字符是否为字母
 * 
 * @author 一本正经修仙
 * @version 1.0
 * @time 2018年6月19日下午1:23:03
 */
public class charOfLetterDemo {

	// Character.isLetter的方法
	public static boolean isLetter(char ch) {
		//The first way
		if(ch >= 'a' && ch <= 'z') {
			return true;
		}else if(ch >= 'A' && ch <= 'Z') {
			return true;
		}else {
			return false;
		}
		//The second way
		//return ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z';
	}

	public static void main(String[] args) {

		boolean isLetter = true;
		System.out.print("输入:");
		@SuppressWarnings("resource")
		String str = new Scanner(System.in).next();
		for (int i = 0; i < str.length(); i++) {
			if(!isLetter(str.charAt(i))) {		//遇到非字母则返回false并且退出判断的循环
				isLetter = false;
				break;
			}
		}
		if(isLetter) {
			System.out.println("全是字母");
		}else {
			System.out.println("并不全是字母");
		}
		
	}

}
