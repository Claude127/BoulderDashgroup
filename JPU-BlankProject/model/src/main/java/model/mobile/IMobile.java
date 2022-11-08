package model.mobile;

import java.awt.Point;

public interface IMobile {

	public void moveUp();
	public void moveDown();
	public void moveLeft();
	public void moveRigth();
	public void doNothing();
	public int getX();
	public int getY();
	public boolean isAlive();
	public boolean isDestructible();
	public Point getPosition();
	
}
