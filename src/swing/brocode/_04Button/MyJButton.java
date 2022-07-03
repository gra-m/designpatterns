package swing.brocode._04Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Gra_m on 2022 07 03
 */

class MyJButton extends JButton {

	public MyJButton() {
		ImageIcon icon = new ImageIcon("logo.png");
		this.setBounds(100, 100, 250, 100);
		this.setText("BUTTON");
		this.setFocusable(false);
		this.setIcon(icon);
		this.setHorizontalTextPosition(JButton.CENTER);
		this.setVerticalTextPosition(JButton.BOTTOM);
		this.setFont(new Font("Arial", Font.BOLD, 25));
		this.setIconTextGap(-10);
		this.setForeground(Color.CYAN);
		this.setBackground(Color.LIGHT_GRAY);
		this.setBorder(BorderFactory.createEtchedBorder());



	}



}
