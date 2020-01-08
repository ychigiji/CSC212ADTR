package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;

public class JavaMapTest {
	
	// you might want this.
	void assertIntEq(int x, int y) {
		assertEquals(x, y);
	}

	@Test
	public void testEmpty() {
		MapADT<String, String> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
		//Assert.assert
	}
	
	@Test
	public void testPut() {
		MapADT<String, String> CapitalCities = new JavaMap<>();
		CapitalCities.put("Botswana", "Gaberone");
		CapitalCities.put("Zimbabwe", "Bulawayo");
		assertEquals(CapitalCities.get("Botswana"), "Gaberone" );
		//Assert.assert
	}
	
	@Test
	public void testGet() {
		MapADT<String, String> capitalCities = new JavaMap<>();
		capitalCities.put("Zimbabwe", "Harare");
		capitalCities.put("Botswana", "Gaberone");
		assertEquals(capitalCities.remove("Zimb"), null);
		assertEquals(capitalCities.get("Zimbabwe"), "Harare");
		//Assert.assert
	}
	
	@Test
	public void testSize() {
		MapADT<String, String> CapitalCities = new JavaMap<>();
		CapitalCities.put("Zimbabwe", "Harare");
		CapitalCities.put("Botswana", "Gaberone");
		assertEquals(CapitalCities.size(), 2);
		//Assert.assert
		
	}
	@Test
	public void testRemove() {
		MapADT<String, String> CapitalCities = new JavaMap<>();
		CapitalCities.put("Botswana", "Gaberone");
		CapitalCities.put("Zambia", "Lusaka");	
		CapitalCities.put("Mozambique", "Maputo");
		assertEquals(CapitalCities.remove("Zimbabwe"), null);
		assertEquals(CapitalCities.remove("Botswana"), "Gaberone");
		//Assert.assert
	}
}
