package cn.acely.ui;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class XScrollPane extends JScrollPane{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final LineBorder BORDER = new LineBorder(new Color(0,0,0,80), 2, true);

	public XScrollPane() {
		super();
		setBorder(BORDER);
	}

	public XScrollPane(Component view, int vsbPolicy, int hsbPolicy) {
		super(view, vsbPolicy, hsbPolicy);
		setBorder(BORDER);
	}

	public XScrollPane(Component view) {
		super(view);
		setBorder(BORDER);
	}

	public XScrollPane(int vsbPolicy, int hsbPolicy) {
		super(vsbPolicy, hsbPolicy);
		setBorder(BORDER);
	}

	
}
