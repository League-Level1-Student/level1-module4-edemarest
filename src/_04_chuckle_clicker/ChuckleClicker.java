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
	JButton b1 = new JButton("joke");
	JButton b2 = new JButton("punchline");
public static void main(String[] args) {
	
	
	new ChuckleClicker().makeButtons();
}

  void makeButtons() {

	frame.add(panel);
	panel.add(b1);
	panel.add(b2);
	b1.addActionListener(this);
	b2.addActionListener(this);
	frame.setVisible(true);
	frame.pack();
	
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == b1 ) {
	JOptionPane.showMessageDialog(null, "A man walks into a bar");
	}
	if(e.getSource() == b2) {
	JOptionPane.showMessageDialog(null,  "And a table, and a chair.");
	}
}

}
