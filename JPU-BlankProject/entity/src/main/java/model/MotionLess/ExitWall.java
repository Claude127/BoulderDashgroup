package model.MotionLess;

import model.element.Permeability;
import model.element.Sprite;

public class ExitWall extends MotionLessElement{
	
	Sprite sprite =new Sprite('F',"ExitWall.png");

	ExitWall(Sprite sprite, Permeability permability) {
		super(sprite, permability);
		// TODO Auto-generated constructor stub
	}

}
