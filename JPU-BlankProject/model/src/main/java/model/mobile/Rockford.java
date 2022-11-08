package model.mobile;

import java.io.IOException;

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

	
	public Rockford(int x, int y, Sprite sprite, IMap map) throws IOException {
		super(x, y, sprite, map,Permeability.BLOCKING  );
		spriteTurnLeft.loadImage();
		spriteTurnRigth.loadImage();
		spriteUp.loadImage();
		spriteDown.loadImage();
		spriteDie.loadImage();
		sprite.loadImage();
		// TODO Auto-generated constructor stub
	}
	public void moveUp() {
		
	}
	
	public void moveDown() {
		
	}
	
	public void moveRigth() {
		
	}
	
	public void moveLeft() {
		super.moveLeft();
		this.setSprite(spriteTurnLeft);
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
