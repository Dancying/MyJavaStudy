package chapter9.character.boxing;

import java.util.Scanner;

/**
 * Character.isLetterOrDigit		-->	�ж��ַ��Ƿ�����ĸ��������
 * @author һ����������
 * @version 1.0
 * @time 2018��6��19������3:38:24
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
		System.out.print("����:");
		@SuppressWarnings("resource")
		String value = new Scanner(System.in).next();
		for (int i = 0; i < value.length(); i++) {
			if(!isLetterOrDigit(value.charAt(i))) {
				isLetterOrDigit = false;
				break;
			}
		}
		
		if(isLetterOrDigit) {
			System.out.println("����+��ĸ");
		}else {
			System.out.println("�� ����+��ĸ");
		}
		
	}

}
