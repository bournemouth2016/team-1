import java.sql.*;

public class SQLConnection
{
  public static void main( String args[] )
  {
    Connection c = null;
    Statement stmt = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:/Users/adamglynn/Documents/Bournemouth University/CostOfDiet.db3");
      stmt = c.createStatement();
      ResultSet rs = stmt.executeQuery( "SELECT * FROM Food;" );
      
      while ( rs.next() ) {
         int id = rs.getInt("Id");
         String name = rs.getString("Name");
        
         System.out.println( "ID = " + id );
         System.out.println( "Name = " + name );
       
         System.out.println();
      }
      rs.close();
      stmt.close();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Opened database successfully");
  }
}

