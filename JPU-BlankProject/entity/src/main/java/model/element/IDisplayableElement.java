package model.element;

import java.awt.Image;

import fr.exia.showboard.ISquare;

public interface IDisplayableElement extends ISquare{
	
	public Sprite getSprite();
	public Permeability getPermeability();
	public Image getImage();
	

}
