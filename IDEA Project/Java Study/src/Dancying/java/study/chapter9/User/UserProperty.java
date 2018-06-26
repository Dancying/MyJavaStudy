package Dancying.java.study.chapter9.User;

/**
 * @author Dancying
 * @version 1.0.0
 * @time 2018/6/24 23:37
 * @todo 用户的属性：用户名、密码、邮箱等
 */
public class UserProperty {

    public static String userName;
    public static String userPassword;
    public static String userEmail;

    public UserProperty() {
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        UserProperty.userName = userName;
    }

    public static String getUserPassword() {
        return userPassword;
    }

    public static void setUserPassword(String userPassword) {
        UserProperty.userPassword = userPassword;
    }

    public static String getUserEmail() {
        return userEmail;
    }

    public static void setUserEmail(String userEmail) {
        UserProperty.userEmail = userEmail;
    }
}
