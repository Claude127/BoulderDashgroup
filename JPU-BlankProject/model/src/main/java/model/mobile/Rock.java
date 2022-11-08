package model.mobile;

import java.awt.Point;

import methods.IMethods;
import methods.rockMethod;
import model.element.Permeability;
import model.element.Sprite;
import model.model.IMap;

public class Rock extends Mobile  {
	
// some constants for Rock
final static Sprite sprite=new Sprite('R',"Rock.png");
final static Permeability permeability =Permeability.BLOCKING;
	
// the methods in use by all rock
private final static IMethods method = new rockMethod();

	public Rock(int x, int y, IMap map) {
		super(x, y, sprite, map, permeability);
		sprite.loadImage();
	}
	
	 @Override
	    public final void moveLeft() {
	        super.moveLeft();
	    }

	    @Override
	    public final void moveRigth() {
	        super.moveRigth();
	    }

	   /* @Override
	    public final void moveDown() {
	        super.moveDown();
	    }
*/
	   
	    @Override
	    public final void doNothing() {
	        super.doNothing();
	    }

	    
	    /*
	     * allows to rock to perform according of rockMethod
	     */
	    @Override
		public void followCharacterMethod() {
			Rock.method.followMethods(this, this.getMap());
		}
	    
	    /*
	     * checks the rock's move according to the given direction
	     */
	    @Override
		protected Boolean pawnMovementPermissionsTo(final userOrder direction) {
			Point desiredPosition = null;
			switch (direction) {
			case UP:
				desiredPosition = new Point(this.getX(), this.getY() - 1);
				break;
			case DOWN:
				desiredPosition = new Point(this.getX(), this.getY() + 1);
				break;
			case RIGTH:
				desiredPosition = new Point(this.getX() + 1, this.getY());
				break;
			case LEFT:
				desiredPosition = new Point(this.getX() - 1, this.getY());
				break;
			case NOTHING:
			default:
				return true;
			}
		
			if (this.getMap().getMyCharacter().getPosition().equals(desiredPosition)) {
				return false;
			}
			else {
				return super.pawnMovementPermissionsTo(direction);
			}
		}
	    
}
