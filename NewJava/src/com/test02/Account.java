package com.test02;

public class Account {

	private String account;
	private int balance;
	private double interestRate;
	
	Account(){}
	Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	
	double calculateInterest () {
		//현재 잔액 기준 이자 계산
		return balance * interestRate *0.01;
	}
	
	void deposit(int money) {
		//입금으로 증액
		balance += money;
	}
	
	void withdraw(int money) {
		//출금으로 감액
		balance -= money;
	}
	
}
