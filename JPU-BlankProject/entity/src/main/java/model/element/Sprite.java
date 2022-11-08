package model.element;

import java.awt.Image;

public class Sprite {
//the element's Image
	Image image;
	
//
	String imageName;
	
// the console image 
	char consoleImage;
	
	// attribrute for the is image loaded 
	boolean imageLoaded;
	
	
public Sprite(char character, String imageName){
	this.setConsoleImage(character);
	
	
}

Sprite(char character){
	
}

public Image getImage() {
	return image;
	
}
public void loadImage() {
	
}
public char getConsoleImage() {
	return consoleImage;
	
}

public void setImage (Image image ) {
	
}

public void setConsoleImage (char consoleImage) {
	
}

public String getImageName (String imageName) {
	return imageName;
	
}

public void setImageName (String imageName) {
	
}

public boolean isImageLoaded(){
	return false;
	
}

public void setImageLoaded(boolean isImageLoaded) {
	
}

}
