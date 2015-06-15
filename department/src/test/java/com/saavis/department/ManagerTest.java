package com.saavis.department;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.saavis.department.domain.Developer;
import com.saavis.department.domain.Manager;
import com.saavis.department.domain.Tester;

public class ManagerTest {

	private Manager manager;

	@Before
	public void setUp() {
		manager = new Manager();
	}
	
	@Test
	public void testTwoLevelManagerMonthyExpenses() {
		// creating new Manager and adding one developer and one tester

		manager.addSubordinate(generateManagerData());

		Assert.assertTrue(manager.getMonthlyExpenses() == 2100);
	}

	@Test
	public void testFourLevelManagerMonthyExpenses() {

		manager.addSubordinate(generateManagerData()); // 1800
		manager.addSubordinate(generateManagerData()); // 1800
		manager.addSubordinate(generateManagerData()); // 1800

		Assert.assertTrue(manager.getMonthlyExpenses() == 5700);
	}

	public Manager generateManagerData() {
		// creating new Manager and adding one developer and one tester
		Manager subLevel = new Manager();

		subLevel.addSubordinate(new Developer());
		subLevel.addSubordinate(new Tester());
		return subLevel;
	}
}
