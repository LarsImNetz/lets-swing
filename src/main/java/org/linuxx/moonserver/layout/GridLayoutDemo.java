package org.linuxx.moonserver.layout;

import java.awt.GridLayout;
import java.text.NumberFormat;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GridLayoutDemo {
	public static void createAndShowGUI() {
		final JFrame f = new JFrame();
		f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		f.setLayout( new GridLayout(/*3*/ 0, 2, 6, 3) );

		f.add( new JLabel(" Wie heißt du denn, mein Kleiner?") );
		f.add( new JTextField() );
		f.add( new JLabel(" Na, wie alt bist du denn?") );
		f.add( new JFormattedTextField(NumberFormat.getIntegerInstance()) );
		f.add( new JLabel(" Dann mal das Passwort eingeben:") );
		f.add( new JPasswordField() );

		f.pack();
		f.setTitle("GridLayoutDemo");
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
