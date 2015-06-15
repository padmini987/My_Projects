package com.saavis.department.domain;

import java.util.ArrayList;
import java.util.List;

public class Department {

	List<Employee> listOfEmployees = new ArrayList<Employee>();

	public void addEmployee(Employee employee) {
		listOfEmployees.add(employee);
	}

	public void removeEmployee(Employee employee) {
		listOfEmployees.remove(employee);
	}

	public List<Employee> getListOfEmployees() {
		return listOfEmployees;
	}

	public long getMonthlyExpenses() {

		long monthlyExpense = 0;

		for (Employee employee : this.listOfEmployees) {
			monthlyExpense += employee.getMonthlyExpenses();
		}

		return monthlyExpense;
	}
}
