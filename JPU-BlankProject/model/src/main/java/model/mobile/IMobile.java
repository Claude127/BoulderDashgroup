package model.mobile;

import java.awt.Point;

import fr.exia.showboard.IPawn;
import model.element.IDisplayableElement;

public interface IMobile extends IPawn ,IDisplayableElement{

	public void moveUp();
	public void moveDown();
	public void moveLeft();
	public void moveRigth();
	public void doNothing();
	public int getX();
	public int getY();
	public boolean isAlive();
	public boolean canMoveTo(userOrder direction);
	public boolean isFalling();
	public void followCharacterMethod();
	public Point getPosition();
	public void removeFromBoard();
	public boolean isCrashed();
	public userOrder getLastWallTouched();
	public void setLastWallTouched(userOrder left);
	public void die();
	
}
