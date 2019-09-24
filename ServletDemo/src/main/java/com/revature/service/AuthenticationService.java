package com.revature.service;

import com.revature.beans.Credentials;
import com.revature.beans.User;

public class AuthenticationService {
	
	// if credentials are not recognized, return null
	// if they are, return user associated with them
	public User authenticateUser(Credentials creds) {
		User u = null;
		if (creds.getUsername().equals("merlin") && creds.getPassword().equals("cat")) {
			u = new User(6, "Merlin", "Higgins");
		}
		return u;
	}

}
