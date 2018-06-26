package chapter9;
/**
 * 测试
 * @author 一本正经修仙
 * @version 1.0
 * @time 2018年6月17日下午3:46:28
 */
public class test02 {

	public static void main(String[] args) {
		Demo demo = new Demo();
		Swap(demo);

		System.out.println(demo.attr1 + "\t" + demo.attr2);

	}

	static class Demo {

		int attr1 = 10;
		int attr2 = 50;

	}

	public static void Swap(Demo demo) {
		//demo = new Demo();				//在局部新建内存空间
		int temp = demo.attr1;
		demo.attr1 = demo.attr2;
		demo.attr2 = temp;
	}

}
