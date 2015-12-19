package com.epam.decorator.highlighter;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComponent;

import com.epam.decorator.TestFrame;

/**
 * Class which is responcible for highlighting of button
 * @author Pavel
 *
 */
public class ButtonHighlighter implements Highlighter{

	@Override
	public void highlight(final JComponent component) {
		JButton button = (JButton) component;
		button.setBackground(Color.YELLOW);
	}

	@Override
	public void revertHighlight(JComponent component) {
		JButton button = (JButton) component;
		button.setBackground(TestFrame.BASE_COLOR);
		
	}

}
