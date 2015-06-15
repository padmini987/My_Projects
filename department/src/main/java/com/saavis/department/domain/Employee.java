package com.saavis.department.domain;

public abstract class Employee {

	public static final long DEVELOPER_ALLOCATION = 1000;

	public static final long TESTER_ALLOCATION = 500;

	public static final long MANAGER_ALLOCTION = 300;

	protected long allocation;

	protected Employee manager;

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public long getMonthlyExpenses() {
		return allocation;
	}

	public long getAllocation() {
		return allocation;
	}

/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (allocation ^ (allocation >>> 32));
		result = prime * result + ((manager == null) ? 0 : manager.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (allocation != other.allocation)
			return false;
		if (manager == null) {
			if (other.manager != null)
				return false;
		} else if (!manager.equals(other.manager))
			return false;
		return true;
	}
	
	*/

}
