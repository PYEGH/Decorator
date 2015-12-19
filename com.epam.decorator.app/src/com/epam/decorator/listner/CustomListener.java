package com.epam.decorator.listner;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import com.epam.decorator.highlighter.ButtonHighlighter;
import com.epam.decorator.highlighter.ChangeButtonLabelDecorator;

/**
 * Listener which listen for mouse actions
 * 
 * @author Pavel
 * 
 */
public class CustomListener implements MouseListener {

	/**
	 * Here Decorator pattrn work is shown
	 */
	public void mouseEntered(MouseEvent e) {
		JButton button = (JButton) e.getSource();
		ChangeButtonLabelDecorator decorator = new ChangeButtonLabelDecorator(
				new ButtonHighlighter());
		decorator.highlight(button);
		decorator.changeLabel(button);
	}

	/**
	 * Here Decorator pattrn work is shown
	 */
	public void mouseExited(MouseEvent e) {
		JButton button = (JButton) e.getSource();
		ChangeButtonLabelDecorator decorator = new ChangeButtonLabelDecorator(
				new ButtonHighlighter());
		decorator.revertHighlight(button);
		decorator.revertLabelChanging(button);
	}

	public void mousePressed(MouseEvent e) {

	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseClicked(MouseEvent e) {

	}
}
