package com.epam.decorator.highlighter;

import javax.swing.JButton;
import javax.swing.JComponent;

/**
 * Decorator implementation: responsible for change button's label
 * 
 * @author Pavel
 * 
 */
public class ChangeButtonLabelDecorator implements Highlighter {
	protected Highlighter highlighter;

	public ChangeButtonLabelDecorator(final Highlighter highlighter) {
		this.highlighter = highlighter;
	}

	@Override
	public void highlight(final JComponent component) {
		this.highlighter.highlight(component);
	}

	public void changeLabel(final JButton button) {
		button.setLabel("Cursor on button");
	}

	public void revertLabelChanging(final JButton button) {
		button.setLabel("Cursor out of button");
	}

	@Override
	public void revertHighlight(JComponent component) {
		this.highlighter.revertHighlight(component);

	}

}
