package vn.com.poly.service.Impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vn.com.poly.entity.Transaction;

import java.io.IOException;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TransactionServiceImplTest {
private TransactionServiceImpl transactionService = new TransactionServiceImpl();
    @Test
    void create0() throws IOException {
        Date timeNow = new Date();
        Transaction transaction = new Transaction();
        transaction.setId(1L);
        transaction.setCreatedAt(timeNow);
        transaction.setTransactionId("FT9999");
        transaction.setAmount(100);
        transaction.setDescription("test");
        transactionService.create0(transaction);
    }
}