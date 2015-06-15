package com.saavis.department;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.saavis.department.domain.Department;
import com.saavis.department.domain.Developer;
import com.saavis.department.domain.Employee;
import com.saavis.department.domain.Manager;
import com.saavis.department.domain.Tester;

public class DepartmentTest {

	private Department department;

	@Before
	public void setUp() {
		department = new Department();
	}


	@Test
	public void testAddDeveloper() {
		Employee developer = new Developer();
		department.addEmployee(developer);
		Assert.assertTrue(department.getListOfEmployees().size() > 0);
		Assert.assertEquals(department.getListOfEmployees().get(0)
				.getAllocation(), Employee.DEVELOPER_ALLOCATION);
	}

	@Test
	public void testAddTester() {
		Employee tester = new Tester();
		department.addEmployee(tester);
		Assert.assertTrue(department.getListOfEmployees().size() > 0);
		Assert.assertEquals(department.getListOfEmployees().get(0)
				.getAllocation(), Employee.TESTER_ALLOCATION);
	}

	@Test
	public void testAddManager() {
		Employee manager = new Manager();
		department.addEmployee(manager);
		Assert.assertTrue(department.getListOfEmployees().size() > 0);
		Assert.assertEquals(department.getListOfEmployees().get(0)
				.getAllocation(), Employee.MANAGER_ALLOCTION);
	}

	@Test
	public void testDepartmentExpense() {
		//Adding five managers
		department.addEmployee(generateManagerData());
		department.addEmployee(generateManagerData());
		department.addEmployee(generateManagerData());
		department.addEmployee(generateManagerData());
		department.addEmployee(generateManagerData());
		
		Assert.assertTrue(department.getMonthlyExpenses()==16500);
	}

	public Manager generateManagerData() {
		// creating new Manager and adding one developer and one tester
		Manager manager = new Manager();

		manager.addSubordinate(new Developer());
		manager.addSubordinate(new Developer());
		manager.addSubordinate(new Tester());
		manager.addSubordinate(new Tester());
		return manager;
	}

}
