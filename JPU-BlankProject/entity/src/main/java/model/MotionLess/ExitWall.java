package model.MotionLess;

import model.element.Permeability;
import model.element.Sprite;

public class ExitWall extends MotionLessElement{
	
	 final static Sprite sprite =new Sprite('F',"ExitWall.png");
	 final static Permeability permeability = Permeability.BLOCKING;
	
	 ExitWall() {
		super(sprite, permeability);
		// TODO Auto-generated constructor stub
	}

}
