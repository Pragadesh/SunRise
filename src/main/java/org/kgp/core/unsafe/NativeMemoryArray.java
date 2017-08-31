package org.kgp.core.unsafe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import org.apache.log4j.Logger;

import sun.misc.Unsafe;

public class NativeMemoryArray {

	private static final Logger log = Logger.getLogger(NativeMemoryArray.class);
	
	private int maxSize;
	private long start;
	
	public static final int INTEGER_MEMORY_SIZE = 4;
	
	public NativeMemoryArray(int maxSize){
		this.maxSize = maxSize;
		initialize();
	}
	
	public Unsafe getUnsafe(){
		return Unsafe.getUnsafe();
	}
	
	public Unsafe getUnsafeByMemberVariableAccess(){
		Unsafe unsafe = null;
		try{
			Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
			unsafeField.setAccessible(true);
			unsafe = (Unsafe) unsafeField.get(null);
		}catch(Exception e){
			String msg = "Error getting unsafe directly from member variable";
			log.error(msg, e);
			throw new InstantiationError(msg);
		}
		return unsafe;	
	}
	
	public Unsafe getUnsafeByConstructorAccess(){
		Unsafe unsafe = null;
		try{
			Constructor<Unsafe>[] constructors = Unsafe.class.getDeclaredConstructors(Unsafe.class);
			if(constructors!=null && constructors.length>0){
				Constructor<Unsafe> constructor = constructors[0];
				constructor.setAccessible(true);
				unsafe = constructor.newInstance(null);
			}
			
		}catch(Exception e){
			String msg = "Error getting unsafe from constructor";
			log.error(msg, e);
			throw new InstantiationError(msg);
		}
		return unsafe;	
	}
	
	private void initialize() throws InstantiationError{
		start = getUnsafe().allocateMemory(maxSize * INTEGER_MEMORY_SIZE);
	}
}
