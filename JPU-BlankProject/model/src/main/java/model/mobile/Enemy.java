package model.mobile;

import model.element.Permeability;
import model.element.Sprite;
import model.model.IMap;

public class Enemy extends Mobile{
	Sprite sprite=new Sprite ('E',"Enemy.png");

	public Enemy(int x, int y, Sprite sprite, IMap map, Permeability permeability) {
		super(x, y, sprite, map, permeability);
		// TODO Auto-generated constructor stub
	}

	protected void die() {
		
	}
	
	public void move() {
		
	}
}
