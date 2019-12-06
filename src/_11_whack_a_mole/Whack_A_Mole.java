package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whack_A_Mole implements ActionListener {

	 JFrame frame;
	 JPanel panel;
	 JButton moleButton;
	 int score = 0;
	 Random random = new Random();
	 Date start = new Date();
	
	//Make buttons
	public  void makeButtons() {
		int randomNum = random.nextInt(24);
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		for(int i = 0; i < 24; i++) {
			
			if (i == randomNum) {
				moleButton = new JButton("mole");
				moleButton.addActionListener(this);
				panel.add(moleButton);
			}
			else {
			JButton button = new JButton();
			button.addActionListener(this);
			panel.add(button);
			}
			
		}
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(250, 300));
		frame.pack();
		

	}
	
	
	//Speak
	void speak(String words) { 
	    try { 
	        Runtime.getRuntime().exec("say " + words).waitFor();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	//Win Game
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == moleButton) {
			score++;
			System.out.println("Hit! Your current score is:   " + score);
			makeButtons();
			if (score == 10) {
				System.out.println("You won!");
				endGame(start, score);
			}
		}
		else {
			speak("You missed!");
			System.out.println("You missed! Your current score is:   " + score);
			System.out.println("You lost!");
			makeButtons();
			
		}
		
	}
	
	
}
