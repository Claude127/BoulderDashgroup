package model.element;

import java.awt.Image;

public abstract class DisplayableElement implements IDisplayableElement {

	
	private Sprite sprite;
	private Permeability permeability;
	
	public DisplayableElement(Sprite sprite, Permeability permability) {
		this.setSprite(sprite);
		this.setPermeability(permability);
	}

	@Override
	public Sprite getSprite() {
		return this.sprite;
	}
public void setSprite(Sprite sprite) {
	this.sprite=sprite;
}

	@Override
	public Permeability getPermeability() {
		return this.permeability;
	}
	public void setPermeability(Permeability permeability) {
		this.permeability=permeability;
	}
	

	@Override
	public Image getImage() {
		return this.getSprite().getImage();
	}

	
	

}
