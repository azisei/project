
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

  public class dbc {
   private static final String URL ="jdbc:oracle:thin:@localhost:1521:xe" ;
   private static final String USER ="Project";
   private static final String PASSWORD ="0726";
    private static final String DRIVER ="oracle.jdbc.driver.OracleDriver";
      Connection conn = null;
      public Connection connMethod(){
          System.out.print("hiii");
          
          try {
              Class.forName(DRIVER);
              conn = DriverManager.getConnection(URL,USER,PASSWORD);
          }
          catch (ClassNotFoundException | SQLException e){
          }
       return conn;
}
      public static void main(String[] args){
          dbc obj=new dbc();
          System.out.print(obj.connMethod());
      }}
