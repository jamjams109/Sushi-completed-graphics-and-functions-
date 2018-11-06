import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class sushiGraphics extends PApplet {
	private PImage tempura, tuna, salmon, beef, unagi;
	private int xCoord1, xCoord2, xCoord3, xCoord4, xCoord5, xCoord6, xCoord7, xCoord8, xCoord9, xCoord10;
	private int c = 200;
	
	public void setup() {
		xCoord1 = 600;
		xCoord2 = xCoord1 + c;
		xCoord3 = xCoord1 + (2 * c);
		xCoord4 = xCoord1 + (3 * c);
		xCoord5 = xCoord1 + (4 * c);
		xCoord6 = xCoord1 + (5 * c);
		xCoord7 = xCoord1 + (6 * c);
		xCoord8 = xCoord1 + (7 * c);
		xCoord9 = xCoord1 + (8 * c);
		xCoord10 = xCoord1 + (9 * c);
		
        size(600, 200);
        tempura = loadImage("tempura.png");
        tuna = loadImage("tuna.png");
        salmon = loadImage("salmon.png");
        beef = loadImage("beef.png");
        unagi = loadImage("unagi.png");
        
        tempura.resize(50, 50);
        tuna.resize(50, 50);
        salmon.resize(50, 50);
        beef.resize(50, 50);
        unagi.resize(50, 50);
    }

    public void draw() {
    	background(0);
    	if(xCoord1 < 0)
    		xCoord1 = c * 10;
    	if(xCoord2 < 0)
			xCoord2 = c * 10;
    	if(xCoord3 < 0)
			xCoord3 = c * 10;
    	if(xCoord4 < 0)
			xCoord4 = c * 10;
    	if(xCoord5 < 0)
			xCoord5 = c * 10;
    	if(xCoord6 < 0)
			xCoord6 = c * 10;
    	if(xCoord7 < 0)
			xCoord7 = c * 10;
    	if(xCoord8 < 0)
			xCoord8 = c * 10;
		if(xCoord9 < 0)
			xCoord9 = c * 10;
		if(xCoord10 < 0)
			xCoord10 = c * 10;
    	
    	image(beef, xCoord1--, 50);
    	image(salmon, xCoord2--, 50);
    	image(tempura, xCoord3--, 50);
    	image(unagi, xCoord4--, 50);
    	image(beef, xCoord5--, 50);
    	image(tuna, xCoord6--, 50);
    	image(beef, xCoord7--, 50);
    	image(unagi, xCoord8--, 50);
    	image(tempura, xCoord9--, 50);
    	image(salmon, xCoord10--, 50);
    }
}
