import javax.swing.*;


/**
 * codeForGood
 * Created by riddle on 11/18/16.
 * This is the class where all the stuff are glued together.
 * @author rmb481@cs.bham.ac.uk
 */
public class DayDietComp extends JPanel {

    public DayDietComp(DayDiet dayDiet) {
        DayDietModel model = new DayDietModel(dayDiet);
        DayDietView view = new DayDietView(model);
        InputPanel buttonPanel = new InputPanel(model);

    }
}
