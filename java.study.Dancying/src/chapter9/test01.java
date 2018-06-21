package chapter9;
/**
 * 引用方法
 * @author 一本正经修仙
 * @version 1.0
 * @time 2018年6月17日下午2:45:46
 */
public class test01 {
	
	public static void main(String[] args) {
		
		
		int[] nums = {1, 2};
		Swap(nums);
		System.out.println(nums[0] + "\t" + nums[1]);	//第一个Swap
	}
	
	
	public static void Swap(int[] nums) {		//nums[] 数组=>引用对象
		int temp = nums[0];
		nums[0] = nums[1];
		nums[1] = temp;
	}
	
	
	public static void Swap(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}
	
	
	

}
