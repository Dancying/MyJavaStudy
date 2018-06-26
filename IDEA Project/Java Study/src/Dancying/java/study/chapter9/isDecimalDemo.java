package Dancying.java.study.chapter9;

import java.util.Scanner;

/**
 * @author Dancying
 * @version 1.0.0
 * @time 2018/6/24 16:02
 * @todo 一个数据中最多只能有一个小数点
 */
public class isDecimalDemo {

    /**
     * 检查一个数据中只能有最多一个小数点符号
     *
     * @param str 要进行判断的数据
     * @return 符合返回true，否则返回false
     */
    public static boolean isDecimal(String str) {
        boolean isDecimal = true;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                if (str.charAt(i) == '.') {
                    if (i == 0 || i == str.length() - 1) {
                        isDecimal = false;
                        break;
                    }
                } else {
                    isDecimal = false;
                    break;
                }
            }
        }
        //如果存在小数点，并且只有一个才是合法   str.contains(".") ==> true
        if (str.contains(".") && !(str.indexOf(".") == str.lastIndexOf("."))) isDecimal = false;
        return isDecimal;
    }

    public static void main(String[] args) {
        System.out.print("请输入一个数据:");
        boolean isDecimal = isDecimal(new Scanner(System.in).next());
        if (isDecimal) {
            System.out.print("合法的数据");
        } else {
            System.out.print("非法的数据！");
        }


    }

}
