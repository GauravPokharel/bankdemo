package com.bank.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tbl_account_transactions")
public class AccountTransaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="account_id")
	private Account accountId;
	@Column(name="transaction_type_id")
	private MasterTransactionType transactionTypeId;
	private double amount;
	private boolean cashBackApplicable;
	private String status;
}
