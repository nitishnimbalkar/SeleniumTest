package com.scp.scoopen.Selenium_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
		Statement stm = con.createStatement();
		ResultSet records= stm.executeQuery("select * from customer");
		while(records.next())
		{
			System.out.println(records.getInt(1)+" - "+records.getString(2)+" - "+
			Long.parseLong(records.getString(4)));
		}		
	}
}
