package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{

    float playerX, playerY, playerWidth;

	public void settings()
	{
		size(500, 500);
        

	}

	public void setup() 
    {
        colorMode(RGB);
        playerX = (100);
        playerY = (250);
        playerWidth = (100);
	}
	
    void drawPlayer(float x, float y, float w){
        strokeWeight(5);
        stroke(0, 0, 0);
        line(x, y, w, 250);

    }

	public void draw()
	{	
        drawPlayer(playerX, playerY, playerWidth);
	}

    public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			System.out.println("Left arrow pressed");
           
		}
		if (keyCode == RIGHT)
		{
			System.out.println("Right arrow pressed");
		}
		if (key == ' ')
		{
			System.out.println("SPACE key pressed");
		}
	}	
}
