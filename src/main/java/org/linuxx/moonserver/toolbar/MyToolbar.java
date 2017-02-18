package org.linuxx.moonserver.toolbar;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import org.linuxx.moonserver.layout.WithFlowLayout;

public class MyToolbar {
	public MyToolbar() {
		
	}
	
	public JPanel createToolbar() {
		// Toolbar
		final JPanel p = new JPanel();

		TitledBorder titledBorder = new TitledBorder(new LineBorder(Color.black));
		titledBorder.setTitle("Toolbar");
		p.setBorder(titledBorder);

		p.add(new JLabel(new ImageIcon(WithFlowLayout.class.getResource("/images/48x48.png"))));
		p.add(new JLabel(new ImageIcon(WithFlowLayout.class.getResource("/images/48x48.png"))));
		p.add(new JLabel(new ImageIcon(WithFlowLayout.class.getResource("/images/48x48.png"))));
		p.add(new JLabel(new ImageIcon(WithFlowLayout.class.getResource("/images/48x48.png"))));
		p.add(new JLabel(new ImageIcon(WithFlowLayout.class.getResource("/images/48x48.png"))));
		p.add(new JLabel(new ImageIcon(WithFlowLayout.class.getResource("/images/48x48.png"))));

		LayoutManager manager = p.getLayout();
		if (manager instanceof FlowLayout) {
			FlowLayout flowlayout = (FlowLayout)manager;
			flowlayout.setAlignment(FlowLayout.LEFT);
		}
		p.setSize(400, 48 + 5 + 5 + 20);
		return p;
		
	}
}
