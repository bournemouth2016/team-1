import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.io.*;


public class homeGUI {

	
	//Main variables
	static JFrame frame;
	static JPanel panel;
	JButton btnDaily;
	JLabel lblInfo;
	JLayeredPane paneMain;
	
	
	//Fonts
	Font lblFont = new Font("Industry", 1, 24);
	
	//
	public static void main(String[] args) throws IOException {
		new homeGUI();
		
	}
	
	public homeGUI() throws IOException{
		frame = new JFrame();
		frame.setTitle("Home");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 600);
		frame.setResizable(true);
		frame.setLocationByPlatform(true);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		addHome();
		
		
	}
	public void addHome(){
		lblInfo = new JLabel();
		btnDaily = new JButton();
		paneMain = new JLayeredPane();
		
		frame.add(paneMain);
		
		paneMain.add(btnDaily);
		btnDaily.setBounds(200, 500, 80, 20);
		btnDaily.setVisible(true);
		btnDaily.setText("Daily");
		
		paneMain.add(lblInfo);
		lblInfo.setBounds(120, 80, 300, 30);
		lblInfo.setVisible(true);
		lblInfo.setText("Welcome to the app");
		lblInfo.setFont(lblFont);
		
	}

}
