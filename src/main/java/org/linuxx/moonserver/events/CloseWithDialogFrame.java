package org.linuxx.moonserver.events;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CloseWithDialogFrame
{
  public static void main( String[] args )
  {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.DO_NOTHING_ON_CLOSE );
    f.add( new JLabel( "Zyklone bringen Regen" ) );
    f.pack();
    f.addWindowListener( new DialogWindowClosingListener2() );
    f.setVisible( true );
  }
}