
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Author {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String firstName;
		String middleName;
		String lastName;
		String phoneno;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "shivani", "shivani123");
//		PreparedStatement p1=conn.prepareStatement("create table author(authorId number(10),firstName varchar(20),middleName varchar(20),lastName varchar(20),phoneNo number(10))");
//		boolean b=p1.execute();
//		if(b==false)
//			System.out.println("Table created");
//		else
//			System.out.println("Table not created");

		while (true) {
			Scanner s = new Scanner(System.in);

			System.out.println("0: exit\n1.Insert author data\n2.Update data\n3.Delete");
			int n = s.nextInt();
			if (n == 0)
				break;
			if (n == 1) {
				System.out.println("Enter authorId");
				int authorId = s.nextInt();
				System.out.println("Enter firstName");
				firstName = s.next();
				System.out.println("Enter middleName");
				middleName = s.next();
				System.out.println("Enter lasteName");
				lastName = s.next();
				System.out.println("Enter phonenumber");
				phoneno = s.next();
				PreparedStatement p2 = conn.prepareStatement("insert into author values(?,?,?,?,?)");
				p2.setInt(1, authorId);
				p2.setString(2, firstName);
				p2.setString(3, middleName);
				p2.setString(4, lastName);
				p2.setLong(5, Long.parseLong(phoneno));
				int status = p2.executeUpdate();
				if (status > 0)
					System.out.println("Successfully entered");
			}
//			if (n == 2) {
//				System.out.println("Searching for emp data");
//				System.out.println("Enter name");
//				String name = s.next();
//				PreparedStatement p2 = conn.prepareStatement("select * from employee where name=?");
//				p2.setString(1, name);
//				ResultSet result = p2.executeQuery();
//				if (result.next())
//					System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getInt(3) + " "
//							+ result.getString(4));
//			}
			if (n == 2) {
				int check = 0;
				System.out.println("Enter the author id whose details u want to update");
				int aid = s.nextInt();
				System.out.println(
						"1.Update authorId\n2.Update firstName\n3.Update middleName\n4.Update lastName\n5.UpdatephoneNo");
				int ch = s.nextInt();
				if (ch == 1) {
					System.out.println("Enter new authorid");
					int id = s.nextInt();
					PreparedStatement p31 = conn.prepareStatement("update author set authorId=? where authorId=?");
					p31.setInt(2, aid);
					p31.setInt(1, id);
					check = p31.executeUpdate();
					if (check > 0)
						System.out.println("Successfully modified");
				}
				if (ch == 2) {
					System.out.println("Enter new first name");
					firstName = s.next();
					PreparedStatement p32 = conn.prepareStatement("update author set firstName=? where authorId=?");
					p32.setInt(2, aid);
					p32.setString(1, firstName);
					check = p32.executeUpdate();
					if (check > 0)
						System.out.println("Successfully modified");
				}
				if (ch == 3) {
					System.out.println("Enter new middle name");
					middleName = s.next();
					PreparedStatement p33 = conn.prepareStatement("update author set middleName=? where authorId=?");
					p33.setInt(2, aid);
					p33.setString(1, middleName);
					check = p33.executeUpdate();
					if (check > 0)
						System.out.println("Successfully modified");
				}
				if (ch == 4) {
					System.out.println("Enter new last name");
					lastName = s.next();
					PreparedStatement p34 = conn.prepareStatement("update author set lastName=? where authorID=?");

					p34.setInt(2, aid);
					p34.setString(1, lastName);
					check = p34.executeUpdate();
					if (check > 0)
						System.out.println("Successfully modified");
				}
				if (ch == 5) {
					System.out.println("Enter new phone number");
					phoneno = s.next();
					PreparedStatement p35 = conn.prepareStatement("update employee set lastName=? where authorID=?");

					p35.setInt(2, aid);
					p35.setLong(1, Long.parseLong(phoneno));
					check = p35.executeUpdate();
					if (check > 0)
						System.out.println("Successfully modified");
				}
			}
//			if(n==4) 
//			{
//				System.out.println("Full table data");
//			PreparedStatement p4 = conn.prepareStatement("select * from employee");
//			ResultSet result = p4.executeQuery();
//			while(result.next())
//				System.out.println(result.getInt(1) + "\t" + result.getString(2) + "\t" + result.getInt(3) + "\t"+ result.getString(4));
//		}
			if (n == 3) {
				int check1 = 0;
				System.out.println("Enter Author id");
				int aid = s.nextInt();
				PreparedStatement p5 = conn.prepareStatement("delete employee where eid=?");
				p5.setInt(1, aid);
				check1 = p5.executeUpdate();
				if (check1 > 0)
					System.out.println("Successfully deleted");
			}
		}
		// s.close();
	}
}
