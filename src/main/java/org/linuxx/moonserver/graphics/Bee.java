package org.linuxx.moonserver.graphics;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Bee extends Frame {

	private static final long serialVersionUID = -3800165321162121122L;

	public Bee() {
		setSize(500, 100);

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(final WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void paint(final Graphics g) {
		g.drawString("\"Maja, wo bist du?\" (Mittermeier)", 120, 60);
		g.setColor(Color.RED);
		g.drawLine(0, 0, 200, 90);
	}

	public static void main(final String[] args) {
		new Bee().setVisible(true);
	}
}
