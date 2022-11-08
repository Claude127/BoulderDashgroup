package model.mobile;

import methods.IMethods;
import methods.diamondMethod;
import model.element.Permeability;
import model.element.Sprite;
import model.model.IMap;

public class Diamond extends Mobile {
	
	private final static Sprite sprite= new Sprite('D',"Diamond .png");
	private final static Permeability permeability=Permeability.TAKEN;

	private static final IMethods method=new diamondMethod();	
	public Diamond(int x, int y, IMap map) {
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

	
	

	
	@Override
	public final void moveDown() {
		super.moveDown();
	}

	
	

	@Override
	public final void doNothing() {
		super.doNothing();
	}
	
	// to allow the character to perform according the dedied methods
	@Override
	public void followCharacterMethod() {
		Diamond.method.followMethods(this, this.getMap());
	}
	
	
		
	}


