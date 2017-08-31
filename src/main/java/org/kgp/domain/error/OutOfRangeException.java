package org.kgp.domain.error;

public class OutOfRangeException extends RuntimeException {

	public OutOfRangeException(){
		
	}
	
	public OutOfRangeException(String msg){
		super(msg);
	}
}
