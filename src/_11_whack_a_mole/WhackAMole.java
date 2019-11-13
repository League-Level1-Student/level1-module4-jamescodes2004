package _11_whack_a_mole;

import java.awt.Button;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class WhackAMole implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random rand = new Random();
	boolean good = false;
	boolean done = false;
	JButton button1 = new JButton();
	int n = 0;
	int wrong = 0;
	Date time;
	int mole = 0;
	public void run() {
frame = new JFrame();
panel = new JPanel();
		frame.add(panel);
		frame.setSize(300,600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int num = rand.nextInt(24);

		for (int i = 0; i < 24; i++) {

			if (i == num) {

				button1.addMouseListener(this);
				panel.add(button1);
				button1.setText("mole");

			} else {
				JButton button = new JButton();
				button.addMouseListener(this);
				panel.add(button);
			}

		}
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if ((JButton) e.getSource() == button1) {
			speak("Ouch!");
			mole++;
		}
		else {
			speak("Incorrect!");
			wrong++;
		}
		if (wrong==5) {
			endGame(time,mole);
		}
		if (n == 0){
			time = new Date();
		}
		n++;
		if(n==5) {
			endGame(time, mole);
		}
		else{
			
		}
		frame.dispose();

run();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}