package com.mirza.classes;

import java.sql.SQLException;

import com.mirza.iterfaces.BankAccountService;

public class BankAccountServiceImpl implements BankAccountService {
	BankAccountepositoryImpl bankac=null;
	@Override
	public double withdraw(long accountId, double balance) throws SQLException {
		// TODO Auto-generated method stub
		bankac=new BankAccountepositoryImpl();
		if(balance<=bankac.getBalance(accountId)) {
			balance=balance-bankac.getBalance(accountId);
		}
		else {
			System.out.println("insufficient balance");
			return 0;
		}
		return 0;
	}

	@Override
	public double deposit(long accountId, double balance) throws SQLException {
		// TODO Auto-generated method stub
		bankac=new BankAccountepositoryImpl();
		bankac.updateBalance(accountId, balance);
		return 0;
	}

	@Override
	public double getBalance(long accountId) throws SQLException {
		bankac=new BankAccountepositoryImpl();
		System.out.println(bankac.getBalance(accountId));
		
		return 0;
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		// TODO Auto-generated method stub
		return false;
	}

}
