package main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DAO.EmpDaoImpl;
import pojo.Employee;
import services.EmpServicesImpl;

public class TestEmp {


	public static void main(String[] args)
	{

		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");

		Employee e = new Employee();
		e.setEmpNO(1111);
		e.seteName("prashanth");
		e.setJob("Analyst");
		e.setMgr(0);
	//	e.setHireDate('23-JAN-1996');
		e.setSal(1500);
		e.setComm(0);
		e.setDeptNo(20);

		EmpDaoImpl edl = (EmpDaoImpl) ac.getBean("edao");
		EmpServicesImpl esi=new EmpServicesImpl();
//		 esi.updateEmpSal(e);
		edl.update(e);
		edl.delete(e);
		
	 esi.orderBy(e);
	 
	 List<Employee> list1= edl.orderBy();

	 for(Employee e1:list1)
	 {
	 System.out.println(e1);
	 }
	 esi.getEmp(e);
		 
		 List<Employee> list= esi.getEmp(e);
			
			for(Employee e1:list)
			{
		 System.out.println(e1);
		}
		 
			esi.groupBy(e);
		
			 
			 List<Employee> list2= esi.getEmp(e);
				
				for(Employee e2:list2)
				{
			 System.out.println(e2);
			}
	
				esi.getMaxSal(e);
			//	esi.getWithoutComm(e);
//		 List<Employee> list4= esi.getWithoutComm(e);
//	
//			for(Employee e7:list4)
//			{
//		 System.out.println(e7);
//		}
//		 
//		edl.insert(e);
//		edl.delete(e);
//		edl.getAll();
//		
//		List<Employee> list= edl.getAll();
//		
//		for(Employee e1:list)
//		{
//	 System.out.println(e1);
//		}
//		
//		edl.groupBy();
	}
	

}


 


