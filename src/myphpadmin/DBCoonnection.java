package myphpadmin;

import java.sql.Connection;

public class DBCoonnection {
	
	public static java.sql.Connection connect()
	{
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
		
	}

}
