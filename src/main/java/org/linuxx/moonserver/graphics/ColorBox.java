package org.linuxx.moonserver.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorBox extends JPanel {

	private static final long serialVersionUID = -2294685016438617741L;
	private static final Random r = new Random();

	@Override
	protected void paintComponent(final Graphics g) {
		super.paintComponent(g);

		for (int y = 12; y < getHeight() - 25; y += 30) {
			for (int x = 12; x < getWidth() - 25; x += 30) {
				g.setColor(new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
				g.fillRect(x, y, 25, 25);
				g.setColor(Color.BLACK);
				g.drawRect(x - 1, y - 1, 25, 25);
			}
		}
	}

	public static void main(final String[] args) {
		final JFrame f = new JFrame("Neoplastizismus");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 300);
		f.add(new ColorBox());
		f.setVisible(true);
	}
}
