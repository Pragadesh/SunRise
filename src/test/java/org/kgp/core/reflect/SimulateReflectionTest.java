package org.kgp.core.reflect;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class SimulateReflectionTest {

	private static final Logger log = Logger.getLogger(SimulateReflectionTest.class);
	
	private SimulateReflection simulateReflection;
	
	@Before
	public void setup(){
		simulateReflection = new SimulateReflection();
	}
	
	@Test
	public void testCallingClass(){
		simulateReflection.getCaller(0);
		simulateReflection.getCaller(1);
		simulateReflection.getCaller(2);
		simulateReflection.getCaller(3);
		simulateReflection.getCaller(4);
		simulateReflection.getCaller(5);
		simulateReflection.getCaller(6);
		simulateReflection.getCaller(7);
		simulateReflection.getCaller(8);
		simulateReflection.getCaller(9);
		simulateReflection.getCaller(10);
		simulateReflection.getCaller(11);
		simulateReflection.getCaller(12);
		simulateReflection.getCaller(13);
		simulateReflection.getCaller(14);
		simulateReflection.getCaller(15);
		simulateReflection.getCaller(16);
		simulateReflection.getCaller(17);
		simulateReflection.getCaller(18);
		simulateReflection.getCaller(19);
		simulateReflection.getCaller(20);
		simulateReflection.getCaller(21);
		simulateReflection.getCaller(22);
		simulateReflection.getCaller(23);
		simulateReflection.getCaller(24);
	}
}
