
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Books {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "shivani", "shivani123");
		PreparedStatement p1=conn.prepareStatement("create table bookauthor()");
		boolean b=p1.execute();
		if(b==false)
			System.out.println("Table created");
		else
			System.out.println("Table not created");

	}
}
