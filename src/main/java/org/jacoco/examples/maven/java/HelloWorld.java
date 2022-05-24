package org.jacoco.examples.maven.java;

public class HelloWorld {

	public String getMessage(boolean bigger) {
		if (bigger) {
			return "Hello Universe!";
		} else {
			return "Hello Ashok, Welcome to the World!";
		}
	}

}
