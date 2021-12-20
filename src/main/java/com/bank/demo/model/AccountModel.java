package com.bank.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import com.bank.demo.model.enums.AccountType;

@Entity
public class AccountModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="account_number")
	@NotEmpty(message="Account number can not be empty")
	private String accountNumber;
	@Column(name="open_date")
	@NotEmpty(message="Open date can not be empty")
	private Date openDate;
	@Column(name="close_date")
	private Date closeDate;
	@NotEmpty(message="Balance can not be empty")
	private double balance;
	@Column(name="account_type")
	@NotEmpty(message="Account type can not be empty")
	@Enumerated(EnumType.STRING)
	private AccountType accountType;
	@NotEmpty(message="Customer can not be empty")
	private Customer customer;
}
