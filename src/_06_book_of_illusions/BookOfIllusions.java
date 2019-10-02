package _06_book_of_illusions;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
 
/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusions extends MouseAdapter {
JFrame frame = new JFrame();
JLabel label = loadImageFromComputer("Gorilla.jpg");
JLabel label1 = loadImageFromComputer("Pig.jpg");
JPanel panel = new JPanel();
	// 1. Make a JFrame variable and initialize it using "new JFrame()"

	public void run() {
		// 2. make the frame visible
		frame.setVisible(true);
		// 3. set the size of the frame
		frame.setSize(500,500);
		// 4. find 2 images and save them to your project’s default package
		
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		
		// 7. use the "loadImage..." methods below to initialize your JLabel

		// 8. add your JLabel to the frame

		panel.add(label);
		panel.add(label1);
		frame.add(panel);
		frame.pack();
		
		// 9. call the pack() method on the frame
		// 10. add a mouse listener to your frame (hint: use *this*)
		panel.addMouseListener(this);
		frame.addMouseListener(this);
		label.addMouseListener(this);
		label1.addMouseListener(this);		

		JOptionPane.showMessageDialog(null, "click");
		
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("Clicked!");
	Random rand = new Random();
	int randnum = rand.nextInt(5);

	if (randnum==1) {
JOptionPane.showMessageDialog( null, "Click again bot");
	}
	if (randnum==2) {
JOptionPane.showMessageDialog( null, "You like that thiccc hamster:{");
	}
	if (randnum==3) {
JOptionPane.showMessageDialog( null, "You like that dogo :))");
	}
	if (randnum==4) {
JOptionPane.showMessageDialog( null, "I know you want to go back to the other pictures now");
	}
	if (randnum==5) {
JOptionPane.showMessageDialog( null, "If ur not a piece of booty cheek, click again");
	}
	
	
	
	
	panel.remove(label);
panel.remove(label1);
		// 11. Print "clicked!" to the console when the mouse is pressed
		// 12. remove everything from the frame that was added earlier
		// 13. load a new image like before (this is more than one line of code)
	JLabel label2 = loadImageFromComputer("Dog.jpg");
	JLabel label3 = loadImageFromComputer("Hamster.jpg");
	panel.add(label2);
	panel.add(label3);
		// 14. pack the frame
	frame.pack();}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}


