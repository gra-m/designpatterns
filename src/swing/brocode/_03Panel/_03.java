package swing.brocode._03Panel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Gra_m on 2022 07 03
 */

class _03 {
	public static void main(String[] args) {
		//JPanel GUI component to contain other components:

		JFrame frame = new MyJFrame();
		frame.setLayout(null);
		frame.setSize(750, 750);

		ImageIcon icon = new ImageIcon("logo.png");

		JLabel label = new JLabel("Hi, text");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.RIGHT);

		JPanel redPanel = new JPanel();
		JPanel bluePanel = new JPanel();
		JPanel greenPanel = new JPanel();

		redPanel.setBackground(Color.RED);
		// manually place as using null layoutmanager
		redPanel.setBounds(0,0,250,250);
		redPanel.setLayout(new BorderLayout());
		// if
		//redPanel.setLayout(null); // would have to set bounds in label (label.setBounds(0,0, 75, 75); positions == container it's in.

		bluePanel.setBackground(Color.BLUE);
		bluePanel.setBounds(250, 0, 250, 250);
		bluePanel.setLayout(new BorderLayout());

		greenPanel.setBackground(Color.GREEN);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(new BorderLayout());

		redPanel.add(label);


		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);



	}
}
