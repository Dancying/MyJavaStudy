package chapter9;

/**
 * ͼ�����--��װ��ͼ��Ĺ���
 * 
 * @author һ����������
 * @version 1.0
 * @time 2018��6��17������2:58:06
 */
public class BookBiz {
	
	/**
	 * �����鼮
	 * 
	 * @param book
	 *            Ҫ���۵��鼮
	 * @return �����۷���1���������۷���-1.
	 */
	public int sellBook(Book book) {
		if (book.getCount() < 0) {
			return -1;
		}else {
			book.setCount(book.getCount() - 1);
			return 1;
		}

	}

}
