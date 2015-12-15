package org.linuxx.moonserver.graphics;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class DrawPanel extends JPanel {

	@Override
	protected void paintComponent(final Graphics g) {
		super.paintComponent(g);
		g.drawLine(10, 10, 100, 50);
	}
}

public class DrawFirstLine {

	public static void main(final String[] args) {
		final JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(100, 100);
		f.add(new DrawPanel());
		f.setVisible(true);
	}
}
