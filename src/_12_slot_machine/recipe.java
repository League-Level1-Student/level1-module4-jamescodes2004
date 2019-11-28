package _12_slot_machine;

import java.awt.GridLayout;
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

	Icon minecraft;
	Icon roblox;
	Icon fortnite;
	JLabel label1= new JLabel();
	JLabel label2= new JLabel();
	JLabel label3= new JLabel();
	JFrame frame = new JFrame();
	JButton spin = new JButton();
	boolean spun=false;
	boolean thrice =false;
	int spunnum = 0;
	recipe(){
		Timer time = new Timer(500, this);
		time.start();
	}
	
public void run() {
	try {
		minecraft = createLabelImage("Minecraft.png");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		fortnite= createLabelImage("Fortnite.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		roblox = createLabelImage("Roblox.png");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	GridLayout experimentLayout = new GridLayout(0,3);
    frame.setLayout(experimentLayout);
    frame.setSize(1200,	500);
    label1.setIcon(minecraft);
    label1.setIcon(roblox);
    label1.setIcon(fortnite);
    frame.add(label1);
    frame.add(label2);
    frame.add(label3);
    frame.add(new JLabel());
    frame.add(spin);

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	spin.addMouseListener(this);
	spin.setText("Spin!");

frame.setVisible(true);

frame.pack();




}

	private Icon createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return null;
		}
		Icon icon = new ImageIcon(imageURL);

		return icon;
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

		System.out.println("gso");
		Random rand = new Random();
		if(spun==true) {
		spunnum++;
		System.out.println("gtr");
		if (spunnum==10) {
			spun=false;
			spunnum=0;
		}
		
		int randnum = rand.nextInt(18);
		if (randnum==0) {
		try {
			label1.setIcon(createLabelImage("Minecraft.png"));
			label2.setIcon(createLabelImage("Roblox.png"));
			label3.setIcon(createLabelImage("Fortnite.jpg"));
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		}
		if (randnum==1) {
			try {
				label1.setIcon(createLabelImage("Roblox.png"));
				label2.setIcon(createLabelImage("Fortnite.jpg"));
				label3.setIcon(createLabelImage("Minecraft.png"));
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
			if (randnum==2) {
				try {			
					label1.setIcon(createLabelImage("Fortnite.jpg"));
					label2.setIcon(createLabelImage("Minecraft.png"));
					label3.setIcon(createLabelImage("Roblox.png"));
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (randnum==3) {
				try {
					label1.setIcon(createLabelImage("Fortnite.jpg"));
					label2.setIcon(createLabelImage("Fortnite.jpg"));
					label3.setIcon(createLabelImage("Minecraft.png"));
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (randnum==4) {
				try {
					label1.setIcon(createLabelImage("Fortnite.jpg"));
					label2.setIcon(createLabelImage("Fortnite.jpg"));
					label3.setIcon(createLabelImage("Roblox.png"));
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (randnum==5) {
				try {
					label1.setIcon(createLabelImage("Minecraft.png"));
					label2.setIcon(createLabelImage("Fortnite.jpg"));
					label3.setIcon(createLabelImage("Fortnite.jpg"));
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (randnum==6) {
				try {
					label1.setIcon(createLabelImage("Roblox.png"));
					label2.setIcon(createLabelImage("Fortnite.jpg"));
					label3.setIcon(createLabelImage("Fortnite.jpg"));
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (randnum==7) {
				try {
					label1.setIcon(createLabelImage("Fortnite.jpg"));
					label2.setIcon(createLabelImage("Fortnite.jpg"));
					label3.setIcon(createLabelImage("Fortnite.jpg"));
					
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					
				}
				if(spunnum==9) {
					thrice=true;
				}
			}
			if (randnum==8) {
				try {
					label1.setIcon(createLabelImage("Minecraft.png"));
					label2.setIcon(createLabelImage("Minecraft.png"));
					label3.setIcon(createLabelImage("Fortnite.jpg"));
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (randnum==9) {
				label1.setIcon(minecraft);
				label2.setIcon(minecraft);
				label3.setIcon(roblox);
			}
			if (randnum==10) {
				label1.setIcon(fortnite);
				label2.setIcon(minecraft);
				label3.setIcon(minecraft);
			}
			if (randnum==11) {
				label1.setIcon(roblox);
				label2.setIcon(minecraft);
				label3.setIcon(minecraft);
			}
			if (randnum==12) {
				label1.setIcon(minecraft);
				label2.setIcon(minecraft);
				label3.setIcon(minecraft);
				if(spunnum==9) {
					thrice=true;
				}
			}
			if (randnum==13) {
				label1.setIcon(roblox);
				label2.setIcon(roblox);
				label3.setIcon(minecraft);
			}
			if (randnum==14) {
				label1.setIcon(roblox);
				label2.setIcon(roblox);
				label3.setIcon(fortnite);
			}
			if (randnum==15) {
				label1.setIcon(minecraft);
				label2.setIcon(roblox);
				label3.setIcon(roblox);
			}
			if (randnum==116) {
				label1.setIcon(fortnite);
				label2.setIcon(roblox);
				label3.setIcon(roblox);
			}
			if (randnum==17) {
				label1.setIcon(roblox);
				label2.setIcon(roblox);
				label3.setIcon(roblox);
				if(spunnum==9) {
					thrice=true;
				}
			}






		}
		if(thrice==true) {
			JOptionPane.showMessageDialog(null, "You won!");
		}
		}
	
}