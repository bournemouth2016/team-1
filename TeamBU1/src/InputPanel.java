import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;
import java.sql.*;

public class InputPanel extends JPanel implements Observer {
   // private JComboBox country;
    private JComboBox meal;
    private String countrySelection;

    public InputPanel(DayDietModel model) {
    	//setLayout(null);
    	
    	JLabel lblNewLabel = new JLabel("Country");
    	//lblNewLabel.setBounds(104, 57, 61, 16);
    	lblNewLabel.setVisible(true);
    	this.add(lblNewLabel);
    	
        Vector countryItems = new Vector();
        Vector foodItems = new Vector();
        Connection c = null;
        Statement stmt = null;
        try {
          Class.forName("org.sqlite.JDBC");
          c = DriverManager.getConnection("jdbc:sqlite:TeamBU1/CostOfDiet.db3");
          stmt = c.createStatement();
          ResultSet rs = stmt.executeQuery( "SELECT * FROM Country;" );
         
          
          while ( rs.next() ) {
             String name = rs.getString("Name");
             System.out.println( "Name = " + name );
             countryItems.add(name);
             System.out.println();
          }
          rs.close();
        } catch ( Exception e ) {
          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
          System.exit(0);
        }

        final DefaultComboBoxModel countryComboModel = new DefaultComboBoxModel(countryItems);
        JComboBox countryComboBox = new JComboBox(countryComboModel);
    	countryComboBox.setBounds(183, 53, 110, 27);
    	countryComboBox.setVisible(true);
    	this.add(countryComboBox);
        

    }

    @Override
    public void update(Observable observable, Object o) {

    }
}