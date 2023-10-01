package com.linkedin.tcsCourse.learning_jdbc;
import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        DatabaseConnectionManager dcm= new DatabaseConnectionManager("localhost", "employee_db", "root", "root");
        
        try {
        	Connection con =dcm.getConnection();
        	Statement stmnt= con.createStatement();
        	ResultSet rs=stmnt.executeQuery("SELECT COUNT(*) FROM employee");
        	while(rs.next()) {
        		System.out.println(rs.getInt(1));
        		
        	}
        }catch(SQLException sq) {
        	sq.printStackTrace();
        }
    }
}
