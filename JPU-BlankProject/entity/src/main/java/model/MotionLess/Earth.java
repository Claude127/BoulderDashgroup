package model.MotionLess;

import model.element.Permeability;
import model.element.Sprite;

public class Earth extends MotionLessElement{

	final static Sprite sprite =new Sprite('E',"Earth.png");
	final static Permeability permeability = Permeability.BLOCKING;
	Earth() {
		super(sprite, permeability);
		// TODO Auto-generated constructor stub
	}

}
