import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
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
    private JTextArea resultArea;
    private BufferedImage images[];


    public DayDietView (DayDietModel model) {
        super();
        this.model = model;

        try {
            BufferedImage images[] = new BufferedImage[4];
            images[1] = ImageIO.read(new File("TeamBU1/fish.jpg"));
            images[2] = ImageIO.read(new File("TeamBU1/pineapple.jpg"));
            //images[3] = ImageIO.read(new File("image name and path"));
            //images[0] = ImageIO.read(new File("image name and path"));

        } catch (IOException ex) {
            // handle exception...
        }
        resultArea = new JTextArea("\n\n\nHere is a visual representaion of " +
                "the recommended diet for you\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "it will cost you only this much", 30, 10);
        resultArea.setVisible(true);
        this.add(resultArea);
    }


    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //g.drawImage(images[1], 400,400, this);
        //g.drawImage(images[2], 200, 200, this);
        //g.drawImage(images[3], 0, 0, this);
        //g.drawImage(images[0], 0, 0, this);

    }

    @Override
    public void update(Observable observable, Object o) {
        repaint();
    }
}
