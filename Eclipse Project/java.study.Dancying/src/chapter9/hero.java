package chapter9;

public class hero {
	String name;		//��Ա����
	
	public void test01() {
		System.out.println(name);		//null
	}
	
		
	public static void main(String[] args) {
		new hero().test01();		//��������
	}

}
