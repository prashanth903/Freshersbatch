package services;

import java.util.List;

import pojo.Employee;

public interface EmpServices {

	public boolean addEmp(Employee e);

	List<Employee> getEmp(Employee e);

	boolean updateEmpSal(Employee e);
	
	List<Employee> orderBy(Employee e);
	
	List<Employee> groupBy(Employee e);
	
	public String getMaxSal(Employee e);
	
	public List<Employee> getWithoutComm(Employee e);
	
}
