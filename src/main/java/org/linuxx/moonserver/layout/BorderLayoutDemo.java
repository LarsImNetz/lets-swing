package org.linuxx.moonserver.layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo {

	public static void createAndShowGUI() {
		final JFrame f = new JFrame();
		f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
//		  applyComponentOrientation( ComponentOrientation.RIGHT_TO_LEFT );

		f.setLayout( new BorderLayout(5, 5) );

		f.add( new JButton("Nie"), BorderLayout.PAGE_START );
		f.add( new JButton("ohne"), BorderLayout.LINE_END );
		f.add( new JButton("Seife"), BorderLayout.PAGE_END );
		f.add( new JButton("waschen"), BorderLayout.LINE_START );
		f.add( new JButton("Center") );

		f.setSize( 400, 150 );
		f.setVisible( true );
		
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
