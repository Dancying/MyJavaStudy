package chapter9.character.boxing;

import java.util.Scanner;

/**
 * Character.isDigit		-->	�ж��ַ��Ƿ�Ϊ����
 * @author һ����������
 * @version 1.0
 * @time 2018��6��19������3:24:09
 */
public class charOfisDigitDemo {
	//Character.isDigit����
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
		System.out.print("����:");
		@SuppressWarnings("resource")
		String value = new Scanner(System.in).next();
		for (int i = 0; i < value.length(); i++) {
			if(!isDigit(value.charAt(i))) {
				isDigit = false;
				break;
			}
		}
		
		if(isDigit) {
			System.out.println("ȫ������");
		}else {
			System.out.println("��ȫ������");
		}
		
	}

}
