package org.jacoco.examples.maven.java;

import java.lang.String;

public class HelloWorld {

	public String getMessage(String message, boolean bigger) {
		if (bigger) {
			return "Hello Universe!";
		} else {
			return "Hello Ashok, Glad to see you!";
		}
	}

}
