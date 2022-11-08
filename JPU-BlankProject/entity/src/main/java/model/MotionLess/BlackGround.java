package model.MotionLess;

import model.element.Permeability;
import model.element.Sprite;

public class BlackGround extends MotionLessElement{
	
	final static Sprite sprite =new Sprite('G',"BlackGround.png");
final static Permeability permeability = Permeability.PENETRABLE;
	BlackGround() {
		super(sprite, permeability);
		// TODO Auto-generated constructor stub
	}

}
