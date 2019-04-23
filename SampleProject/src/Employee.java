
public abstract class Employee {
	private String employeeId;
	private String employeeName;
	private String department;
	private String basicSalary;
	
	public String getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}



	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public String getBasicSalary() {
		return basicSalary;
	}



	public void setBasicSalary(String basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	
//	/**
//	 * @param employeeId
//	 * @param employeeName
//	 * @param department
//	 * @param basicSalary
//	 */
//	public Employee(String employeeId, String employeeName, String department, String basicSalary) {
//		super();
//		this.employeeId = employeeId;
//		this.employeeName = employeeName;
//		this.department = department;
//		this.basicSalary = basicSalary;
//	}



	public String attendance() {
		
		return "Attendance";
		
	} 
	
	public abstract String salary();

}
