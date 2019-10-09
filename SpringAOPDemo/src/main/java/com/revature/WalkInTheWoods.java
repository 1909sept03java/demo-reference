package com.revature;

import com.revature.model.Bear;
import com.revature.model.Human;
import com.revature.service.CircleOfLifeService;
import com.revature.service.GotEatenException;

public class WalkInTheWoods {

	public static void main(String[] args) {
		
		CircleOfLifeService cls = new CircleOfLifeService();
		
		Human h = new Human();
		h.setSpeed(20.0);
		h.setGitHubUsername("cool_coder_x64");
		h.setHungry(true);
		
		Bear b = new Bear();
		b.setSpeed(5.0);
		
		try {
			cls.chase(h, b);
		} catch(GotEatenException e) {
			e.printStackTrace();
		}
		
	}

}
