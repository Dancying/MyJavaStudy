package chapter9;
/**
 * book��װ�Ĳ���
 * @author һ����������
 * @version 1.0
 * @time 2018��6��17������3:14:01
 */
public class BookTest {
	
	public static void main(String[] args) {
		/**	ʵ��������*/
		Book book = new Book("װ�ƴ�ȫ", "156-4622", 998, 5);
		/**	ʵ����BookBiz*/
		BookBiz bookbiz = new BookBiz();
		/**	����BookBiz�е�sell����*/
		bookbiz.sellBook(book);
		/**	������*/
		System.out.println(book.getCount());
	
	
	}

}
