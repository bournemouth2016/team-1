import javax.swing.*;
import java.awt.*;
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
    private JComboBox meal;
    private JComboBox portion;

    public InputPanel(DayDietModel model) {
        this.country = new JComboBox<String>();
        this.meal = new JComboBox<String>();
        this.portion = new JComboBox<String>();

        JLabel labelCountry = new JLabel("Country of Residence");
        JLabel labelMeal = new JLabel("Enter the meal");
        JLabel labelportion = new JLabel("Enter the size of the portion");

        this.add(labelCountry);
        this.add(country);
        this.add(labelMeal);
        this.add(meal);
        this.add(labelportion);
        this.add(portion);

    }

    @Override
    public void update(Observable observable, Object o) {

    }
}
