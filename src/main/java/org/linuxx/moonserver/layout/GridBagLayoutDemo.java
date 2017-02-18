package org.linuxx.moonserver.layout;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutDemo {
	static void addComponent(Container cont, GridBagLayout gbl, Component c, int x, int y, int width, int height,
			double weightx, double weighty) {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = width;
		gbc.gridheight = height;
		gbc.weightx = weightx;
		gbc.weighty = weighty;
		gbl.setConstraints(c, gbc);
		cont.add(c);
	}

	public static void createAndShowGUI() {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = f.getContentPane();

		GridBagLayout gbl = new GridBagLayout();
		c.setLayout(gbl);

		// x y w h wx wy
		addComponent(c, gbl, new JButton("1"), 0, 0, 2, 2, 1.0, 1.0);
		addComponent(c, gbl, new JButton("2"), 2, 0, 1, 1, 0, 1.0);
		addComponent(c, gbl, new JButton("3"), 2, 1, 1, 1, 0, 0);
		addComponent(c, gbl, new JButton("4"), 0, 2, 3, 1, 0, 1.0);
		addComponent(c, gbl, new JButton("5"), 0, 3, 2, 1, 0, 0);
		addComponent(c, gbl, new JButton("6"), 0, 4, 2, 1, 0, 0);
		addComponent(c, gbl, new JButton("7"), 2, 3, 1, 2, 0, 0);

		f.setSize(300, 200);
		f.setTitle("GridBagLayoutDemo");
		f.setVisible(true);
	}

	public static void main(final String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				createAndShowGUI();
			}
		});

	}
}
