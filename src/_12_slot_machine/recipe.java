package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class recipe implements MouseListener, ActionListener {

	JFrame frame = new JFrame();
	JLabel label1= new JLabel();
	JLabel label2= new JLabel();
	JLabel label3= new JLabel();

	JButton spin = new JButton();
	boolean spun=false;
	int spunnum = 0;
	recipe(){
		Timer time = new Timer(2000, this);
		time.start();
	}
	
public void run() {


}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==spin) {
			spun=true;
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JPanel panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		spin.addMouseListener(this);
		spin.setText("Spin!");
	frame.add(panel);
	frame.setVisible(true);
	panel.add(label1);
	panel.add(label2);
	panel.add(label3);
	panel.add(spin);
	frame.pack();
		System.out.println("gso");
		Random rand = new Random();
		if(spun==true) {
		spunnum++;
		if (spunnum==10) {
			spun=false;
		}
		
		int randnum = rand.nextInt(4);
		if (randnum==0) {
		try {
			label1 = createLabelImage("Minecraft.png");
			label2 = createLabelImage("Fortnite.jpg");
			label3 = createLabelImage("Roblox.png");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		}
		if (randnum==1) {
			try {
				label1 = createLabelImage("Roblox.png");
				label2 = createLabelImage("Fortnite.jpg");
				label3 = createLabelImage("Minecraft.png");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
			if (randnum==2) {
				try {
					label1 = createLabelImage("Fortnite.jpg");
					label2 = createLabelImage("Minecraft.png");
					label3 = createLabelImage("Roblox.png");
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (randnum==3) {
				try {
					label1 = createLabelImage("Fortnite.jpg");
					label2 = createLabelImage("Roblox.png");
					label3 = createLabelImage("Minecraft.png");
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		}
	
}