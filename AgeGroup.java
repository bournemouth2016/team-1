import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;

public class AgeGroup {

	private JFrame detailsFrame;
	private JPanel detailsPanel;
	private JLabel lblDiet;
	private JTextField currencyField, valueField;
	private JButton calculateButton;
	private JComboBox<?> petList;

	public AgeGroup(){
		
		LoginDetailsButtons();
		LoginDetailsLabels();
		LoginDetailsTextFields();
		LoginDetailsPanels();
		LoginDetialsFrames();
		ComboBox();
	}
	
	private void ComboBox(){
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(247, 118, 144, 27);
		detailsPanel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(247, 151, 144, 27);
		detailsPanel.add(comboBox_1);
		{
			JLabel lblAgegroup = new JLabel("AgeGroup");
			lblAgegroup.setBounds(122, 122, 102, 16);
			detailsPanel.add(lblAgegroup);
		}
		{
			JLabel lblDiet_1 = new JLabel("Diet");
			lblDiet_1.setBounds(122, 155, 61, 16);
			detailsPanel.add(lblDiet_1);
		}
		{
			JLabel lblDietSelection = new JLabel("Diet Selection");
			lblDietSelection.setBackground(Color.LIGHT_GRAY);
			lblDietSelection.setBounds(200, 59, 115, 16);
			detailsPanel.add(lblDietSelection);
		}
	}
	
	private void LoginDetailsButtons(){
		calculateButton = new JButton("Calculate");
		calculateButton.setLocation(188, 363);
		calculateButton.setSize(123, 39);
	}

	private void LoginDetialsFrames(){
		detailsFrame = new JFrame();
		detailsFrame.setSize(500,450);
		detailsFrame.getContentPane().add(detailsPanel);
		detailsFrame.setResizable(false);
		detailsFrame.setLocationRelativeTo(null);
		detailsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		detailsFrame.setVisible(true);
	}
	
	private void LoginDetailsPanels(){
		detailsPanel = new JPanel();
		detailsPanel.setBackground(Color.LIGHT_GRAY);
		detailsPanel.setLayout(null);
		detailsPanel.add(lblDiet);
		detailsPanel.add(valueField);
		detailsPanel.add(petList);
	}
	
	private void LoginDetailsLabels(){
		JLabel lblDiet = new JLabel("Diet");
		lblDiet.setBounds(117, 162, 61, 16);
		detailsPanel.add(lblDiet);
	}
	
	private void LoginDetailsTextFields(){
		currencyField = new JTextField("currency");
		currencyField.setBounds(249, 104, 103, 26);
		
	}

	public static void main(String[] args) {
		new AgeGroup();
	}
}
