package com.saavis.department.domain;

import java.util.ArrayList;
import java.util.List;


public class Manager extends Employee {
	
	protected List<Employee> subordinates = new ArrayList<Employee>();

	public Manager() {
		super();
		this.allocation = MANAGER_ALLOCTION;
	}
	
	public long getMonthlyExpenses() {

		long monthlyExpense = 0;

		for (Employee employee : this.subordinates) {
			monthlyExpense += employee.getMonthlyExpenses();
		}
		//adding its own allocation
		monthlyExpense += allocation;
		
		return monthlyExpense;
	}
	
	public void addSubordinate(Employee employee) {
		subordinates.add(employee);
	}

	public void removeSuboridate(Employee employee) {
		subordinates.remove(employee);
	}
}
