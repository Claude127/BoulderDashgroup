package methods;

import model.mobile.IMobile;
import model.mobile.userOrder;
import model.model.IMap;

public class followBadSenseEnemyBounce extends enemyAptituds {

	@Override
	public void followMethods(IMobile concernedCharacter, IMap map) {
		super.followMethods(concernedCharacter, map);
		if(concernedCharacter.getPosition().y < 0)
		{
			return;
		}
		
		if (concernedCharacter.getLastWallTouched() == userOrder.NOTHING) {

			if (concernedCharacter.canMoveTo(userOrder.RIGTH)) {

				concernedCharacter.moveRigth();
				if (!concernedCharacter.canMoveTo(userOrder.RIGTH)) {
					concernedCharacter.setLastWallTouched(userOrder.RIGTH);
				}

			} else if (concernedCharacter.canMoveTo(userOrder.UP)) {

				concernedCharacter.moveUp();
				if (!concernedCharacter.canMoveTo(userOrder.UP)) {
					concernedCharacter.setLastWallTouched(userOrder.UP);
				}

			} else if (concernedCharacter.canMoveTo(userOrder.LEFT)) {

				concernedCharacter.moveLeft();
				if (!concernedCharacter.canMoveTo(userOrder.LEFT)) {
					concernedCharacter.setLastWallTouched(userOrder.LEFT);
				}

			} else if (concernedCharacter.canMoveTo(userOrder.DOWN)) {

				concernedCharacter.moveDown();
				if (!concernedCharacter.canMoveTo(userOrder.DOWN)) {
					concernedCharacter.setLastWallTouched(userOrder.DOWN);
				}
			}
		}
		/** a wall has been touched, follow it*/
		if (concernedCharacter.getLastWallTouched() == userOrder.RIGTH) {
			if (concernedCharacter.canMoveTo(userOrder.UP)) {
				concernedCharacter.moveUp();
				if (!concernedCharacter.canMoveTo(userOrder.UP)) {
					concernedCharacter.setLastWallTouched(userOrder.UP);
				}
			} else if (concernedCharacter.canMoveTo(userOrder.LEFT)) {
				concernedCharacter.moveLeft();
				if (!concernedCharacter.canMoveTo(userOrder.LEFT)) {
					concernedCharacter.setLastWallTouched(userOrder.LEFT);
				}
			} else if (concernedCharacter.canMoveTo(userOrder.DOWN)) {
				concernedCharacter.moveDown();
				if (!concernedCharacter.canMoveTo(userOrder.DOWN)) {
					concernedCharacter.setLastWallTouched(userOrder.DOWN);
				}
			}
		} else if (concernedCharacter.getLastWallTouched() == userOrder.UP) {
			if (concernedCharacter.canMoveTo(userOrder.LEFT)) {
				concernedCharacter.moveLeft();
				if (!concernedCharacter.canMoveTo(userOrder.LEFT)) {
					concernedCharacter.setLastWallTouched(userOrder.LEFT);
				}
			} else if (concernedCharacter.canMoveTo(userOrder.DOWN)) {
				concernedCharacter.moveDown();
				if (!concernedCharacter.canMoveTo(userOrder.DOWN)) {
					concernedCharacter.setLastWallTouched(userOrder.DOWN);
				}
			} else if (concernedCharacter.canMoveTo(userOrder.RIGTH)) {
				concernedCharacter.moveRigth();
				if (!concernedCharacter.canMoveTo(userOrder.RIGTH)) {
					concernedCharacter.setLastWallTouched(userOrder.RIGTH);
				}
			}

		} else if (concernedCharacter.getLastWallTouched() == userOrder.LEFT) {
			if (concernedCharacter.canMoveTo(userOrder.DOWN)) {
				concernedCharacter.moveDown();
				if (!concernedCharacter.canMoveTo(userOrder.DOWN)) {
					concernedCharacter.setLastWallTouched(userOrder.DOWN);
				}
			} else if (concernedCharacter.canMoveTo(userOrder.RIGTH)) {
				concernedCharacter.moveRigth();
				if (!concernedCharacter.canMoveTo(userOrder.RIGTH)) {
					concernedCharacter.setLastWallTouched(userOrder.RIGTH);
				}
			} else if (concernedCharacter.canMoveTo(userOrder.UP)) {
				concernedCharacter.moveUp();
				if (!concernedCharacter.canMoveTo(userOrder.UP)) {
					concernedCharacter.setLastWallTouched(userOrder.UP);
				}
			}

		} else if (concernedCharacter.getLastWallTouched() == userOrder.DOWN) {
			if (concernedCharacter.canMoveTo(userOrder.RIGTH)) {
				concernedCharacter.moveRigth();
				if (!concernedCharacter.canMoveTo(userOrder.RIGTH)) {
					concernedCharacter.setLastWallTouched(userOrder.RIGTH);
				}
			} else if (concernedCharacter.canMoveTo(userOrder.UP)) {
				concernedCharacter.moveUp();
				if (!concernedCharacter.canMoveTo(userOrder.UP)) {
					concernedCharacter.setLastWallTouched(userOrder.UP);
				}
			} else if (concernedCharacter.canMoveTo(userOrder.LEFT)) {
				concernedCharacter.moveLeft();
				if (!concernedCharacter.canMoveTo(userOrder.LEFT)) {
					concernedCharacter.setLastWallTouched(userOrder.LEFT);
				}
			}
		}
	}
}
