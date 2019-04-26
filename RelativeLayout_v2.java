package hydra;


/**
  * CopyLeft (CL) Atharva Kale 2019
  *
  *
  * Licensed under GNU GPL v3.0
  *
  *
  * You are free to use this code to develop your own Java
  * GUI Application. ;)
  */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RelativeLayout_v2 extends JLabel {
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
	public RelativeLayout_v2() {
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
			// ref as: RelativeLayout_v2.TOP
			if(childW <= parentW) {
				thisX = parentX + (int)(parentW / 2) - (int)(childW / 2);
				thisY = parentY - childH - 15;
			} else if(childW >= parentW) {
				thisX = parentX - (int)(childW / 2) + (int)(parentW / 2);
				thisY = parentY - childH - 15;
			}
			child.setLocation(thisX, thisY);
		} else if(where == BOTTOM) {
			// ref as: RelativeLayout_v2.BOTTOM
			if(childW <= parentW) {
				thisX = parentX + (int)(parentW / 2) - (int)(childW / 2);
				thisY = parentY + parentH + 15;
			} else if(childW >= parentW) {
				thisX = parentX - (int)(childW / 2) + (int)(parentW / 2);
				thisY = parentY + parentH + 15;
			}
			child.setLocation(thisX, thisY);
		} else if(where == LEFT) {
			// ref as: RelativeLayout.LEFT
			if(childH <= parentH) {
				thisX = parentX - childW - 15;
				thisY = parentY + (int)(parentH / 2) - (int)(childH / 2);
			} else if(childH >= parentH) {
				thisX = parentX - childW - 15;
				thisY = parentY - (int)(childH / 2) + (int)(parentH / 2);
			}
			child.setLocation(thisX, thisY);
		} else if(where == RIGHT) {
			// ref as: RelativeLayout.RIGHT
			if(childH <= parentH) {
				thisX = parentX + childW + 15;
				thisY = parentY + (int)(parentH / 2) - (int)(childH / 2);
			} else if(childH >= parentH) {
				thisX = parentX + parentW + 15;
				thisY = parentY - (int)(childH / 2) + (int)(parentH / 2);
			}
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
			// ref as: RelativeLayout_v2.TOP
			if(childW <= parentW) {
				thisX = parentX + (int)(parentW / 2) - (int)(childW / 2);
				thisY = parentY - childH - gap;
			} else if(childW >= parentW) {
				thisX = parentX - (int)(childW / 2) + (int)(parentW / 2);
				thisY = parentY - childH - gap;
			}
			child.setLocation(thisX, thisY);
		} else if(where == BOTTOM) {
			// ref as: RelativeLayout_v2.BOTTOM
			if(childW <= parentW) {
				thisX = parentX + (int)(parentW / 2) - (int)(childW / 2);
				thisY = parentY + parentH + gap;
			} else if(childW >= parentW) {
				thisX = parentX - (int)(childW / 2) + (int)(parentW / 2);
				thisY = parentY + parentH + gap;
			}
			child.setLocation(thisX, thisY);
		} else if(where == LEFT) {
			// ref as: RelativeLayout.LEFT
			if(childH <= parentH) {
				thisX = parentX - childW - gap;
				thisY = parentY + (int)(parentH / 2) - (int)(childH / 2);
			} else if(childH >= parentH) {
				thisX = parentX - childW - gap;
				thisY = parentY - (int)(childH / 2) + (int)(parentH / 2);
			}
			child.setLocation(thisX, thisY);
		} else if(where == RIGHT) {
			// ref as: RelativeLayout.RIGHT
			if(childH <= parentH) {
				thisX = parentX + childW + gap;
				thisY = parentY + (int)(parentH / 2) - (int)(childH / 2);
			} else if(childH >= parentH) {
				thisX = parentX + parentW + gap;
				thisY = parentY - (int)(childH / 2) + (int)(parentH / 2);
			}
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

	public void $(Component child, int where, Component parent) {
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
			// ref as: RelativeLayout_v2.TOP
			if(childW <= parentW) {
				thisX = parentX + (int)(parentW / 2) - (int)(childW / 2);
				thisY = parentY - childH - 15;
			} else if(childW >= parentW) {
				thisX = parentX - (int)(childW / 2) + (int)(parentW / 2);
				thisY = parentY - childH - 15;
			}
			child.setLocation(thisX, thisY);
		} else if(where == BOTTOM) {
			// ref as: RelativeLayout_v2.BOTTOM
			if(childW <= parentW) {
				thisX = parentX + (int)(parentW / 2) - (int)(childW / 2);
				thisY = parentY + parentH + 15;
			} else if(childW >= parentW) {
				thisX = parentX - (int)(childW / 2) + (int)(parentW / 2);
				thisY = parentY + parentH + 15;
			}
			child.setLocation(thisX, thisY);
		} else if(where == LEFT) {
			// ref as: RelativeLayout.LEFT
			if(childH <= parentH) {
				thisX = parentX - childW - 15;
				thisY = parentY + (int)(parentH / 2) - (int)(childH / 2);
			} else if(childH >= parentH) {
				thisX = parentX - childW - 15;
				thisY = parentY - (int)(childH / 2) + (int)(parentH / 2);
			}
			child.setLocation(thisX, thisY);
		} else if(where == RIGHT) {
			// ref as: RelativeLayout.RIGHT
			if(childH <= parentH) {
				thisX = parentX + childW + 15;
				thisY = parentY + (int)(parentH / 2) - (int)(childH / 2);
			} else if(childH >= parentH) {
				thisX = parentX + parentW + 15;
				thisY = parentY - (int)(childH / 2) + (int)(parentH / 2);
			}
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

	public void $(Component child, int where, Component parent, int gap) {
		parentX = parent.getX();
		parentY = parent.getY();
		parentW = parent.getWidth();
		parentH = parent.getHeight();

		childX = child.getX();
		childY = child.getY();
		childW = child.getWidth();
		childH = child.getHeight();

		if(where == TOP) {
			// ref as: RelativeLayout_v2.TOP
			if(childW <= parentW) {
				thisX = parentX + (int)(parentW / 2) - (int)(childW / 2);
				thisY = parentY - childH - gap;
			} else if(childW >= parentW) {
				thisX = parentX - (int)(childW / 2) + (int)(parentW / 2);
				thisY = parentY - childH - gap;
			}
			child.setLocation(thisX, thisY);
		} else if(where == BOTTOM) {
			// ref as: RelativeLayout_v2.BOTTOM
			if(childW <= parentW) {
				thisX = parentX + (int)(parentW / 2) - (int)(childW / 2);
				thisY = parentY + parentH + gap;
			} else if(childW >= parentW) {
				thisX = parentX - (int)(childW / 2) + (int)(parentW / 2);
				thisY = parentY + parentH + gap;
			}
			child.setLocation(thisX, thisY);
		} else if(where == LEFT) {
			// ref as: RelativeLayout.LEFT
			if(childH <= parentH) {
				thisX = parentX - childW - gap;
				thisY = parentY + (int)(parentH / 2) - (int)(childH / 2);
			} else if(childH >= parentH) {
				thisX = parentX - childW - gap;
				thisY = parentY - (int)(childH / 2) + (int)(parentH / 2);
			}
			child.setLocation(thisX, thisY);
		} else if(where == RIGHT) {
			// ref as: RelativeLayout.RIGHT
			if(childH <= parentH) {
				thisX = parentX + childW + gap;
				thisY = parentY + (int)(parentH / 2) - (int)(childH / 2);
			} else if(childH >= parentH) {
				thisX = parentX + parentW + gap;
				thisY = parentY - (int)(childH / 2) + (int)(parentH / 2);
			}
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
