package model.model;

import model.mobile.IMobile;
import java.io.IOException;
import java.sql.SQLException;

public class BoulderDashModel implements IBoulderDashModel{
	IMap map;
	IMobile rockford;
	IMobile rock;
	IMobile diamond;
	IMobile enemy;
	
	
BoulderDashModel(final int mapId) throws SQLException,IOException{
	super();
	
}
	
public IMap getMap() {
	return this.map;

}

public void setMap(IMap map) {
	this.map = map;
}

@Override
public IMobile getRockford() {
	return this.rockford;
}

public void setRockford(IMobile rockford) {
	this.rockford= rockford;
}

@Override
public IMobile getRock() {
	return this.rock;
}
public void setRock(IMobile rock) {
	this.rock=rock;
}

@Override
public IMobile getDiamond() {
	return this.diamond;
}
public void setDiamond(IMobile diamond ) {
	this.diamond=diamond;
}

@Override
public IMobile getEnemy() {
	return this.enemy;
}
public void setEnemy(IMobile enemy) {
	this.enemy=enemy;
}

}
