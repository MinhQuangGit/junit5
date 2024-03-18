package vn.com.poly.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    private Long id;
    @Column(name = "AMOUNT")
    private int amount;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "TRANSACTION_ID")
    private String transactionId;
    @Column(name = "UPDATED_BY")
    private String updatedBy;
    @Column(name = "UPDATED_AT")
    private Date updatedAt;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATED_AT")
    private Date createdAt;
}
