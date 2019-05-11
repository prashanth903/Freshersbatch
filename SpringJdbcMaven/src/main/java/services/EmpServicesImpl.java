package services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DAO.EmpDaoImpl;
import pojo.Employee;

public class EmpServicesImpl implements EmpServices {

	
	ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
	 EmpDaoImpl ed=(EmpDaoImpl)ac.getBean("edao");
	@Override
	public boolean addEmp(Employee e) {
		
		ed.insert(e);
		return true;
	}

	@Override
	public List<Employee> getEmp(Employee e) {
		return ed.employee(e);
		
	}

	@Override
	public boolean updateEmpSal(Employee e) {
	  ed.update(e);
		return true;
	}
	
	@Override
	public List<Employee> orderBy(Employee e) {
		
		return ed.employee(e);
	}

	@Override
	public List<Employee> groupBy(Employee e) {
		
		return ed.employee(e);
	}

	@Override
	public String getMaxSal(Employee e) {
		List<Employee> l=ed.getAll();
		Double maxSal=l.stream().map(ed->e.getSal()).max((x,y)->x.compareTo(y)).get();
		System.out.println(maxSal);
		return null;
	}

	@Override
	public List<Employee> getWithoutComm(Employee e) {
		List<Employee> l=ed.getAll();
		List<String> result = l.stream() .filter(line ->line.getComm()==0).map(ed->e.geteName()).collect(Collectors.toList());
		result.forEach(emp -> System.out.println(emp));
		return null;
	}	
	
}