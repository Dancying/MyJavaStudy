package chapter9.character.boxing;

import java.util.Scanner;

/**
 * Character.isLetter --> �����ж��ַ��Ƿ�Ϊ��ĸ
 * 
 * @author һ����������
 * @version 1.0
 * @time 2018��6��19������1:23:03
 */
public class charOfLetterDemo {

	// Character.isLetter�ķ���
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
		System.out.print("����:");
		@SuppressWarnings("resource")
		String str = new Scanner(System.in).next();
		for (int i = 0; i < str.length(); i++) {
			if(!isLetter(str.charAt(i))) {		//��������ĸ�򷵻�false�����˳��жϵ�ѭ��
				isLetter = false;
				break;
			}
		}
		if(isLetter) {
			System.out.println("ȫ����ĸ");
		}else {
			System.out.println("����ȫ����ĸ");
		}
		
	}

}
