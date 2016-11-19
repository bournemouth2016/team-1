import javax.swing.*;
import java.awt.*;


/**
 * codeForGood
 * Created by riddle on 11/18/16.
 * This is the class where all the stuff are glued together.
 * @author rmb481@cs.bham.ac.uk
 */
public class DayDietComp extends JPanel {

    public DayDietComp(DayDiet dayDiet) {
       // Initialize model
        DayDietModel model = new DayDietModel(dayDiet);

        // initialize panel
        DayDietView view = new DayDietView(model);
        InputPanel inputPanel = new InputPanel(model);
        ButtonPanel buttonPanel = new ButtonPanel(model);

        // Connect panels to model
        model.addObserver(view);
        model.addObserver(inputPanel);
        model.addObserver(buttonPanel);

        // Add to model
        model.addObserver(view);
        model.addObserver(inputPanel);
        model.addObserver(buttonPanel);

        // Position
        setLayout(new BorderLayout());
        add(view, BorderLayout.SOUTH);
        // add(, BorderLayout.SOUTH);
        add(inputPanel, BorderLayout.WEST);
        add(buttonPanel, BorderLayout.EAST);
    }
}
