package vn.com.poly.service;

import vn.com.poly.entity.Transaction;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface TransactionService {
    void create0(Transaction transaction) throws IOException;
    List<Transaction> getTransactions() throws IOException, SQLException;
    void delete(Long id) throws IOException;
    Transaction getTransaction(Long id) throws IOException;
}
