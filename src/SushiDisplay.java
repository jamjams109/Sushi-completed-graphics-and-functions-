

	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.Font;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import javax.swing.JPanel;

	public class SushiDisplay extends JPanel implements ActionListener {
		private SushiList msgList;
		private static final int CONSTANT = 200;
		private int xOffset;
		private int yOffset;
		private Font myFont;
		
		public SushiDisplay(SushiList msgList) {
			this.msgList = msgList;
			myFont = new Font("Serif", Font.PLAIN, 20);
			setBackground(Color.WHITE);
			xOffset = -CONSTANT;
			yOffset = CONSTANT;
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			if (xOffset == -CONSTANT)
				xOffset = getWidth();
			
			if (msgList != null) {
				g.setFont(myFont);
				int nLines = (getWidth() - xOffset) / CONSTANT + 6;
				msgList.draw(g, xOffset, yOffset, CONSTANT, nLines);
			}
		}
		
		public void actionPerformed(ActionEvent e) {
			xOffset -= 7.25;
			if (xOffset <= 0) {
				xOffset += CONSTANT;
				msgList.scrollUp();
			}
			repaint();
		}
	}


