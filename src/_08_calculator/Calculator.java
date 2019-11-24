package _08_calculator;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

	int frameWidth = 200;
    int frameHeight = 200;
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JTextField num1 = new JTextField("");
	JTextField num2 = new JTextField("");
	JButton add = new JButton("add");
	JButton sub = new JButton("sub");
	JButton mul = new JButton("mul");
	JButton div = new JButton("div");
	
	public void run() {
		frame.add(panel);
		panel.add(num1);
		panel.add(num2);
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		panel.add(label);
	   	frame.setPreferredSize(new Dimension(frameWidth, frameHeight));
	   	num1.setPreferredSize(new Dimension(70, 20));
	   	num2.setPreferredSize(new Dimension(70, 20));
	   	label.setPreferredSize(new Dimension(40,40));
		num1.addActionListener(this);
		num2.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);		
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String string1 = num1.getText();
		String string2 = num2.getText();
		int firstNum = Integer.parseInt(string1);
		int secondNum = Integer.parseInt(string2);
		
		if(e.getSource() == add) {
			String answer = Integer.toString(firstNum + secondNum);
			label.setText(answer);
		}
		if(e.getSource() == sub) {
			String answer = Integer.toString(firstNum - secondNum);
			label.setText(answer);
		}
		if(e.getSource() == mul) {
			String answer = Integer.toString(firstNum * secondNum);
			label.setText(answer);
		}
		if(e.getSource() == div) {
			String answer = Integer.toString(firstNum / secondNum);
			label.setText(answer);
		}
	}
	
}
