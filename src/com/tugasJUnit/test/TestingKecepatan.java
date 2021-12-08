package com.tugasJUnit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tugasJUnit.main.formula.KecepatanRataRata;

public class TestingKecepatan {

	KecepatanRataRata kecepatan;
	
	@Before
	public void setUp() throws Exception {
		kecepatan = new KecepatanRataRata();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testHitungKecepatan() {
		
		assertEquals(40.2, kecepatan.HitungKecepatan(201, 5), 0.0);
	}


}
