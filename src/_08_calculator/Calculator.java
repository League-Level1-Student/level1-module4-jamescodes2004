package _08_calculator;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Calculator implements MouseListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextField income = new JTextField(10);
JTextField outcome = new JTextField(10);
JButton add = new JButton();
JButton subtract = new JButton();
JButton multiply = new JButton();
JButton divide = new JButton();
GridLayout experimentLayout = new GridLayout(0,2);

public void run(){

	panel.setLayout(experimentLayout);
	frame.setVisible(true);
	add.setText("add");
	subtract.setText("subtract");
	multiply.setText("multiply");
	divide.setText("divide");
	add.addMouseListener(this);
	subtract.addMouseListener(this);
	multiply.addMouseListener(this);
	divide.addMouseListener(this);

	panel.add(income);
	panel.add(outcome);
	panel.add(add);
	panel.add(subtract);
	panel.add(multiply);
	panel.add(divide);
	

	frame.add(panel);
	frame.pack();

}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource()==add) {
		int ro = Integer.parseInt(income.getText());
		int ra = Integer.parseInt(outcome.getText());
		int r = ro + ra;

	JOptionPane.showMessageDialog(null, "The answer is " + r);
	}
	if (e.getSource()==subtract) {
		int ro = Integer.parseInt(income.getText());
		int ra = Integer.parseInt(outcome.getText());
		int r = ro - ra;

	JOptionPane.showMessageDialog(null, "The answer is " + r);
	}
	if (e.getSource()==divide) {
		int ro = Integer.parseInt(income.getText());
		int ra = Integer.parseInt(outcome.getText());
		int r = ro / ra;

	JOptionPane.showMessageDialog(null, "The answer is " + r);
	}
	if (e.getSource()==multiply) {
		int ro = Integer.parseInt(income.getText());
		int ra = Integer.parseInt(outcome.getText());
		int r = ro * ra;

	JOptionPane.showMessageDialog(null, "The answer is " + r);
	}
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
