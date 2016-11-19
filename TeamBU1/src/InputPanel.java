import javax.swing.*;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;
import java.sql.*;

public class InputPanel extends JPanel implements Observer {
    // private JComboBox country;
    private JComboBox meal;
    private String countrySelection;

    private Vector getVectorFromDB(ResultSet rs, String keyWord) {
        Vector items = new Vector();
        try {
            while (rs.next()) {
                String name = rs.getString(keyWord);
                //System.out.println("Name = " + name);
                items.add(name);
                //System.out.println();
            }
        }
        catch(Exception e){
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
                System.exit(0);
        }finally {
            return items;
        }
    }


    public InputPanel(DayDietModel model) {
        //setLayout(null);

        JLabel countryLabel = new JLabel("Country");
        //countryLabel.setBounds(104, 57, 61, 16);
        countryLabel.setVisible(true);

        JLabel meal1Label = new JLabel("Meal1");
        countryLabel.setVisible(true);

        JLabel portionSize1 = new JLabel("portionSize1");
        portionSize1.setVisible(true);

        JLabel portionSize2 = new JLabel("portionSize2");
        portionSize1.setVisible(true);

        JLabel portionSize3 = new JLabel("portionSize3");
        portionSize1.setVisible(true);

        JLabel meal2Label = new JLabel("Meal2");
        countryLabel.setVisible(true);

        JLabel meal3Label = new JLabel("Meal3");
        countryLabel.setVisible(true);

        Vector countryItems = new Vector();
        Vector foodItems = new Vector();
        Vector foodRegionItems = new Vector();
        Connection c = null;
        Statement stmt = null;

        Vector numItems = new Vector();
        int i = 0;
        while (i <= 50) {
            numItems.add(i);
            i+=5;
        }

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:TeamBU1/CostOfDiet.db3");
            stmt = c.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM Country;");
            countryItems = getVectorFromDB(rs,"Name");

            rs = stmt.executeQuery("SELECT * FROM Food;");
            foodItems = getVectorFromDB(rs,"Name");

            //rs = stmt.executeQuery("SELECT Name FROM Country,FoodRegion where Country =" + co" ;");
            //foodRegionItems = getVectorFromDB(rs,"Name");

            DatabaseMetaData md = c.getMetaData();
            rs = md.getTables(null, null, "%", null);
            while (rs.next()) {
                System.out.println(rs.getString(3));
            }


            rs.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        final DefaultComboBoxModel countryComboModel = new DefaultComboBoxModel(countryItems);
        JComboBox countryComboBox = new JComboBox(countryComboModel);
        countryComboBox.setBounds(183, 53, 110, 27);
        countryComboBox.setVisible(true);

        final DefaultComboBoxModel meal1ComboModel = new DefaultComboBoxModel(foodItems);
        JComboBox meal1ComboBox = new JComboBox(meal1ComboModel);

        final DefaultComboBoxModel meal2ComboModel = new DefaultComboBoxModel(foodItems);
        JComboBox meal2ComboBox = new JComboBox(meal2ComboModel);

        final DefaultComboBoxModel meal3ComboModel = new DefaultComboBoxModel(foodItems);
        JComboBox meal3ComboBox = new JComboBox(meal3ComboModel);

        final DefaultComboBoxModel portion1ComboModel = new DefaultComboBoxModel(numItems);
        JComboBox portion1ComboBox = new JComboBox(portion1ComboModel);

        final DefaultComboBoxModel portion2ComboModel = new DefaultComboBoxModel(numItems);
        JComboBox portion2ComboBox = new JComboBox(portion2ComboModel);

        final DefaultComboBoxModel portion3ComboModel = new DefaultComboBoxModel(numItems);
        JComboBox portion3ComboBox = new JComboBox(portion3ComboModel);

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        this.add(countryLabel);
        this.add(countryComboBox);

        this.add(meal1Label);
        this.add(meal1ComboBox);
        this.add(portionSize1);
        this.add(portion1ComboBox);

        this.add(meal2Label);
        this.add(meal2ComboBox);
        this.add(portionSize2);
        this.add(portion2ComboBox);

        this.add(meal3Label);
        this.add(meal3ComboBox);
        this.add(portionSize3);
        this.add(portion3ComboBox);

    }

    @Override
    public void update(Observable observable, Object o) {

    }
}