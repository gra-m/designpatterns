package swing.brocode._04Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Gra_m on 2022 07 03
 */

class MyJFrameLambdaListener extends JFrame {
	MyJButton button;
	JLabel labelOnClick;

	public MyJFrameLambdaListener() {
		ImageIcon image = new ImageIcon("logo.png");
		this.setIconImage(image.getImage());
		this.setSize(750,750);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X closes program vs HIDE_ON_CLOSE DO_NOTHING_ON_CLOSE
		this.setResizable(false);
		this.setTitle("Jframe Title goes here");
		this.setVisible(true);
		this.getContentPane().setBackground(new Color(254,220,220));
		this.setLayout(null);

		labelOnClick = new JLabel();
		labelOnClick.setIcon(image);
		labelOnClick.setBounds(0, 0, 100, 100);
		labelOnClick.setVisible(false);


		button = new MyJButton();
		this.add(labelOnClick);
		this.add(button);
		button.addActionListener(e -> {
			System.out.println("Button Pressed");
			button.setEnabled(false);
			labelOnClick.setVisible(true);
		});
	}

}
