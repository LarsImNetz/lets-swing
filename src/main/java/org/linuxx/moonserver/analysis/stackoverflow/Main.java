package org.linuxx.moonserver.analysis.stackoverflow;

import javax.swing.SwingUtilities;

public class Main {
  public static void main(final String[] args) {
      final String text = "Mir Schnurz"; // args[0];
      SwingUtilities.invokeLater(new Runnable() {

          public void run() {
              final MyWindow wnd = new MyWindow(text);
              wnd.setVisible(true);
          }
      });
  }
}