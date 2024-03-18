package vn.com.poly.service.Impl;

import javassist.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import vn.com.poly.config.HibernateConfig;
import vn.com.poly.entity.Transaction;
import vn.com.poly.service.TransactionService;

import javax.persistence.PersistenceException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    @Override
    public void create0(Transaction transaction) throws IOException {
        Session session = connect();
        session.beginTransaction();
        try {
            session.persist(transaction);
            session.getTransaction().commit();
        } catch (Exception ex) {
            throw new PersistenceException("insert failed");
        }
    }

    @Override
    public List<Transaction> getTransactions() throws IOException, SQLException {
        Session session = connect();
        session.beginTransaction();
        try {
            List<Transaction> transactions = session.createQuery("FROM transaction", Transaction.class).list();
            return transactions;
        } catch (Exception ex) {
            throw new SQLException("get transactions error");
        }
    }

    @Override
    public void delete(Long id) throws IOException {
        Session session = connect();
        session.beginTransaction();
        try {
            Transaction transaction = getTransaction(id);
            if (transaction != null) {
                session.delete(transaction);
            } else {
                throw new NotFoundException("does not exist");
            }
        } catch (Exception ex) {
            throw new PersistenceException("delete failed");
        }
    }

    @Override
    public Transaction getTransaction(Long id) throws IOException {
        Session session = connect();
        session.beginTransaction();
        try {
            Transaction transaction = session.find(Transaction.class, id);
            return transaction;
        } catch (Exception ex) {
            return null;
        }
    }

    public Session connect() throws IOException {
        Session session;
        try {
            session = HibernateConfig.getSessionFactory().openSession();
            return session;
        } catch (Exception e) {
            throw new IOException("connect failed");
        }
    }
}
