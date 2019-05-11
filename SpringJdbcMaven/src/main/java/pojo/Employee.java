package pojo;

public class Employee {

	private int empNO;
	private String eName;
	private String job;
	private int mgr;
	
	private double sal;
	private double comm; 
	private int deptNo;
	
	public Employee(int empNO, String eName, String job, int mgr, double sal, double comm,
			int deptNo) {
		super();
		this.empNO = empNO;
		this.eName = eName;
		this.job = job;
		this.mgr = mgr;
	
		this.sal = sal;
		this.comm = comm;
		this.deptNo = deptNo;
	
	}


	@Override
	public String toString() {
		return "Employee [empNO=" + empNO + ", eName=" + eName + ", job=" + job + ", mgr=" + mgr + ", sal=" + sal
				+ ", comm=" + comm + ", deptNo=" + deptNo + "]";
	}


	public int getEmpNO() {
		return empNO;
	}

	public void setEmpNO(int empNO) {
		this.empNO = empNO;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public Employee() {
		super();
	}
	
}
