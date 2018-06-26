package Dancying.java.study.chapter9.User;

/**
 * @author Dancying
 * @version 1.0.0
 * @time 2018/6/24 23:45
 * @todo 封装用户名、密码、邮箱的校验
 */
public class UserUtility {

    /**
     * 校验用户名是否合法
     * 用户名不能包含除了 "_" 和 "-" 的其他特殊符号
     * 长度为6 - 10 位
     *
     * @param userName 将要校验的用户名
     * @return 用户名合法返回true，不合法返回false
     */
    public static boolean isCorrectUserName(String userName) {
        boolean isCorrectUserName = true;
        if (userName.length() >= 3 && userName.length() <= 10) {
            for (int i = 0; i < userName.length(); i++) {
                if (!Character.isLetterOrDigit(userName.charAt(i))) {
                    if (!(userName.charAt(i) == '_')) {
                        if (!(userName.charAt(i) == '-')) {
                            isCorrectUserName = false;
                            break;
                        }
                    }
                }
            }
        } else isCorrectUserName = false;
        return isCorrectUserName;
    }

    /**
     * 校验密码的合法性
     * 密码长度为6 - 16位 数字 或者 字母 或者 符号 的组合
     * 除了 "-" "_" "$" "@" "!"外不能包含其他特殊符号
     *
     * @param userPassword 要进行校验的密码
     * @return 密码合法返回true，非法返回false
     */
    public static boolean isCorrectUserPassword(String userPassword) {
        boolean isCorrectUserPassword = true;
        char[] validSymbol = {'-', '_', '!', '@', '$'};
        if (userPassword.length() >= 6 && userPassword.length() <= 16) {  //合法的密码长度
            for (int i = 0; i < userPassword.length(); i++) {
                if (!Character.isLetterOrDigit(userPassword.charAt(i))) {
                    for (int j = 0; j < validSymbol.length; j++) {
                        if (userPassword.charAt(i) == validSymbol[j]) {
                            isCorrectUserPassword = true;
                            break;
                        } else isCorrectUserPassword = false;
                    }
                    if (isCorrectUserPassword) continue;
                    else break;
                }
            }
        } else isCorrectUserPassword = false;
        return isCorrectUserPassword;
    }

    /**
     * 密码强度判断
     * 单纯的只有数字的强度为  ★☆☆☆☆
     * 单纯的只有字母的强度为  ★★☆☆☆
     * 同时包含数字和字母的密码强度为  ★★★☆☆
     * 包含数字或者字母中的一种同时有特殊符号的强度为  ★★★★☆
     * 同时包含字母、数字、特殊符号的强度为   ★★★★★
     * 不能全是特殊符号！
     *
     * @param userPassword
     * @return
     */
    public static String passwordPower(String userPassword) {
        String passwordPower = "";       //密码强度
        char[] validSymbol = {'-', '_', '!', '@', '$'};     //只能包含的符号类型
        int countOfDigit = 0;       //密码中数字的个数
        int countOfLetter = 0;      //密码中字母的个数
        int countOfSymbol = 0;      //密码中符号的个数
        for (int i = 0; i < userPassword.length(); i++) {
            if (Character.isLetterOrDigit(userPassword.charAt(i))) {
                if (Character.isDigit(userPassword.charAt(i))) {
                    countOfDigit++;
                    if (countOfDigit == userPassword.length()) {
                        passwordPower = "★☆☆☆☆";
                        break;
                    }
                } else if (Character.isLetter(userPassword.charAt(i))) {
                    countOfLetter++;
                    if (countOfLetter == userPassword.length()) {
                        passwordPower = "★★☆☆☆";
                        break;
                    }
                }
                if (countOfDigit + countOfLetter == userPassword.length())
                    if (countOfDigit > 0 || countOfLetter > 0) {
                        passwordPower = "★★★☆☆";
                        break;
                    }
            } else {        //不是数字或者字母 ==>  只能其他字符或者特殊字符
                for (int j = 0; j < validSymbol.length; j++) {
                    if (userPassword.charAt(i) == validSymbol[j]) {
                        countOfSymbol++;
                        break;
                    }
                }
                if (countOfSymbol == 0) {
                    System.out.print("包含了不允许的字符！");
                    break;
                } else if (countOfDigit + countOfLetter + countOfSymbol == userPassword.length()) {
                    if (countOfDigit + countOfSymbol == userPassword.length()) {
                        passwordPower = "★★★★☆";
                        //break;
                    } else if (countOfLetter + countOfSymbol == userPassword.length()) {
                        passwordPower = "★★★★☆";
                        //break;
                    } else if (countOfSymbol == userPassword.length()) {
                        System.out.print("密码不允许全部由字符组成！");
                    } else if (countOfDigit > 0 && countOfLetter > 0 && countOfSymbol > 0) {
                        passwordPower = "★★★★★";
                        //break;
                    }
                }
            }
        }
        return passwordPower;
    }


}