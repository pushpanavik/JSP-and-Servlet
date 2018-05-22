package com.bridgeit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bridgeit.model.LoginPojo;

public class LoginDao {
public static boolean validateUser(LoginPojo log)  {
		
		boolean status=false;
		Connection con=JdbcConnection.establishConnection();
		
		
		try {
		
			PreparedStatement preparedStatement = con.prepareStatement("select email,password from loginAuthentication where email=? and password=?");
			
		preparedStatement.setString(1,log.getEmail());
		preparedStatement.setString(2,log.getPassword());

		ResultSet resultSet = preparedStatement.executeQuery();
		status=resultSet.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
}
