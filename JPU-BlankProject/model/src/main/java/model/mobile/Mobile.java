package model.mobile;

import java.awt.Point;

import fr.exia.showboard.IBoard;
import model.element.Permeability;
import model.element.Sprite;
import model.model.IMap;

public class Mobile implements IMobile /*extends DisplayableElement*/  {
	
	Point position;
	boolean alive = true;
	IBoard board;
	
	
protected void die() {
	
}


public  Mobile(Sprite sprite, IMap map,Permeability permeability) {
	
}

public Mobile(int x, int y, Sprite sprite, IMap map, Permeability permeability) {
	
}

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveRigth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doNothing() {
		// TODO Auto-generated method stub
		
	}
	
	protected IBoard board () {
		return board;
		
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setX(int x) {
		
	}
	public void setY(int y) {
		
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public IMap getMap() {
		return null;
		
	}
	
	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDestructible() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean isCrashed() {
		return false;
		
	}
	
	public void setHasMoved() {
		
	}
	
	public void setMap(IMap map) {
		
	}
	
	public void setPosition(Point position) {
		
	}
	

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

}
