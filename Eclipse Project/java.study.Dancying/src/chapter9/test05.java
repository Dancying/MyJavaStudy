package chapter9;
/**
 * String �˽�
 * @author һ����������
 * @version 1.0
 * @time 2018��6��20������11:22:51
 */
public class test05 {
	
	public static void main(String[] args) {
		//���õ�String��������
		String str1 = "hello world";
		String str2 = new String();		//�൱����ʵ�����ࣻ��������һ�����ַ���
		String str3 = new String(str1);	//ͨ��ԭ�е��ַ��������µ��ַ���
		//����char���鴴���ַ���
		char[] chArray = {'h', 'e', 'l', 'l', 'o'};
		String str4 = new String(chArray);
		//�����ֽ��½��ַ���
		byte[] byteArray = {65,67,88,67,70};		//�ֽڵ�ȡֵ��Χ[-128,127],��΢��һ��
		String str5 = new String(byteArray);
		
		System.out.println(str1 + "\n" + str2 + "\n" + str3 + "\n" + str4 + "\n" + str5);
		
		
		
//		String value = "�й������ž�";
//		System.out.println(value.hashCode());
//		value += "��ţ����";
//		value = value.concat("��ţ����");
//		System.out.println(value);
//		System.out.println(value.hashCode());
		
		
			
//		String value1 = "�й������ž�";
//		System.out.println(value1.hashCode());
//		String value2 = "�й������ž�";
//		System.out.println(value2.hashCode());
//		System.out.println(value1 == value2);	//���Ϊtrue ->�ַ���һ�������Ͳ����Ըı�
		
	}

}
