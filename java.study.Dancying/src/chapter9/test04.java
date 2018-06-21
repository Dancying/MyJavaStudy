package chapter9;

import java.util.Scanner;

public class test04 {
	
	public static boolean isDigit(char ch) {	//返回布尔型方法
		return ch >= '0' && ch <= '9';			//符合等式的时候返回值为true，否则为false
		
	}
	
	public static void main(String[] args) {

		boolean isDigit = true;
		System.out.println("输入字符:");
		@SuppressWarnings("resource")
		String value = new Scanner(System.in).next();
		
		for (int i = 0; i < value.length(); i++) {
			
			if(!Character.isDigit(value.charAt(i))) {		//有一个字符为非数字即为false
				isDigit = false;
				break;
			}
	}
		//打印结果
		if (!isDigit) {		//false
			System.out.println("非纯数字");
		}else {				//true
			System.out.println("纯数字");
		}
		
		
		
		
		
		
		
		
		
	}

}
