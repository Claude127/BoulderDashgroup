package model.mobile;

import model.element.Permeability;
import model.element.Sprite;
import model.model.IMap;

public class Diamond extends Mobile {
	
	Sprite sprite= new Sprite('D',"Diamond .png");
	

	public Diamond(int x, int y, Sprite sprite, IMap map, Permeability permeability) {
		super(x, y, sprite, map, permeability);
		// TODO Auto-generated constructor stub
	}
	
	protected void die() {
		
	}
	
	public void  multiplie() {
		
	}
	
	public  void pushMove() {
		
	}

}
