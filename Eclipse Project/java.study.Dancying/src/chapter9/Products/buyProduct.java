package chapter9.Products;

import javax.swing.JOptionPane;

public class buyProduct {

	public static void main(String[] args) {

		double total = 0; // ���ڼ��㹺����ܽ���ʼֵΪ0
		// ʹ�ö�������
		Product[] product = new Product[3];		//new һ��product��������

		for (int i = 0; i < product.length; i++) {

			product[i] = new Product();
			product[i].setName(JOptionPane.showInputDialog("��������Ʒ����:"));
			String price = JOptionPane.showInputDialog("��������Ʒ�۸񣨵��ۣ�Ԫ��:");
			product[i].setPrice(Double.parseDouble(price)); // ��String price ת��Ϊ double price
			String count = JOptionPane.showInputDialog("�����빺������:");
			product[i].setCount(Integer.parseInt(count)); // ��String count ת��Ϊ int count

			total += product[i].getPrice() * product[i].getCount();	//�����ܼ۸�
		}

		System.out.println("��Ʒ�嵥����:");
		System.out.println("����\t���ۣ�Ԫ��\t����");
		for (int i = 0; i < product.length; i++) {
			System.out.println(product[i].getName() + "\t" + product[i].getPrice() + "\t" + product[i].getCount());
		}
		
		System.out.println("��Ʒ���ܼ۸���:" + total + "Ԫ");
	}

}
