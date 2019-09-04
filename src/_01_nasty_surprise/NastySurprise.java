package _01_nasty_surprise;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class NastySurprise implements MouseListener{
static JFrame frame = new JFrame();
static JPanel panel = new JPanel();
static JButton trick = new JButton("Trick");
static JButton treat = new JButton("Treat");

public void Listener() {



		trick.addMouseListener(this);

 

		treat.addMouseListener(this);
	
	panel.add(trick);
	panel.add(treat);
	frame.add(panel);
	frame.setVisible(true);
	frame.pack();
}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==treat) {
		showPictureFromTheInternet("https://daily.jstor.org/wp-content/uploads/2019/07/the_folklorist_behind_scary_stories_to_tell_in_the_dark_1050x700.jpg");
	}
	
	if(e.getSource()==trick) {
		showPictureFromTheInternet("https://www.howpup.com/wp-content/uploads/2017/11/Pick-a-Puppy.jpg");
	}
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
	
}

private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}}

