package org.kgp.core.collection;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class ListContainsTest {

	private List<String> colors;
	
	@Before
	public void setup(){
		colors = new ArrayList<>();
		colors.add("blue");
		colors.add("yellow");
		colors.add("black");
		colors.add("blue");
		colors.add("white");
		colors.add("black");
	}
	
	@Test
	public void testListContains(){
		Assert.assertEquals("Contains Test", true, colors.contains("white"));
		Assert.assertEquals("Size Test", 6, colors.size());
	}
}
