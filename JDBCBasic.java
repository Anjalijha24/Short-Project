package jdbc.Prac;

import java.sql.*;
import java.util.Scanner;

public class JDBCBasic {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        JDBCBasic obj = new JDBCBasic();
        obj.studentOperation();
    }
    

    public void studentOperation() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students", "root", "Gudiya@24")) {
            while (true) {
                System.out.println("Enter Your Choice");
                System.out.println("1: Create table");
                System.out.println("2: Insert Records");
                System.out.println("3: View Records");
                System.out.println("4: Delete Record");
                System.out.println("5: Update Record");
                System.out.println("6: Exit");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        createTable(con);
                        break;
                    case 2:
                        insertRecords(con);
                        break;
                    case 3:
                        viewAllData(con);
                        break;
                    case 4:
                        deleteRecord(con);
                        break;
                    case 5:
                        updateRecord(con);
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        break;
                }
            }
        }
    }

    private void createTable(Connection con) throws SQLException {
        String query = "create table if not exists Students (s_id int primary key, s_name varchar(30), s_city varchar(40), s_phoneNo double)";
        try (Statement stmt = con.createStatement()) {
            stmt.execute(query);
            System.out.println("Table created Successfully");
        }
    }

    private void insertRecords(Connection con) throws SQLException {
        System.out.println("Enter the ID, name, city, and PhoneNo");
        int id = sc.nextInt();
        String name = sc.next();
        String city = sc.next();
        double phoneNo = sc.nextDouble();

        String query = "INSERT INTO Students (s_id, s_name, s_city, s_phoneNo) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, city);
            ps.setDouble(4, phoneNo);
            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Record inserted successfully.");
            } else {
                System.out.println("Failed to insert record.");
            }
        }
    }
    private void viewAllData(Connection con) throws SQLException {
    	String query = "SELECT * FROM Students";
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            System.out.println("Students ID\tStudents Name\tStudents City\tStudents PhoneNo");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t\t" + rs.getString(3) + "\t\t" + rs.getDouble(4));
            }
        }
   
    }
    
   
  private void deleteRecord(Connection con) throws SQLException {
    	
    	System.out.println("Enter the ID of the record to delete:");
        int id = sc.nextInt();
        String query = "DELETE FROM Students WHERE s_id = ?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            int rowsDeleted = ps.executeUpdate();
            if (rowsDeleted > 0)
            {
                System.out.println("Record deleted successfully.");
            } else
            {
                System.out.println("Failed to delete record.");
            }
        }
  }
        private void updateRecord(Connection con) throws SQLException {
        	System.out.println("Enter the ID, name, city, and PhoneNo");
            int id = sc.nextInt();
            String name = sc.next();
            String city = sc.next();
            double phoneNo = sc.nextDouble();

            String query = "INSERT INTO Students (s_id, s_name, s_city, s_phoneNo) VALUES (?, ?, ?, ?)";
            try (PreparedStatement ps = con.prepareStatement(query)) {
                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setString(3, city);
                ps.setDouble(4, phoneNo);
                int rowsInserted = ps.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Record inserted successfully.");
                } else {
                    System.out.println("Failed to insert record.");
                }
            }	
    }
}
