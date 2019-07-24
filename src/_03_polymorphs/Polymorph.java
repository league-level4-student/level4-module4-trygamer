package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Polymorph {
    int x;
    int y;
    int w =50;
    int h =50;
    Color c = Color.BLUE;
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
    
    public int getX() {
    	return x;
    }
  public int gety() {
    	return y;
    }
    
    public void setX(int i) {
    	x= i;
    }
    
    public  void setY(int i) {
    	y=i;
    }
    public int getH() {
    	return h;
    }
    public int getW() {
    	return w;
    }
    public  void setW(int i) {
    	w=i;
    }
    public  void setH(int i) {
    	h=i;
    }


}
    

