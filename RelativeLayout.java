package hydra_j;

// Package: Hydra
// Class  : public~RelativeLayout

// RelativeLayoutv1.0

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RelativeLayout extends JLabel {
	public static int TOP  			= 1;
	public static int BOTTOM 		= 2;
	public static int LEFT  		= 3;
	public static int RIGHT  		= 4;
	public static int TOP_LEFT		= 5; // inoperative
	public static int TOP_RIGHT		= 6; // inoperative
	public static int BOTTOM_LEFT 	= 7; // inoperative
	public static int BOTTOM_RIGHT 	= 8; // inoperative

	private static int parentX, parentY, parentW, parentH;
	private static int childX,  childY,  childW,  childH;
	private static int thisX, thisY;
	private static int flag;

	// Constructor
	public RelativeLayout() {
		// Do-Nothing
	}

	// Method
	public void $(JComponent child, int where, JComponent parent) {
		// var parent
		parentX = parent.getX();
		parentY = parent.getY();
		parentW = parent.getWidth();
		parentH = parent.getHeight();

		// var child
		childX = child.getX();
		childY = child.getY();
		childW = child.getWidth();
		childH = child.getHeight();

		if(where == TOP) {
			// ref as: RelativeLayout.TOP
			thisX = parentX;
			thisY = parentY - 15 - childH;
			child.setLocation(thisX, thisY);
		} else if(where == BOTTOM) {
			// ref as: RelativeLayout.BOTTOM
			thisX = parentX;
			thisY = parentY + parentH + 15;
			child.setLocation(thisX, thisY);
		} else if(where == LEFT) {
			// ref as: RelativeLayout.LEFT
			thisX = parentX - childW - 15;
			thisY = parentY;
			child.setLocation(thisX, thisY);
		} else if(where == RIGHT) {
			// ref as: RelativeLayout.RIGHT
			thisX = parentX + parentW + 15;
			thisY = parentY;
			child.setLocation(thisX, thisY);
		} else {
			// ErrorFlag
			flag = 1;
		}

		if(flag == 1) {
			// ErrorLabel
			setText("hydra.RelativeLayout.Error >> invalid position variable");
			setForeground(new Color(255, 0, 0));
			setBounds(150, 10, 500, 20);
		}
	}

	// Method
	public void $(JComponent child, int where, JComponent parent, int gap) {
		parentX = parent.getX();
		parentY = parent.getY();
		parentW = parent.getWidth();
		parentH = parent.getHeight();

		childX = child.getX();
		childY = child.getY();
		childW = child.getWidth();
		childH = child.getHeight();

		if(where == TOP) {
			// ref as: RelativeLayout.TOP
			thisX = parentX;
			thisY = parentY - gap - childH;
			child.setLocation(thisX, thisY);
		} else if(where == BOTTOM) {
			// ref as: RelativeLayout.BOTTOM
			thisX = parentX;
			thisY = parentY + parentH + gap;
			child.setLocation(thisX, thisY);
		} else if(where == LEFT) {
			// ref as: RelativeLayout.LEFT
			thisX = parentX - childW - gap;
			thisY = parentY;
			child.setLocation(thisX, thisY);
		} else if(where == RIGHT) {
			// ref as: RelativeLayout.RIGHT
			thisX = parentX + parentW + gap;
			thisY = parentY;
			child.setLocation(thisX, thisY);
		} else {
			// ErrorFlag
			flag = 1;
		}

		if(flag == 1) {
			// ErrorLabel
			setText("hydra.RelativeLayout.Error >> invalid position variable");
			setForeground(new Color(255, 0, 0));
			setBounds(150, 10, 500, 20);
		}
	}
}
