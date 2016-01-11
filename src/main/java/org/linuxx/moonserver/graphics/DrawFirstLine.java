package org.linuxx.moonserver.graphics;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class XY {
	int x;
	int y;

	int xStep;
	int yStep;

	static int XMAX = 200;
	static int YMAX = 200;

	public XY(int x, int y, int xStep, int yStep) {
		this.x = x;
		this.y = y;
		this.xStep = xStep;
		this.yStep = yStep;
	}

	public void incXY() {
		x += xStep;
		if (x >= XMAX || x <= 0) {
			xStep = -xStep;
			x += xStep;
		}

		y += yStep;
		if (y >= YMAX || y <= 0) {
			yStep = -yStep;
			y += yStep;
		}
	}
}

@SuppressWarnings("serial")
class DrawPanel extends JPanel {

	XY p1 = new XY(0, 0, 5, 6);
	XY p2 = new XY(50, 20, 4, 3);

	@Override
	protected void paintComponent(final Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < 500; i++) {
			g.drawLine(p1.x, p1.y, p2.x, p2.y);
			p1.incXY();
			p2.incXY();
//			try {
//				Thread.sleep(1);
//			} catch (InterruptedException ex) {
//			}
		}
	}
}

public class DrawFirstLine {

	public static void main(final String[] args) {
		final JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(200, 200);
		f.add(new DrawPanel());
		f.setVisible(true);
	}
}
