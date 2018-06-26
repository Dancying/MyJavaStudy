package Dancying.java.study.chapter9;


public class StringDemo {

    public static void main(String[] args) {

/*        //String 类调试
        String str = new String("hello");
        str = str.concat(" word");
        System.out.println(str);
        System.out.println(str.hashCode());*/

        int num1 = 10;
        int num2 = 20;
        int[] nums = {10, 20};
        Swap(nums);
        System.out.println(nums[0] + "\t" + nums[1]);




    }

    public  static void Swap(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;
    }


}
