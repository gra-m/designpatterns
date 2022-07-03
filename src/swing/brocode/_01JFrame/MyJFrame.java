package swing.brocode._01JFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Gra_m on 2022 07 03
 */

class MyJFrame extends JFrame {

	public MyJFrame() {
		ImageIcon image = new ImageIcon("logo.png");
		this.setIconImage(image.getImage());
		this.setSize(420,420);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X closes program vs HIDE_ON_CLOSE DO_NOTHING_ON_CLOSE
		this.setResizable(false);
		this.setTitle("Jframe Title goes here");
		this.setVisible(true);
		this.getContentPane().setBackground(new Color(254,220,220));
	}


}
