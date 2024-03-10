package vn.com.poly.math;

import java.util.HashMap;

public class PhepTinh {
    public static int phepTong(int a, int b) {
        if (a == 0 || b == 0) {
            throw new IndexOutOfBoundsException("input invalid");
        }
        return a + b;
    }

    public static int phepTru(int a, int b) {
        if (a == 0 || b == 0) {
            throw new IndexOutOfBoundsException("input invalid");
        }
        return a - b;
    }

    public static Boolean validate(String user, String password) {
        if (user.length() == 0 || user == null) {
            return false;
        } else if (password.length() == 0 || password == null) {
            return false;
        }
        return true;
    }

    public static String login(HashMap<String, String> user, String userName, String password) {
        if (user.containsKey(userName)) {
            if (user.get(userName).equals(password)) {
                return "login success";
            } else {
                return "login failed";
            }
        } else {
            return "user name miss math";
        }
    }
}
