package _11_whack_a_mole;

import java.awt.Button;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class WhackAMole {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random rand =  new Random();
	boolean good = false;
	boolean done =false;
	
	public void run() {

		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int num = rand.nextInt(24);
		
		for (int i = 0; i < 24; i++) {

			JButton button = new JButton();
			panel.add(button);
if (i == num) {
	button.setText("mole");
}
			

		}
	}
}