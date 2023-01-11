package myphpadmin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con =null;
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			//con = (Connection)DriverManager.getConnection("jdbc:mysql://162.159.24.80/berglenz_TIMESHEETDB?user=berglenz_tsadmin&password=kalidas.87");
			con = DriverManager.getConnection("jdbc:mysql://162.159.24.80/berglenz_TIMESHEETDB","berglenz_tsadmin","kalidas.87");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
