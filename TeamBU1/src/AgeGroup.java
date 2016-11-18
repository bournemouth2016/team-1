import java.awt.Color;


import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class AgeGroup extends JFrame {

	private static JFrame detailsFrame;
	private static JPanel detailsPanel;


	public AgeGroup (){
		
		detailsPanel = new JPanel();
		detailsPanel.setBackground(Color.LIGHT_GRAY);
		detailsPanel.setLayout(null);
		
		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setBounds(247, 118, 144, 27);
		detailsPanel.add(comboBox);
		
		JComboBox<Object> comboBox_1 = new JComboBox<Object>();
		comboBox_1.setBounds(247, 151, 144, 27);
		detailsPanel.add(comboBox_1);
		
			JLabel lblAgegroup = new JLabel("AgeGroup");
			lblAgegroup.setBounds(122, 122, 102, 16);
			detailsPanel.add(lblAgegroup);
		
		
			JLabel lblDiet_1 = new JLabel("Diet");
			lblDiet_1.setBounds(122, 155, 61, 16);
			detailsPanel.add(lblDiet_1);
		
		
			JLabel lblDietSelection = new JLabel("Diet Selection");
			lblDietSelection.setBackground(Color.LIGHT_GRAY);
			lblDietSelection.setBounds(200, 59, 115, 16);
			detailsPanel.add(lblDietSelection);
		
	
		detailsFrame = new JFrame();
		detailsFrame.setSize(500,450);
		detailsFrame.getContentPane().add(detailsPanel);
		detailsFrame.setResizable(false);
		detailsFrame.setLocationRelativeTo(null);
		detailsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		detailsFrame.setVisible(true);

	}
	
}
