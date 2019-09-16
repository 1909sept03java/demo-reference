package com.revature.main;

import com.revature.beans.Bear;
import com.revature.dao.BearDAO;
import com.revature.dao.BearDAOImpl;
import com.revature.dao.CaveDAO;
import com.revature.dao.CaveDAOImpl;

public class Driver {

	public static void main(String[] args) {
		/*
		try {
			Connection conn = ConnectionUtil.getConnection();
			System.out.println(conn);
			System.out.println(conn.getMetaData().getDatabaseMajorVersion());
		} catch(Exception e) {
			e.printStackTrace();
		}
		*/
		CaveDAO cd = new CaveDAOImpl();
		//cd.createCave(new Cave(0,"Howe Caverns",5));
		/*for (Cave c : cd.getCaves()) {
			System.out.println(c);
		}*/
		//System.out.println(cd.getCaveById(1));
		
		BearDAO bd = new BearDAOImpl();
		for (Bear b : bd.getBears()) {
			System.out.println(b);
		}
		//System.out.println("fed bear "+bd.feedBear(56, 1001, 5.2)+" pounds of honey");
	}

}
