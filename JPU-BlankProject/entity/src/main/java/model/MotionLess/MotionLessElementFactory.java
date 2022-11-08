package model.MotionLess;

import model.element.DisplayableElement;

public class MotionLessElementFactory {

	// we create a constant of each motionless element 
	private static BlueWall bluewall= new BlueWall();
	private static BlackGround blackground = new BlackGround ();
	private static ExitWall exitwall = new ExitWall();
	private static Earth earth = new Earth();
	
	//this array is used to get char from symbol
	MotionLessElement[] motionelements= {bluewall,blackground,earth,exitwall};
	
	/* that to get the motionless element from file symbol 
	 * and return the motionless element from file symbol
	 */
public MotionLessElement getFromFileSymbol(char fileSymbol) {
	for (final MotionLessElement motionlessElement : motionelements) {
        if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
            return motionlessElement;
        }
    }
    return earth;
}
	


public MotionLessElement createBlueWall() {
	return bluewall;
	
}
	
public static MotionLessElement createBlackGround() {
	return blackground;
	
}

public MotionLessElement Earth() {
	return blackground;
	
}

}
