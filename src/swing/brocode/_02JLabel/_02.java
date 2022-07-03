package swing.brocode._02JLabel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by Gra_m on 2022 07 03
 */

class _02 {
	//JLabel Display area for string, image or both
	public static void main(String[] args) {
		JFrame frame = new MyJFrame();


		ImageIcon icon = new ImageIcon("logo.png");
		Border border = BorderFactory.createLineBorder(Color.green,3);

		JLabel label = new JLabel();
		label.setText("Hello, I'm a jLabel");
		label.setIcon(icon);
		label.setHorizontalTextPosition(label.CENTER);
		label.setVerticalTextPosition(label.TOP);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setForeground(new Color(123,50,200));
		label.setFont(new Font("MV Boli", Font.PLAIN, 20) );
		label.setIconTextGap(25);
		label.setBackground(Color.BLACK);
		label.setOpaque(true); //enables label to set background within it's bounds. Label not limited currently.
		label.setBorder(border);

		// ensure label does not take up entire frame 1:
		frame.setLayout(null);
		// 2:
		label.setBounds(125, 125,  250, 250);

		// or use frame.pack() to expand frame to whatever is in the label/components within it.
		//frame.pack(); // add all components before using pack..


		frame.add(label);


	}



}
