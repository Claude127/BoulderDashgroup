package methods;

import model.mobile.IMobile;
import model.model.IMap;

public class diamondMethod extends fallingMethods  {
	@Override
	public void followMethods(IMobile concernedCharacter, IMap map) {
		/** if the concernedCharacter is above the player*/
		if ((concernedCharacter.getPosition().y == map.getMyCharacter().getPosition().y - 1
				&& concernedCharacter.getPosition().x == map.getMyCharacter().getPosition().x)
				|| concernedCharacter.getPosition().equals(map.getMyCharacter().getPosition())) {
			concernedCharacter.removeFromBoard();
			map.decreaseDiamondCount();
			return;
		}
		super.followMethods(concernedCharacter, map);
	}
}
