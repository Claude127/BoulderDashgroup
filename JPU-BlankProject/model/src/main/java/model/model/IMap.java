package model.model;

import java.util.ArrayList;
import java.util.Observable;


import model.element.DisplayableElement;
import model.element.IDisplayableElement;
import model.mobile.IMobile;


public interface IMap {
	
	// to get the width's map
	public int getWidth();
	// to get the heigth's map
	public int getHeigth();
	// to the x and y
	public DisplayableElement getOnTheMap(int x,int y);
	// to set an display element 
	public void setOnTheMap(int x, int y, IDisplayableElement element);
	
	//to notify that the mobile has changed 
	public void setMobileHasChanged();
	
	// to return the observable 
	public Observable getObservable();

	//add pawn on map
	public  void addPawn(IMobile pawn);
	
	// return The pawns on the current map 
	public ArrayList<IMobile> getPawns();
	
	//Decrements the diamond count 
	public void decreaseDiamondCount();
	
	//Increments the diamond count 
	public void addDiamondCount();
	
	// Get DiamondCount
	public int getDiamondCount();
	
	/*//return The mobile element character 
	public IMobile getMyCharacter();
	
	//Sets themobile element character - param character The player's character
	public void setMyCharacter(IMobile character);
	*/
	
	
}
