package org.jacoco.examples.maven.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.lang.String;

public class HelloWorldTest {

	private HelloWorld subject;

	@Before
	public void setup() {
		subject = new HelloWorld();
	}

	@Test
	public void testGetMessage() {
		/*assertEquals("Hello Ashok, Glad to see you!", subject.getMessage(false));
		 Adding new line below 
		assertEquals("WELCOME TO THE WORLD ASHOK!", subject.getMessage(false));*/
		subject.getMessage("Hello Ashok, Glad to see you!", false);
		subject.getMessage("WELCOME TO THE WORLD ASHOK!", true);
	}

}
