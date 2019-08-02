package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MoveMorph extends Polymorph {

	MoveMorph(int x, int y) {
		
		super(x, y);
	
		// TODO Auto-generated constructor stub
	}
	
	RedMorph mm;
	Polymorph m;
	

	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
		System.out.println("orig"+getX());
		
		
		
		 	
			

setX(getX()+1);
setY(gety()+1);

System.out.println("move pos"+getX());
	

		
		
	}



	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.RED);
		//	System.out.println("draw pos x"+mm.getX());
			
			g.fillRect(getX(),gety(), getW(), getH());
		
	}



	




	
	
	
	
}
