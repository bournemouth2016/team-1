import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

/**
 * codeForGood
 * Created by riddle on 11/18/16.
 *
 * @author rmb481@cs.bham.ac.uk
 */
public class InputPanel extends JPanel implements Observer {
    private JComboBox country;
    private JComboBox Meal;
    private JComboBox portion;

    public InputPanel(DayDietModel model) {
        this.country = new JComboBox<String>();
        this.Meal = new JComboBox<String>();
        this.portion = new JComboBox<String>();

        JLabel labelCountry = new JLabel("Country of Residence");
        JLabel labelMeal = new JLabel("Enter the Meal");
        JLabel labelportion = new JLabel("Enter the size of the portion");

        
        // add these

        this.add(labelCountry);
        this.add(country);
        this.add(labelMeal);
        this.add(Meal);
        this.add(labelportion);
        this.add(portion);

    }

    @Override
    public void update(Observable observable, Object o) {

    }
}
