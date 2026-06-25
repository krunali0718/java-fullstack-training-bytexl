import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDEMO {

    public static void main(String[] args) {
          try {
           Connection obj = DriverManager.getConnection(
                    "jdbc:mysql://db01.dbhost.dev:5051/db_44shsjnkn",
                    "user_44shsjnkn",
                    "p44shsjnkn");
            System.out.println("DB Connected....");
        } catch (Exception e) {
            System.out.println("Error...");

        }
    }

  
    
}
