package chapter9;
/**
 * book封装的测试
 * @author 一本正经修仙
 * @version 1.0
 * @time 2018年6月17日下午3:14:01
 */
public class BookTest {
	
	public static void main(String[] args) {
		/**	实例化对象*/
		Book book = new Book("装逼大全", "156-4622", 998, 5);
		/**	实例化BookBiz*/
		BookBiz bookbiz = new BookBiz();
		/**	调用BookBiz中的sell方法*/
		bookbiz.sellBook(book);
		/**	输出结果*/
		System.out.println(book.getCount());
	
	
	}

}
