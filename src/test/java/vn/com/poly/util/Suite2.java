package vn.com.poly.util;

import org.junit.jupiter.api.Test;

public class Suite2 {
    private final String message = "Suite 2";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    void uuid() {
        System.out.println(messageUtil.getMessage());
    }
}