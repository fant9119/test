package com.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Date;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ TestUtils.class, ClassThatUsesSomeDateClass.class, ClassThatCalculatesSomeDate.class})
public class ClassThatUsesSomeDateClassTest {

	/**
	 * Runs before each unit test
	 */
	@Before
	public void setup() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void someLogicMethod_Test() {
		TestUtils.mockCalendarInstance(new Date(2323223232L));
		ClassThatUsesSomeDateClass c = new ClassThatUsesSomeDateClass();

		Assert.assertTrue(true);
	}
}
