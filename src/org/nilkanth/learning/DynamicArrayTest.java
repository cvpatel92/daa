package org.nilkanth.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class DynamicArrayTest {	
	DynamicArray array;
	
	@BeforeEach
	void setUp() throws Exception {
		array = new DynamicArray(2);
	}

	@Test
	void getAndSet() {
		array.setData(0,"a");		
		assertEquals("a", array.getData(0));
	}
	
	@Test
	void insertTest() {
		array.add("a");
		array.add("b");
		array.add("c");
		
		array.insert(1, "d");
		
		assertEquals("a", array.getData(0));
		assertEquals("d", array.getData(1));
		assertEquals("b", array.getData(2));
		assertEquals("c", array.getData(3));
	}
	
	@Test
	void deleteTest() {
		array.add("a");
		array.add("b");
		array.add("c");
		
		array.delete(1);
		
		assertEquals("c", array.getData(1));
	}
	

	@Test
	void containsTest() {
		array.add("a");
		array.add("b");
		array.add("c");
					
		assertEquals(true, array.contains("b"));
		
		array.delete(1);
		
		assertEquals(false, array.contains("b"));
	}
}
