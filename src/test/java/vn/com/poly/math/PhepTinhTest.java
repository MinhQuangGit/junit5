package vn.com.poly.math;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class PhepTinhTest {
    private static HashMap<String, String> accounts = new HashMap<>();

    @BeforeEach
    public void setUp() {
        System.out.println("start - up");
    }

    @AfterEach
    public void rollBack () {
        System.out.println("roll back afferEach");
    }

    @AfterAll
    public static void rollBackAll () {
        System.out.println("roll back all");
    }

    @BeforeAll
    public static void beforeAllSetUp() {
        accounts.put("hauhoang", "123");
        accounts.put("hauhoang1", "abc");
        accounts.put("hauhoang2", "xyz");
    }

    @Disabled
    @Test
    void phepTong_Success() {
        var expect = 4;
        Assertions.assertEquals(expect, PhepTinh.phepTong(1, 3));
    }

    void tong_throwNullPointException() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            PhepTinh.Tong(0, null);
        });
    }

    @Test
    void phepTong_Failed_When_Input_null() {
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            PhepTinh.phepTong(0, 0);
        });
        var result = Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            PhepTinh.phepTong(0, 0);
        });

        Assertions.assertEquals("input invalid", result.getMessage());
    }

    @Test
    void phepTru_Success() {
        var expect = 2;
        Assertions.assertEquals(expect, PhepTinh.phepTru(4, 2));
    }

    @Test
    void validate_Success_return_True() {
        String user = "hau hoang";
        String password = "123";
        Assertions.assertEquals(true, PhepTinh.validate(user, password));
        Assertions.assertTrue(PhepTinh.validate(user, password));
    }

    @Test
    void validate_Success_return_Failed() {
        String user = "hau hoang";
        String password = "";
        Assertions.assertEquals(false, PhepTinh.validate(user, password));
        Assertions.assertFalse(PhepTinh.validate(user, password));
    }

    @Test
    void login_Success() {
        Assertions.assertEquals("login success" , PhepTinh.login(accounts, "hauhoang", "123"));
    }
}