import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{
size(400, 400);
}
public void draw()
{
  outline();
  shapes();
}

public void outline() {
	background(255, 255, 255);
	fill(0);
	rect(0, 275, 330, 5); 
	rect(250, 0, 5, 400); 
	rect(330, 0, 5, 400); 
	rect(330, 205, 400, 5); 
	rect(250, 70, 80, 5);
	rect(330, 155, 400, 5);
}

public void shapes() {
	fill(219, 0, 0); 
	rect(0, 0, 250, 275); 
	fill(252, 221, 20);
	rect(255, 0, 75, 70); 
	fill(252, 220, 20);
	rect(335, 210, 65, 190); 
	fill(60, 0, 255);
	rect(335, 160, 65, 45); 
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
