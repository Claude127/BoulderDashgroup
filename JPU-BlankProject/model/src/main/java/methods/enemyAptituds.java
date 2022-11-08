package methods;

import model.mobile.Enemy;
import model.mobile.IMobile;
import model.model.IMap;

abstract class enemyAptituds implements IMethods  {

	@Override
	public void followMethods(IMobile concernedCharacter, IMap map) {
		if(concernedCharacter.isCrashed()) {
			Enemy enemy = (Enemy)(concernedCharacter);
			enemy.removeStrategy();
			enemy.removeFromBoard();
		
	}

	}
}
