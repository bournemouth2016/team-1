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
        this.country = new JComboBox();
        this.Meal = new JComboBox();
        this.portion = new JComboBox();

    }

    @Override
    public void update(Observable observable, Object o) {

    }
}
