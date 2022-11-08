package methods;

import model.mobile.IMobile;
import model.mobile.userOrder;
import model.model.IMap;

public class randonMoveForEnemy extends enemyAptituds{

	@Override
	public void followMethods(IMobile concernedCharacter, IMap map) {
		super.followMethods(concernedCharacter, map);
		if (concernedCharacter.getPosition().y < 0) {
			return;
		}

		userOrder orderToFollow = userOrder.RIGTH;
		int tries = 0;
		while (!concernedCharacter.canMoveTo(orderToFollow) && tries < 4) {
			orderToFollow = userOrder.randomOrder();
			tries++;
		}
		
		if(tries == 4)
			return;
		
		this.moveToOrder(orderToFollow, concernedCharacter);
	}

	private void moveToOrder(final userOrder orderToFollow, final IMobile concernedCharacter) {
		if (concernedCharacter.canMoveTo(orderToFollow)) {
			switch (orderToFollow) {
			case UP:
				concernedCharacter.moveUp();
				break;
			case DOWN:
				concernedCharacter.moveDown();
				break;
			case LEFT:
				concernedCharacter.moveLeft();
				break;
			case RIGTH:
				concernedCharacter.moveRigth();
				break;
			default:
				concernedCharacter.doNothing();
				break;
			}
		}
	}
}
