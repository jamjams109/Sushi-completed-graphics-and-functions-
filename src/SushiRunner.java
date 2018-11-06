
	import java.awt.Container;
	import java.awt.BorderLayout;
	import javax.swing.JFrame;
	import javax.swing.Timer;
//	import processing.core.PApplet;
//	import processing.core.PFont;
//	import processing.core.PImage;


	public class SushiRunner extends JFrame {
		private static String[] headlines = { "They See Me Rollin",
				"Soy Awesome Salmon",
				"Control Your Tempur-a",
				"Unb-eel-ievable Unagi",
				"They See Me Rollin",
				"SoFISHticated Tuna",
				"They See Me Rollin",
				"Unb-eel-ievable Unagi",
				"Control Your Tempur-a",
				"Soy Awesome Salmon" };
		
		public SushiRunner() {
			super("headlines");
			
			SushiList msgList = new SushiList(headlines);
			SushiDisplay display = new SushiDisplay(msgList);
			SushiInput inputPanel = new SushiInput(msgList);
			Container c = getContentPane();
			c.add(display, BorderLayout.CENTER);
			c.add(inputPanel, BorderLayout.SOUTH);
			
			Timer t = new Timer(125, display);
			t.start();
			
			sushiGraphics mEmbed = new sushiGraphics();
	        add(mEmbed, BorderLayout.NORTH);
	        mEmbed.init();
		}
		
		/******************************************************************/
		/***************         main       ****************/
		/******************************************************************/
		
		public static void main(String[] args) {
			SushiRunner window = new SushiRunner();
			window.setSize(600, 600);
			window.setDefaultCloseOperation(EXIT_ON_CLOSE);
			window.setVisible(true);
		}
	}



