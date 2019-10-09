package com.revature;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.model.Bear;
import com.revature.model.Human;
import com.revature.service.CircleOfLifeService;
import com.revature.service.GotEatenException;

public class WalkInTheWoods {

	public static void main(String[] args) {
		
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		CircleOfLifeService cls = (CircleOfLifeService) ac.getBean("circleOfLifeService");
		
		Human h = new Human();
		h.setSpeed(20.0);
		h.setGitHubUsername("cool_coder_x64");
		h.setHungry(true);
		
		Bear b = new Bear();
		b.setSpeed(55.0);
		
		try {
			cls.chase(h, b);
		} catch(GotEatenException e) {
			e.printStackTrace();
		}
		
		ac.close();
	}

}
