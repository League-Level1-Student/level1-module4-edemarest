package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slots implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JButton spin = new JButton();
	Random random = new Random();
	Icon slot1;
	Icon slot2;
	Icon slot3;
	
	public Slots() {
		slot1 = createLabelImage("cherries.png");
		slot2 = createLabelImage("orange.png");
		slot3 = createLabelImage("seven.png");

	}
	
	public void run() {
		frame.add(panel);
		panel.add(spin);
		label1.setIcon(slot1);
		label2.setIcon(slot2);
		label3.setIcon(slot3);
		spin.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
		
		
	}
	
	
	//start create image
	private Icon createLabelImage(String fileName) {
     URL imageURL = getClass().getResource(fileName);
	Icon icon = new ImageIcon(imageURL);
	return icon;
	}
	//end create image


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 3; i++) {
			int randomNum = random.nextInt(3);
			if (i == 1) {
				if(randomNum == 1) {
					slot1 = createLabelImage("cherries.png");
				}
				if(randomNum == 2) {
					slot1 = createLabelImage("orange.png");
				}
				if(randomNum == 3) {
					slot1 = createLabelImage("seven.png");
				}
			}
			if (i == 2) {
				if(randomNum == 1) {
					slot2 = createLabelImage("cherries.png");
				}
				if(randomNum == 2) {
					slot2 = createLabelImage("orange.png");
				}
				if(randomNum == 3) {
					slot2 = createLabelImage("seven.png");
				}
			}
			if (i == 3) {
				if(randomNum == 1) {
					slot3 = createLabelImage("cherries.png");
				}
				if(randomNum == 2) {
					slot3 = createLabelImage("orange.png");
				}
				if(randomNum == 3) {
					slot3 = createLabelImage("seven.png");
				}
			}

		}
		
		
	}
	
}
