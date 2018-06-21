package chapter9;

/**
 * 包装类
 * 
 * @author 一本正经修仙
 * @version 1.0
 * @time 2018年6月17日下午4:28:06
 */
public class test03 {

	public static void main(String[] args) {

//		Book book1 = new Book("装逼大全", "16-56", 99, 5);
//		Book book2 = new Book("装逼大全", "16-56", 99, 5);
//		System.out.println(book1 == book2); // 分配的是两个不同的地址

		 Integer num1 = 100;
		 Integer num2 = 200;
		 System.out.println(num1.compareTo(num2));	//小于输出-1；大于输出1；等于输出0

		 
		 
		// double num = 3.14;
		//
		// // 装箱
		// Double dNum0 = 3.14;
		// Double dNum1 = new Double(num);
		// Double dNum2 = num; // 自动装箱
		//
		// // 拆箱
		// num = dNum0; // 自动拆箱
		// num = dNum1.doubleValue();
		//
		// System.out.println(num);
		// System.out.println(dNum1 + "\t" + dNum1 + "\t" + dNum1);

	}

}
