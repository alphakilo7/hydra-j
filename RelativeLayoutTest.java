import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import hydra.RelativeLayout;

public class RelativeLayoutTest {
	JFrame fr;
	JButton parent, above, bottom, left, right;
	RelativeLayout rel;

	public AppTest() {
		fr = new JFrame("AppTest");
		fr.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		fr.setLayout(null);

		RelativeLayout rlay = new RelativeLayout();

		parent = new JButton("Parent"); // Parent
		parent.setBounds(400, 250, 100, 40); // You must set bounds for parent
		above  = new JButton("Top");// child
		above.setSize(100, 40); // child-size
		bottom = new JButton("Bottom"); // child
		bottom.setSize(100, 40); // child-size
		left   = new JButton("Left");// child
		left.setSize(100, 40); // child-size
		right  = new JButton("Right"); // child
		right.setSize(100, 40); // child-size

		rlay.$(above, 	RelativeLayout.TOP, 	parent, 0); // for relating 'above' and 'parent'
		rlay.$(bottom, 	RelativeLayout.BOTTOM, 	parent, 10);// for relating 'bottom' and 'parent'
		rlay.$(left,	RelativeLayout.LEFT,	parent, 20);// for relating 'left' and 'parent'
		rlay.$(right,	RelativeLayout.RIGHT,	parent, 30);// for relating 'right' and 'parent'

		fr.add(rlay); // the RelativeLayout object
		fr.add(parent); fr.add(above); fr.add(bottom); fr.add(left);
		fr.add(right);

		fr.setVisible(true);
	}

	public static void main(String[] args) {
		new RelativeLayoutTest();
	}
}
