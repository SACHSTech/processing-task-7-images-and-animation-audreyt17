	/**
  * Description: 
  * Add a background, animate a shape and an image that moves in a non-linear path, while not permenantly moving off the screen.
  * @author: Tao A
  */

import processing.core.PApplet;
import processing.core.PImage;
import java.util.Random;

public class Sketch extends PApplet {
	
	PImage bg;
  static final int WIDTH = 536;
  static final int HEIGHT = 321;
  int x = 0;
  int y = 5;
  
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(WIDTH, HEIGHT);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    bg = loadImage("background/sky.jpg");
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   * Bob changes location in a non-linear fashion in each call.
   * A cross-hair is trying to aim him.
   * @param
   * @return
   */
  public void draw() {
  
    background(bg);

    PImage fg = loadImage("image/bob.png");
    x = (x + 5) % WIDTH;
    y = ((2 * y) % HEIGHT);
    
    image(fg, x, y, 100, 100);

    fill(255, 2, 2);
    Random random = new Random();
    int r = random.nextInt(100);
    rect(x + r, y + r, 50, 3);
    rect(x + r + 25, y + r - 25, 3, 50);
    ellipse(x + r + 25, y + r, 10, 10);

  }
  // define other methods down here.
}