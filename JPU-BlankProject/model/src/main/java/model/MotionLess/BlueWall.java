package model.MotionLess;

import model.element.Permeability;
import model.element.Sprite;

public class BlueWall extends MotionLessElement {

	Sprite sprite =new Sprite('W',"BlueWall.png");
	
	BlueWall(final Sprite sprite, Permeability permability) {
		super(sprite, permability);
		// TODO Auto-generated constructor stub
	}

}
