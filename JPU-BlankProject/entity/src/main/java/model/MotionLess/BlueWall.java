package model.MotionLess;

import model.element.Permeability;
import model.element.Sprite;

public class BlueWall extends MotionLessElement {

	final static Sprite sprite =new Sprite('W',"BlueWall.png");
	final static Permeability permeability = Permeability.BLOCKING;
	BlueWall() {
		super(sprite, permeability);
		// TODO Auto-generated constructor stub
	}

}
