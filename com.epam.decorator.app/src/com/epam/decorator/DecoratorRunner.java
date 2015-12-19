package com.epam.decorator;

import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * Class creates frame
 * @author Pavel
 *
 */
public class DecoratorRunner {

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new TestFrame();
		frame.setPreferredSize(new Dimension(330, 160));
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
