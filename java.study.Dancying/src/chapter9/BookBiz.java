package chapter9;

/**
 * 图书管理--封装对图书的管理
 * 
 * @author 一本正经修仙
 * @version 1.0
 * @time 2018年6月17日下午2:58:06
 */
public class BookBiz {
	
	/**
	 * 销售书籍
	 * 
	 * @param book
	 *            要销售的书籍
	 * @return 可销售返回1，不可销售返回-1.
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
