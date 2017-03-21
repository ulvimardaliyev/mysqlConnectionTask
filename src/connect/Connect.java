package connect;

import java.sql.*;
import java.util.Scanner;

public class Connect {

    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/samara";
        String username = "root";
        String password = "ulvi291136";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, username, password);
        String query = "insert into company values (?,?)";
        PreparedStatement prepared = conn.prepareStatement(query);
        String name = scan.nextLine();
        int salary = Integer.parseInt(scan.nextLine());
        int i = 1;
        prepared.setString(i, name);
        prepared.setInt(++i, salary);
        prepared.execute();
        prepared.close();
        conn.close();
    }

}

