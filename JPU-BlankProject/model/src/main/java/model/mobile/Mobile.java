package model.mobile;

import java.awt.Point;

import fr.exia.showboard.IBoard;
import model.element.DisplayableElement;
import model.element.Permeability;
import model.element.Sprite;
import model.model.IMap;

public class Mobile extends DisplayableElement  implements IMobile /*extends DisplayableElement*/  {
	//the position in 2D plan 
	Point position;
	// the situation of the mobile 
	boolean alive = true;
	// the board 
	IBoard board;
	// the speed of falling object 
	private boolean fallingspeed  = false ;
	// the map 
	IMap map;
	
	
protected void die() {
	this.alive= false;
	this.setHasMoved();
	
}

// this constructor take in consideration , the sprite , the map and the mobile's position 
public  Mobile(Sprite sprite, IMap map,Permeability permeability) {
	super(sprite, permeability);
	this.map=map;
	this.position = new Point();
	
}
// we take the position and set the position of the mobile 
public Mobile(int x, int y, Sprite sprite, IMap map, Permeability permeability) {
	this(sprite, map, permeability);
	this.getPosition().x = x ;
	this.getPosition().y = y;
}

	@Override
	public void moveUp() {
		this.setY(this.getY()-1);
		this.setHasMoved();
		
		
	}
//for the player to move down , the map should move up so x's position + 1
	@Override
	public void moveDown() {
		this.setY(this.getY()+1);
		this.setHasMoved();
		this.fallingspeed = true;
		
		
	}

	@Override
	public void moveLeft() {
		this.setX(this.getX()-1);
		this.setHasMoved();
		
	}

	@Override
	public void moveRigth() {
		this.setX(this.getX()+1);
		this.setHasMoved();
		
		
	}

	@Override
	public void doNothing() {
		this.setHasMoved();
		this.fallingspeed = false;
		
		
	}
	
	protected IBoard board () {
		return this.board;
		
	}

	@Override
	public int getX() {
		return this.getPosition().x;
	}
	
	
	public void setX(int x) {
		this.getPosition().x =x;
		if (this.isCrashed()) {
			this.die();		}
		
	}
	public void setY(int y) {
		this.getPosition().y =y ;
		if(this.isCrashed()) {
			this.die();
		}
		
	}

	@Override
	public int getY() {
		return this.getPosition().y;
	}

	
	public IMap getMap() {
		return this.map;
		
	}
	
	@Override
	public boolean isAlive() {
		return this.alive;
	}

	
	
	public boolean isCrashed() {
		for (IMobile pawn : this.getMap().getPawns()) {
			if (pawn.getSprite().getConsoleImage() == 'S' || pawn.getSprite().getConsoleImage() == 'D') {
				if (pawn.getPosition().x == this.getPosition().x
						&& pawn.getPosition().y == this.getPosition().y - 1 && pawn.isFalling()) {
					return true;
				}
			}
		}
		return this.getMap().getOnTheMap(this.getX(), this.getY()).getPermeability() == Permeability.BLOCKING;
		
	}
	
	public void setHasMoved() {
		this.getMap().setMobileHasChanged();
	}
	
	public void setMap(IMap map) {
		this.map=map;
		}
	
	public void setPosition(Point position) {
		this.position = position;
	}
	

	@Override
	public Point getPosition() {
		return this.position;
	}

	@Override
	public boolean canMoveTo(userOrder direction) {
		return this.mapMovementPermissionsTo(direction)&&this.pawnMovementPermissionsTo(direction);
	}

	
	private boolean pawnMovementPermissionsTo(userOrder direction) {
		Point desiredPosition = this.getPositionOfUserOrder(direction);
		for (IMobile pawn : this.getMap().getPawns()) {
			if (pawn.getPosition().equals(desiredPosition)) {
				if (pawn.getPermeability() != Permeability.PENETRABLE) {
					return false;
				} else {
					return true;
				}
			}
		}

		return true;
	}

	private Point getPositionOfUserOrder(userOrder direction) {
		Point ciblePosition = null;
		switch (direction) {
		case UP:
			ciblePosition = new Point(this.getX(), this.getY() - 1);
			break;
		case DOWN:
			ciblePosition = new Point(this.getX(), this.getY() + 1);
			break;
		case RIGTH :
			ciblePosition = new Point(this.getX() + 1, this.getY());
			break;
		case LEFT:
			ciblePosition = new Point(this.getX() - 1, this.getY());
			break;
		case NOTHING:
		default:
			ciblePosition = new Point(this.getX(), this.getY());
			break;
		}
		
		return ciblePosition;
	}

	private boolean mapMovementPermissionsTo(userOrder direction) {
		switch (direction) {
		case UP:
			return this.getMap().getOnTheMap(this.getX(), this.getY() - 1)
					.getPermeability() == Permeability.PENETRABLE;
		case DOWN:
			return this.getMap().getOnTheMap(this.getX(), this.getY() + 1)
					.getPermeability() == Permeability.PENETRABLE;
		case RIGTH:
			return this.getMap().getOnTheMap(this.getX() + 1, this.getY())
					.getPermeability() == Permeability.PENETRABLE;
		case LEFT:
			return this.getMap().getOnTheMap(this.getX() - 1, this.getY())
					.getPermeability() == Permeability.PENETRABLE;
		case NOTHING:
		default:
			return true;
		}
	}

	@Override
	public boolean isFalling() {
		return fallingspeed;
	}

}
