package com.imj.study_java.template;

import java.awt.Container;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChatServerGUI extends JFrame {

	/**
	 * ChatServerGUI's serial version UID.
	 */
	private static final long serialVersionUID = 1L;
	
	private final static Logger _log = Logger.getGlobal();
	
	public void drawChatServerGUI() {
		// x좌표, y좌표, 길이(width), 높이(height).
		setBounds(100, 100, 700, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = this.getContentPane();
		JPanel pane = new JPanel();
		JButton buttonStart = new JButton("Start");
		buttonStart.setMnemonic('S');
		
		pane.add(buttonStart);
		container.add(pane);
		
		setVisible(true);
	}
	
}
