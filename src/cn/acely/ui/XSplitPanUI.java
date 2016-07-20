package cn.acely.ui;


import java.awt.Graphics;

import javax.swing.plaf.basic.BasicSplitPaneDivider;
import javax.swing.plaf.basic.BasicSplitPaneUI;


public class XSplitPanUI extends BasicSplitPaneUI {

	public XSplitPanUI() {
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public BasicSplitPaneDivider createDefaultDivider() {
		// TODO Auto-generated method stub
		BasicSplitPaneDivider divider = new BasicSplitPaneDivider(this){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			int gap = 5;

			@Override
			public void paint(Graphics g) {
//				super.paint(g);
			}
		};
		return divider;
	}
}
