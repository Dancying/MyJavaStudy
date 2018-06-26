package chapter9;

public class hero {
	String name;		//成员变量
	
	public void test01() {
		System.out.println(name);		//null
	}
	
		
	public static void main(String[] args) {
		new hero().test01();		//匿名调用
	}

}
