package chapter9;
/**
 * ���÷���
 * @author һ����������
 * @version 1.0
 * @time 2018��6��17������2:45:46
 */
public class test01 {
	
	public static void main(String[] args) {
		
		
		int[] nums = {1, 2};
		Swap(nums);
		System.out.println(nums[0] + "\t" + nums[1]);	//��һ��Swap
	}
	
	
	public static void Swap(int[] nums) {		//nums[] ����=>���ö���
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
