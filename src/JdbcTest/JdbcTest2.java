package JdbcTest;

import java.sql.*;

public class JdbcTest2 {
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/jdbcsample?serverTimezone=Asia/Taipei";
	public static final String USER = "root";
	public static final String PASSWORD = "aA756421!!";
	
	public static void main(String[] args) {
		try {
			Class.forName(DRIVER);
			System.out.println("載入成功");
			
			Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
			System.out.println("連線成功");
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException se) {
			
		}
		
		
		
	}
}
