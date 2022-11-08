package model.mobile;

import model.element.Permeability;
import model.element.Sprite;
import model.model.IMap;

public class Rockford extends Mobile {
	Sprite sprite =new Sprite('H',"Rockford.png");
	Sprite spriteTurnLeft =new Sprite('H',"Left.png");
	Sprite spriteTurnRigth =new Sprite('H',"Rigth.png");
	Sprite spriteUp =new Sprite('H',"Up.png");
	Sprite spriteDown =new Sprite('H',"Down.png");
	Sprite spriteDie =new Sprite('H',"Die.png");

	
	public Rockford(int x, int y, Sprite sprite, IMap map, Permeability permeability) {
		super(x, y, sprite, map, permeability);
		// TODO Auto-generated constructor stub
	}
	public void moveUp() {
		
	}
	
	public void moveDown() {
		
	}
	
	public void moveRigth() {
		
	}
	
	public void moveLeft() {
		
	}
	
	public void push() {
		
	}
	
	public void recover() {
		
	}
	
	public void doNothing() {
		
	}
	
	protected  void die() {
		
	}

}
