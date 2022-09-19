//water tracker app
package GUI;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.Color;

public  class GUI implements ActionListener {
	
	private int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	public GUI() {
		frame = new JFrame();
		JButton button = new JButton("I drank a glass of water");
		JButton resetter = new JButton("Reset count");
		JButton deleter = new JButton("Delete last entry");
		
		button.addActionListener(this);
		resetter.addActionListener(buttonListener2);
		deleter.addActionListener(buttonListener3);
		
		/*button.setBackground(Color.CYAN);
		button.setOpaque(true);
		button.setBorderPainted(false);
		
		resetter.setBackground(Color.LIGHT_GRAY);
		resetter.setOpaque(true);
		
		deleter.setBackground(Color.LIGHT_GRAY);
		deleter.setOpaque(true);
		*/

		
		label = new JLabel();
		label.setText("Amount of water consumed: 0 oz., which is 0 glasses");
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(resetter);
		panel.add(deleter);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Water Intake Tracker");
		frame.pack();
		frame.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new GUI();
		

	}

	/*ActionListener buttonListener1 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			count++;		
			label.setText("Amount of water consumed: " + count * 8 + " oz.");
		}
	};
	*/
	

	ActionListener buttonListener2 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			count = 0;		
			label.setText("Amount of water consumed: " + count * 8 + " oz., which is " + count + " glasses");
		}
	};
	

	ActionListener buttonListener3 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (count >= 1) {
			count--;		
			label.setText("Amount of water consumed: " + count * 8 + " oz., which is " + count + " glasses");			}
			
		}
	};

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;		
		label.setText("Amount of water consumed: " + count * 8 + " oz., which is " + count + " glasses");	}

}
