package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaSetTest {
	
	//Size
	//insert
	//contains
	//remove
	
	
	@Test
	public void testEmpty() {
		SetADT<String> empty = new JavaSet<>();
		assertEquals(empty.size(), 0);
	}

	
	@Test
	public void testSize1() {
		SetADT<String> single = new JavaSet<>();
		assertEquals(single.size(), 0);
		single.insert("A");
		assertEquals(single.size(), 1);
		
	}
	
	@Test
	public void testContains() {
		SetADT<String> contain = new JavaSet<>();
		contain.insert("A");
		assertEquals(true, contain.contains("A"));
		assertEquals(false, contain.contains("B"));
		
	}
	
	@Test
	public void testremove() {
		SetADT<String> Remove = new JavaSet<>();
		Remove.insert("A");
		Remove.insert("B");
		Remove.insert("C");
		assertEquals(3, Remove.size());
		Remove.remove("A");
		assertEquals(2, Remove.size());
		assertEquals(false, Remove.contains("A"));
		
	}
	
}
	
	

