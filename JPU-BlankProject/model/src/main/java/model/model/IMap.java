package model.model;

import java.util.Observable;


import model.element.DisplayableElement;


public interface IMap {
	public int getWidth();
	public int getHeigth();
	public DisplayableElement getOnTheMap(int x,int y);
	public void setMobileHasChanged();
	public Observable getObservable();

}
