package com.revature.exception;

public class StudyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1532308602207154728L;

	public StudyException() {
		super();
	}

	public StudyException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public StudyException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public StudyException(String arg0) {
		super(arg0);
	}

	public StudyException(Throwable arg0) {
		super(arg0);
	}

}
