package model.MotionLess;

public class MotionLessElementFactory {

	BlueWall bluewall= new BlueWall(null, null);
	BlackGround blackground = new BlackGround (null, null);
	ExitWall exitwall = new ExitWall(null, null);
	Earth earth = new Earth(null, null);
	MotionLessElement[] motionelement= {bluewall,blackground,earth,exitwall};
	
	
public MotionLessElement getFromFileSymbol(char fileSymbol) {
	return null;
	
}

public MotionLessElement createBlueWall() {
	return bluewall;
	
}
	
public MotionLessElement createBlackGround() {
	return blackground;
	
}

public MotionLessElement Earth() {
	return blackground;
	
}

}
