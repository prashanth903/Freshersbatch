package com.mirza.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mirza.accountDetails.BankAccount;

import com.mirza.interfacees.BankAccountRepository;

public class BankAccountepositoryImpl implements BankAccountRepository{

	@Override
	public double getBalance(long accountId) throws SQLException {
		String query="select * from bank";
		BankAccount acc=null;
		double bal = 0;
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		ResultSet resultSet=pStatement.executeQuery();
		while(resultSet.next()) {
			acc=new BankAccount();
			bal=resultSet.getDouble("balance");
		}
		return bal;
	}

	@Override
	public void updateBalance(long accountId, double newBalance) throws SQLException {
		String query="insert into bank values(?)";
		Connection conn =ConnectionFactory.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setDouble(1,newBalance);
		 pStatement.executeUpdate();
		
	}
	}
	

