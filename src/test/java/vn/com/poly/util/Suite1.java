package vn.com.poly.util;

import org.junit.jupiter.api.Test;

public class Suite1 {
    private final String message = "Suite 1";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    void subString() {
        System.out.println(messageUtil.getMessage());
    }
}