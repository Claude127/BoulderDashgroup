package model.mobile;

import java.util.Random;

public enum userOrder {

	
RIGTH,

LEFT,

UP,

DOWN,

NOTHING,;

	
	// to return random value of userOrder(direction)
public static userOrder randomOrder() {
	 int pick = new Random().nextInt(userOrder.values().length);
	    return userOrder.values()[pick];
} 
}
