package _12_slot_machine;

import java.awt.Dimension;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Slots implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JButton spin = new JButton("SPIN");
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
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		label1.setIcon(slot1);
		label2.setIcon(slot2);
		label3.setIcon(slot3);
		label1.setPreferredSize(new Dimension(100, 200));
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
			Random random = new Random();
			int randomNum = random.nextInt(3);
			System.out.println(randomNum);
			if (i == 0) {
				if(randomNum == 0) {
					label1.setIcon(slot1);
				}
				if(randomNum == 1) {
					label1.setIcon(slot2);
				}
				if(randomNum == 2) {
					label1.setIcon(slot3);
				}
			}
			if (i == 1) {
				if(randomNum == 0) {
					label2.setIcon(slot1);
				}
				if(randomNum == 1) {
					label2.setIcon(slot2);
				}
				if(randomNum == 2) {
					label2.setIcon(slot3);
				}
			}
			if (i == 2) {
				if(randomNum == 0) {
					label3.setIcon(slot1);
				}
				if(randomNum == 1) {
					label3.setIcon(slot2);
				}
				if(randomNum == 2) {
					label3.setIcon(slot3);
				}
			}

		}
		if(label1.getIcon().equals(label2.getIcon()) && label2.getIcon().equals(label3.getIcon())){
			JOptionPane.showMessageDialog(null, "You Win!");
		}
		
		
	}
	
}
