package com.lpu.project;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SampleMavenTest extends TestCase {

	public SampleMavenTest(String name) {
		super(name);
		}//super constructor

	public static Test suite() {
		return new TestSuite(SampleMavenTest.class);
	}
	public void testSampleMaven() {
		assertTrue(true);
	}
}//SampleMavenTest
//Create Maven Project and add Junit using POM ,write sample test case for arithmetic
// operation



