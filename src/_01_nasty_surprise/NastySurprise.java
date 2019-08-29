package _01_nasty_surprise;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class NastySurprise implements MouseListener{
static JFrame frame = new JFrame();
static JPanel panel = new JPanel();
static JButton trick = new JButton("Trick");
static JButton treat = new JButton("Treat");

public void Listener() {
	trick.addMouseListener(this);

		JOptionPane.showMessageDialog(null, "trick");
	
	treat.addMouseListener(this);
 
		JOptionPane.showMessageDialog(null, "trick");
	
	panel.add(trick);
	panel.add(treat);
	frame.add(panel);
	frame.setVisible(true);
	frame.pack();
}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	System.out.println("Click");
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
	
}}

