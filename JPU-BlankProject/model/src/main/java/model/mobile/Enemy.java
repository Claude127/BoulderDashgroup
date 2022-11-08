package model.mobile;

import methods.IMethods;
import methods.followBadSenseEnemyBounce;
import methods.followWellEnemyBounce;
import methods.noMethods;
import methods.randonMoveForEnemy;
import model.element.Permeability;
import model.element.Sprite;
import model.model.IMap;

public class Enemy extends Mobile{
	 private final static Sprite sprite=new Sprite ('E',"Enemy.png");
	 private final static Permeability permeability = Permeability.BLOCKING;
	 
	 
	 // enemy methods 
	 
	 private static final IMethods randomMethod = new randonMoveForEnemy();
	 
	 private static final IMethods followWellEnemyBounceMethod= new followWellEnemyBounce();
	 
	 private static final IMethods followBadSenseEnemyBounceMethod= new followBadSenseEnemyBounce();
	 
	 private static final IMethods NoMethodMethod = new noMethods();
	 
	 
	 //the method in use by this enemy
	 private IMethods method =null;
	 
	 // the last wall touched by the enemy
	 private userOrder lastWallTouched = userOrder.NOTHING;
	 
	 
	public Enemy(int x, int y, IMap map) {
		super(x, y, sprite, map, permeability);
		sprite.loadImage();
		switch ((int) (Math.random() * (3))) {
		case 1:
			this.method = Enemy.randomMethod;
			break;
		case 2:
			this.method = Enemy.followBadSenseEnemyBounceMethod;
			break;
		default:
			this.method = Enemy.followWellEnemyBounceMethod;
			break;
		}
	}

	@Override
	public final void moveLeft() {
		super.moveLeft();
	}

	@Override
	public final void moveRigth() {
		super.moveRigth();
	}

	@Override
	public final void moveUp() {
		super.moveUp();
	}

	@Override
	public final void moveDown() {
		super.moveDown();
	}

	
	@Override
	public final void doNothing() {
		super.doNothing();
	}

	public void die() {
		
	}

	
	@Override
	public void followCharacterMethod() {
		this.method.followMethods(this, this.getMap());
	}

	@Override
	public userOrder getLastWallTouched() {
		return this.lastWallTouched;
	}

	@Override
	public void setLastWallTouched(final userOrder userOrder) {
		this.lastWallTouched = userOrder;
	}

	public void removeStrategy() {
		this.method = Enemy.NoMethodMethod;
		
	}
}
