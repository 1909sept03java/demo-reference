package com.revature.service;

public class GotEatenException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4989296812245932633L;

	public GotEatenException() {
	}

	public GotEatenException(String arg0) {
		super(arg0);
	}

	public GotEatenException(Throwable arg0) {
		super(arg0);
	}

	public GotEatenException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public GotEatenException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
