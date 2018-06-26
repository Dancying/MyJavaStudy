package chapter9;
/**
 * String 了解
 * @author 一本正经修仙
 * @version 1.0
 * @time 2018年6月20日上午11:22:51
 */
public class test05 {
	
	public static void main(String[] args) {
		//常用的String变量声明
		String str1 = "hello world";
		String str2 = new String();		//相当于是实例化类；创建的是一个空字符串
		String str3 = new String(str1);	//通过原有的字符串创建新的字符串
		//利用char数组创建字符串
		char[] chArray = {'h', 'e', 'l', 'l', 'o'};
		String str4 = new String(chArray);
		//利用字节新建字符串
		byte[] byteArray = {65,67,88,67,70};		//字节的取值范围[-128,127],稍微记一下
		String str5 = new String(byteArray);
		
		System.out.println(str1 + "\n" + str2 + "\n" + str3 + "\n" + str4 + "\n" + str5);
		
		
		
//		String value = "中国人民解放军";
//		System.out.println(value.hashCode());
//		value += "老牛逼了";
//		value = value.concat("老牛逼了");
//		System.out.println(value);
//		System.out.println(value.hashCode());
		
		
			
//		String value1 = "中国人民解放军";
//		System.out.println(value1.hashCode());
//		String value2 = "中国人民解放军";
//		System.out.println(value2.hashCode());
//		System.out.println(value1 == value2);	//结果为true ->字符串一旦创建就不可以改变
		
	}

}
