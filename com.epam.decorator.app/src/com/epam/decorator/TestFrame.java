package com.epam.decorator;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.epam.decorator.listner.CustomListener;

/**
 * Frame implementation
 * 
 * @author Pavel
 * 
 */
public class TestFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1331973113154531773L;
	public static final Color BASE_COLOR = Color.GREEN;

	public TestFrame() {
		super("Administrative panel");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());

		JPanel buttonsPanel = new JPanel();

		JButton button1 = new JButton("Cursor out of  button");
		JButton button2 = new JButton("Cursor out of  button");
		button2.setBackground(BASE_COLOR);
		button1.setBackground(BASE_COLOR);

		buttonsPanel.add(button1);
		buttonsPanel.add(button2);

		// At CustomListener Decorator pattern using will be shown
		button1.addMouseListener(new CustomListener());
		button2.addMouseListener(new CustomListener());

		mainPanel.add(buttonsPanel, BorderLayout.NORTH);
		getContentPane().add(mainPanel);
	}
}