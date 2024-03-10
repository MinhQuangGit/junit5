package vn.com.poly.util;

import java.util.UUID;

public class Uuid {
    public static String uuid () {
       return UUID.randomUUID().toString();
    }
}
