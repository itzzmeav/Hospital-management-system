/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bikky
 */
import java.sql.*;
import javax.swing.JOptionPane;


public class javaconnect {
    Connection conn;

public static Connection ConnectDb()
{

	try
	{

		Class.forName("org.sqlite.JDBC");
		Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Bikky\\Desktop\\New folder\\sis\\hospitalm.db");
		return conn;
	}

	catch(Exception e)
	{
		JOptionPane.showMessageDialog(null,e);
		return null;
	}
}
}