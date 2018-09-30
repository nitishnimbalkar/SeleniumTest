package com.scp.scoopen.Selenium_Demo;

import java.sql.*;

public class TestDBConnection 
{
	static final String DriverLocation="oracle.jdbc.driver.OracleDriver";
	static final String DB_URL="jdbc:oracle:thin:@localhost:1521:xe";
	static final String userName="system"; 
	static final String passWord="admin";
	
	public static void main(String[] args) throws Exception 
	{
		Class.forName(DriverLocation);
		Connection con = DriverManager.getConnection(DB_URL, userName, passWord);
		Statement st=con.createStatement();
		ResultSet records = st.executeQuery("select * from customer");
		while(records.next())
		{
			
			System.out.println(records.getInt("cust_id"));
		}
	}

}
