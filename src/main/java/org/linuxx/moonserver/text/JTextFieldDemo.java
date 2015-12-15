package org.linuxx.moonserver.text;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextFieldDemo {
	public static void createAndShowGUI() {
		final JFrame frame = new JFrame();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		final JTextField input = new JTextField( "12 * 3 + 2", 20 );
		input.addActionListener( new ActionListener() {
			public void actionPerformed( final ActionEvent e ) {
		    try {
		      input.setText( "" +
		        new ScriptEngineManager().getEngineByName("JavaScript")
		                                 .eval(input.getText()) );
		    }
		    catch ( final ScriptException ex ) {
		      ex.printStackTrace();
		    }
		  }
		} );
		frame.add( input );
		frame.pack();
		frame.setVisible( true );
		
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
