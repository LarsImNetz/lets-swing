package org.linuxx.moonserver.layout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.linuxx.moonserver.toolbar.MyToolbar;

public class WithJPanel {

	public static JPanel createToolbar() {
		MyToolbar myToolbar = new MyToolbar();
		return myToolbar.createToolbar();
	}

	public static void createAndShowGUI() {
		JFrame f = new JFrame();
		// f.setSize(400, 150);
		f.add(createToolbar());
		f.pack(); // HINT: setzt die Größe des Frames, abhängig vom Inhalt!
		f.setTitle("WithJPanel");
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
