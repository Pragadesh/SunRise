package org.kgp.core.reflect;

import org.apache.log4j.Logger;
import org.kgp.domain.error.OutOfRangeException;

public class SimulateReflection {
	private static final Logger log = Logger.getLogger(SimulateReflection.class);
	
	public Class getCaller(int level){
		Class cc = sun.reflect.Reflection.getCallerClass(level);
		if(cc == null){
			throw new OutOfRangeException(String.format("Level %d out of range.", level));
		}
		log.info(String.format("Level %d class: %s", level, cc.getName()));
		return cc;
	}
}
