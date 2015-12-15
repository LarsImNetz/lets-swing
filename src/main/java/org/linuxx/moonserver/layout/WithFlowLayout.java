package org.linuxx.moonserver.layout;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WithFlowLayout {

	public static void createAndShowGUI() {
		final JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());

		final JComboBox<String> choice = new JComboBox<String>();
		choice.addItem("Mike: Mein Gott Walter");
		choice.addItem("Sweet: Co Co");

		f.add(choice);
		f.add(new JButton(new ImageIcon(WithFlowLayout.class.getResource("/images/32x32_play.png"))));

		f.add(new JLabel(new ImageIcon(WithFlowLayout.class.getResource("/images/16x16.png"))));
		f.add(new JLabel(new ImageIcon(WithFlowLayout.class.getResource("/images/32x32.png"))));
		f.add(new JLabel(new ImageIcon(WithFlowLayout.class.getResource("/images/48x48.png"))));
		f.add(new JLabel(new ImageIcon(WithFlowLayout.class.getResource("/images/64x64.png"))));

		f.pack();
		f.setVisible(true);
	}

	public static void main(final String[] args) {
		//Schedule a job for the event-dispatching thread:
		//creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				createAndShowGUI();
			}
		});

	}
}
