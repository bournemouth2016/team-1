import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

/**
 * codeForGood
 * Created by riddle on 11/18/16.
 *
 * @author rmb481@cs.bham.ac.uk
 */
public class ButtonPanel extends JPanel implements Observer {
    private DayDietModel model;
    private JButton reset;
    private JButton update;
    private JButton info;

    public ButtonPanel(DayDietModel model) {
        this.model = model;
        this.reset = new JButton("Reset");
        this.update = new JButton("Update");
        this.info = new JButton("Info");

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // set stuff to initial state;
            }
        });

        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // update stuff in the view
            }
        });

        info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AgeGroup ageGroup = new AgeGroup();
                ageGroup.setVisible(true);
            }
        });

        this.add(reset);
        this.add(update);
        this.add(info);
    }

    @Override
    public void update(Observable observable, Object o) {

    }
}
