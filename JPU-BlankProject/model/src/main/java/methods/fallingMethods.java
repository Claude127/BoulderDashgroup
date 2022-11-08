package methods;

import model.element.Permeability;
import model.mobile.IMobile;
import model.mobile.userOrder;
import model.model.IMap;

public abstract  class fallingMethods implements IMethods  {

	// the methods which concern objects supposed to fall
	
	@Override
	public void followMethods(IMobile concernedCharacter, IMap map) {
		/** if current pawn can go down */
		if (concernedCharacter.canMoveTo(userOrder.DOWN)) {
			concernedCharacter.moveDown();
		} else {

			// if not, check if he can fall on the sides
			for (IMobile pawnVerif : map.getPawns()) {

				/** if there is a pawn under current pawn*/
				if (concernedCharacter.getPosition().y == pawnVerif.getPosition().y - 1
						&& concernedCharacter.getPosition().x == pawnVerif.getPosition().x) {

					/** if the current pawn can go to left*/
					if (concernedCharacter.canMoveTo(userOrder.LEFT)) {

						// if the current pawn can go slide to the left to fall
						if (map.getSquareIsOccupied(pawnVerif.getPosition().x - 1,
								pawnVerif.getPosition().y) == Permeability.PENETRABLE) {
							concernedCharacter.moveLeft();
							return;
						}
					}

					/** if the current pawn can go to right*/
					if (concernedCharacter.canMoveTo(userOrder.RIGTH)) {

						/** if the current pawn can go slide to the right to fall*/
						if (map.getSquareIsOccupied(pawnVerif.getPosition().x + 1,
								pawnVerif.getPosition().y) == Permeability.PENETRABLE) {
							concernedCharacter.moveRigth();
							return;
						}
					}
				}
			}
			concernedCharacter.doNothing();
		}
	}
	
}
