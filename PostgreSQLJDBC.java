import java.io.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class PostgreSQLJDBC {
   public static void main(String args[]) {
      Connection connection = null;
      try {
         Class.forName("org.postgresql.Driver");
			String jdbcUrl="jdbc:postgresql://52.15.165.173:5432/postgres";
			String username="postgres";
			String password="password";         
         connection = DriverManager.getConnection(jdbcUrl, username, password);
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");
   }
}
