package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton joke = new JButton();
	JButton punchline = new JButton();
public static void main(String[] args) {
	new ChuckleClicker().makeButtons();
}
void makeButtons(){

	joke.addActionListener(this);

	punchline.addActionListener(this);
	joke.setText("Joke");
	punchline.setText("Punchline");
	panel.add(joke);
	panel.add(punchline);
	frame.add(panel);
	frame.pack();


}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == joke) {
		JOptionPane.showMessageDialog(null, "hi");
	}
	if(e.getSource() == punchline) {
		JOptionPane.showMessageDialog(null, "hi");
	}
}
}

