package randomPassword;

import java.util.Scanner;

/**
 * @author Dancying
 * @version 1.0.0
 * @time 2018/6/24 0:38
 * @todo 密码重写
 */
public class password2 {

    public static void main(String[] args) {

        String pass = "";
        int[] nums = new int[100];
        char[] ch = new char[100];

        System.out.print("请输入需要的密码长度:");
        int lentch = new Scanner(System.in).nextInt();
        for (int i = 0; i < lentch; i++) {
            int temp = -1;
            temp = (int) (Math.random() * 100 % 3);
            switch (temp) {
                case 0: //数字
                    nums[i] = (int) (Math.random() * 100 % 10);
                    break;
                case 1: //小写字母
                    ch[i] = (char) (65 + (int) (Math.random() * 100 % 26));
                    break;
                case 2: //大写字母
                    ch[i] = (char) ('A' + (int) (Math.random() * 100 % 26));
                    break;
                default:
                    continue;
            }
            if (temp == 0) {
                pass += nums[i];
            }else if (temp == 1 || temp == 2) {
                pass += ch[i];
            }else {
                continue;
            }
        }
        System.out.printf("获得密码:" + pass);


    }
}
