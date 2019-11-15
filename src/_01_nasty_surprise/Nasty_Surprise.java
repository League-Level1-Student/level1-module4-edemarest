package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Nasty_Surprise implements ActionListener {

	JFrame frame = new JFrame("Nasty Surprise");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton b1 = new JButton("Trick");
	JButton b2 = new JButton("Treat");
	
public void run() {
	frame.add(panel);
	panel.add(label);
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
	if (e.getSource().equals(b1)) {
		showPictureFromTheInternet("https://media.tenor.com/images/6ee3351845cbdc58700a2e4bc5328909/tenor.gif");
	}
	else {
		showPictureFromTheInternet("https://i.ytimg.com/vi/GgKpoJO8yxg/maxresdefault.jpg");
	}
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
}	
}
