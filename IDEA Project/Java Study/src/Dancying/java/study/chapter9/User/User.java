package Dancying.java.study.chapter9.User;

import java.util.Scanner;

/**
 * @author Dancying
 * @version 1.0.0
 * @time 2018/6/24 23:35
 * @todo 验证用户输入的用户名和密码的正确性
 */
public class User {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        UserProperty user = new UserProperty();
        System.out.print("请输入用户名：");
        user.setUserName(input.next());
        if (UserUtility.isCorrectUserName(user.getUserName()))
            System.out.println("用户名合法。");
        else
            System.out.println("用户名不合法！");
        System.out.print("请输入密码：");
        user.setUserPassword(input.next());
        if (!(UserUtility.passwordPower(user.getUserPassword()) == "")) {
            System.out.print("密码强度：" + UserUtility.passwordPower(user.getUserPassword()));
        }else
            System.out.print("密码不合法！");





    }
}
