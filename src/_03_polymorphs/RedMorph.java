package _03_polymorphs;
import java.awt.Color;
import java.awt.Graphics;

public class RedMorph extends Polymorph {


	


		RedMorph(int x, int y) {
		super(x, y);
		System.out.println("being changed");
		// TODO Auto-generated constructor stub
	}

		

		@Override
		public void draw(Graphics g) {
			g.setColor(Color.RED);
		//	System.out.println("draw pos x"+mm.getX());
			
			g.fillRect(getX(),gety(), getW(), getH());
		}
		
	}

