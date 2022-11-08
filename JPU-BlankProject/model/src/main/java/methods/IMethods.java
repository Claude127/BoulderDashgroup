package methods;

import model.mobile.IMobile;
import model.model.IMap;

public interface IMethods {
	
	/*allows pawns with common features to perform them on the map
	 * 
	 * concernedCharacter -->the pawn to perform actions
	 * 
	 *	map --> the map use for the perform
	 */
	
	
	public void followMethods(IMobile concernedCharacter,IMap map);
}
