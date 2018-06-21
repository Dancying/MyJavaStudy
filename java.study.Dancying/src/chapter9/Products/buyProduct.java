package chapter9.Products;

import javax.swing.JOptionPane;

public class buyProduct {

	public static void main(String[] args) {

		double total = 0; // 用于计算购买的总金额，初始值为0
		// 使用对象数组
		Product[] product = new Product[3];		//new 一个product对象数组

		for (int i = 0; i < product.length; i++) {

			product[i] = new Product();
			product[i].setName(JOptionPane.showInputDialog("请输入商品名称:"));
			String price = JOptionPane.showInputDialog("请输入商品价格（单价：元）:");
			product[i].setPrice(Double.parseDouble(price)); // 将String price 转换为 double price
			String count = JOptionPane.showInputDialog("请输入购买数量:");
			product[i].setCount(Integer.parseInt(count)); // 将String count 转换为 int count

			total += product[i].getPrice() * product[i].getCount();	//计算总价格
		}

		System.out.println("商品清单如下:");
		System.out.println("名称\t单价（元）\t数量");
		for (int i = 0; i < product.length; i++) {
			System.out.println(product[i].getName() + "\t" + product[i].getPrice() + "\t" + product[i].getCount());
		}
		
		System.out.println("商品的总价格是:" + total + "元");
	}

}
