package com.epam.decorator.highlighter;

import javax.swing.JComponent;

/**
 * 
 * @author Pavel
 *
 */
public interface Highlighter {
	void highlight(final JComponent component);
	void revertHighlight(final JComponent component);
}
