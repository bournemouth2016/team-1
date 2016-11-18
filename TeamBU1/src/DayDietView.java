import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;


// This class displays the analysis
/**
 * codeForGood
 * Created by riddle on 11/18/16.
 * This is the class where changes in the input are reflected
 * @author rmb481@cs.bham.ac.uk
 */

public class DayDietView extends JPanel implements Observer {
    private DayDietModel model;

    public DayDietView (DayDietModel model) {
        super();
        this.model = model;
    }



    @Override
    public void update(Observable observable, Object o) {
        repaint();
    }
}
