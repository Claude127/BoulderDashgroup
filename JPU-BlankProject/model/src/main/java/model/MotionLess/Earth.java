package model.MotionLess;

import model.element.Permeability;
import model.element.Sprite;

public class Earth extends MotionLessElement{

	Sprite sprite =new Sprite('E',"Earth.png");
	
	Earth(Sprite sprite, Permeability permability) {
		super(sprite, permability);
		// TODO Auto-generated constructor stub
	}

}
