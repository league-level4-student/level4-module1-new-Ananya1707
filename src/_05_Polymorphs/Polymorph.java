package _05_Polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    int x;
    int y;
    private int width;
    private int height;
    
    public Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    
    public int getWidth() {
    	return width;
    }
    
    public int getHeight() {
    	return height;
    }
    
    public abstract void update();
    
    public abstract void draw(Graphics g);
}
