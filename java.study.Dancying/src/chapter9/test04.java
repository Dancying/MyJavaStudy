package chapter9;

import java.util.Scanner;

public class test04 {
	
	public static boolean isDigit(char ch) {	//���ز����ͷ���
		return ch >= '0' && ch <= '9';			//���ϵ�ʽ��ʱ�򷵻�ֵΪtrue������Ϊfalse
		
	}
	
	public static void main(String[] args) {

		boolean isDigit = true;
		System.out.println("�����ַ�:");
		@SuppressWarnings("resource")
		String value = new Scanner(System.in).next();
		
		for (int i = 0; i < value.length(); i++) {
			
			if(!Character.isDigit(value.charAt(i))) {		//��һ���ַ�Ϊ�����ּ�Ϊfalse
				isDigit = false;
				break;
			}
	}
		//��ӡ���
		if (!isDigit) {		//false
			System.out.println("�Ǵ�����");
		}else {				//true
			System.out.println("������");
		}
		
		
		
		
		
		
		
		
		
	}

}
