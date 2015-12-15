package org.linuxx.moonserver.events;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class DialogWindowClosingListener2 extends WindowAdapter
{
  @Override public void windowClosing( WindowEvent event )
  {
    int option = JOptionPane.showConfirmDialog( null, "Applikation beenden?" );
    if ( option == JOptionPane.OK_OPTION )
      System.exit( 0 );
  }
}
