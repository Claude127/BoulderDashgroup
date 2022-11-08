package model.model;

import java.util.Observable;
import model.element.DisplayableElement;

public class Map implements IMap{

	int width;
	int heigth;
	
Map(String fileName){
	
}

public void loadFile(String fileName) {
	
}

@Override
public int getWidth() {
	// TODO Auto-generated method stub
	return 0;
}
public void setWidth(int width) {
	
}

@Override
public int getHeigth() {
	// TODO Auto-generated method stub
	return 0;
}
public void setHeigth(int heigth) {
	
}

@Override
public DisplayableElement getOnTheMap(int x, int y) {
	// TODO Auto-generated method stub
	return null;
}
public void setOnTheMap(DisplayableElement element ,int x,int y) {
	
}

@Override
public void setMobileHasChanged() {
	// TODO Auto-generated method stub
	
}

@Override
public Observable getObservable() {
	return null;
	// TODO Auto-generated method stub
	
}



}
