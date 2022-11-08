package model.MotionLess;

import model.element.Permeability;
import model.element.Sprite;

public class BlackGround extends MotionLessElement{
	
	Sprite sprite =new Sprite('G',"BlackGround.png");

	BlackGround(Sprite sprite, Permeability permability) {
		super(sprite, permability);
		// TODO Auto-generated constructor stub
	}

}
