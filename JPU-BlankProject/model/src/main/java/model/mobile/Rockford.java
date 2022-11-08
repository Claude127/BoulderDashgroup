package model.mobile;

import java.awt.Point;
import java.io.IOException;

import model.element.Permeability;
import model.element.Sprite;
import model.model.IMap;
import model.mobile.userOrder;

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
		try {
			super.blackGroundFilling();
			super.moveUp();
			this.setSprite(spriteUp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void moveDown() {
		try {
			super.blackGroundFilling();
			super.moveDown();
			this.setSprite(spriteDown);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void moveRigth() {
		try {
			super.blackGroundFilling();
			super.moveRigth();
			this.setSprite(spriteTurnRigth);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void moveLeft() {
		try {
			super.blackGroundFilling();
			super.moveLeft();
			this.setSprite(spriteTurnLeft);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*public void push() {*/
		public Boolean pawnsMovementPermissionsTo(final userOrder direction){
			Boolean pushingAction = false;
			switch (direction) {
			case RIGTH:
				pushingAction= this.getMap().getOnTheMap(getX() + 2, getY())
						.getPermeability() == Permeability.PENETRABLE;
				if (pushingAction) {
					for (IMobile pawn : this.getMap().getPawns()) {
						if (pawn.getPosition().x == getX() + 2 && pawn.getPosition().y == getY()
								&& pawn.getPermeability() != Permeability.PENETRABLE) {
							pushingAction = false;
							break;
						}
					}
				}
				break;
			case LEFT:
				pushingAction = this.getMap().getOnTheMap(getX() - 2, getY())
						.getPermeability() == Permeability.PENETRABLE;
				if (pushingAction) {
					for (IMobile pawn : this.getMap().getPawns()) {
						if (pawn.getPosition().x == getX() - 2 && pawn.getPosition().y == getY()
								&& pawn.getPermeability() != Permeability.PENETRABLE) {
							pushingAction = false;
							break;
						}
					}
				}
				break;
			case NOTHING:
			default:
				break;
			}
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


		final Point ciblePosition = this.getPositionOfUserOrder(direction);
			for (IMobile pawn : this.getMap().getPawns()) {
				if (pawn.getPosition().equals(ciblePosition)) {
					if (pawn.getPermeability() == Permeability.BLOCKING) {
						if (pushingAction) {
							if (direction == userOrder.RIGTH)
								pawn.moveRigth();
							else
								pawn.moveLeft();
							return true;
						} else {

							return false;
						}

					} 
					else if (pawn.getPermeability() == Permeability.TAKEN) {
						// public void recover()

						pawn.removeFromBoard();
						this.getMap().decreaseDiamondCount();

						return true;
					}
				}
			}
			return true;
		
	}
	
	
	
	public void doNothing() {
		super.doNothing();
		this.setSprite(sprite);
	}
	
	public  void die() {
		super.die();
		this.setSprite(spriteDie);
	}
	
	//to control the rockford's move
	protected boolean mapMovementPermissionsTo(final userOrder direction) {
		switch (direction) {
		case UP:
			return this.getMap().getOnTheMap(this.getX(), this.getY() - 1).getPermeability() != Permeability.BLOCKING;
		case DOWN:
			return this.getMap().getOnTheMap(this.getX(), this.getY() + 1).getPermeability() != Permeability.BLOCKING;
		case RIGTH:
			return this.getMap().getOnTheMap(this.getX() + 1, this.getY()).getPermeability() != Permeability.BLOCKING;
		case LEFT:
			return this.getMap().getOnTheMap(this.getX() - 1, this.getY()).getPermeability() != Permeability.BLOCKING;
		case NOTHING:
		default:
			return true;
		}
	}
	@Override
	public boolean canMoveTo(final userOrder direction) {
		return this.mapMovementPermissionsTo(direction) && this.pawnsMovementPermissionsTo(direction);
	}

	public void setMap(final IMap map) {
		this.getMap().setMyCharacter(this);
	}
	
	@Override
	public boolean isCrashed() {
		for (IMobile pawn : this.getMap().getPawns()) {
			if(pawn.getSprite().getConsoleImage() == 'M'){
				if (this.getPosition().equals(pawn.getPosition()))
					return true;
			}
		}
		return super.isCrashed();
	}
	
}
