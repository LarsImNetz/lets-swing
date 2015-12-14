package org.linuxx.moonserver;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonSwing {
	public static void createAndShowGUI() {
		// create and set up the window
		final JFrame frame = new JFrame("ButtonSwing");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.setSize(250,  100);
    
    // add the ubiquitous "Hello World" label
    final JLabel label = new JLabel("Hello World Label");
    frame.add(label);
    
    final JButton button = new JButton("drück mich!");
    frame.add(button);
    
    
    // frame.pack();

    // Display the window
    frame.setVisible(true);
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
