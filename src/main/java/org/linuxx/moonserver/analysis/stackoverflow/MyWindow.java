package org.linuxx.moonserver.analysis.stackoverflow;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class MyWindow extends JFrame {
  public MyWindow(final String text) {
      super("My Window");

      setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
      addWindowListener(new WindowAdapter() {
          @Override
          public void windowClosing(final WindowEvent e) {
              MyWindow.this.setVisible(false);
              MyWindow.this.dispose();
          }
      });

      final JButton btn = new JButton(text);
      btn.addActionListener(new ActionListener() {
          public void actionPerformed(final ActionEvent e) {
              JOptionPane.showMessageDialog(MyWindow.this, "Button Pressed", "Hey", JOptionPane.INFORMATION_MESSAGE);
          }
      });

      setLayout(new FlowLayout());
      add(btn);
      pack();
  }
}