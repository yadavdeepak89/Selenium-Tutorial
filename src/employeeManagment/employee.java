package employeeManagment;

public class employee {
	
	private int employeeId;
	private String employeeName;
	private String designation;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", designation=" + designation
				+ "]";
	}
	
	/*employee(int employeeId,String employeeName,String designation ){
		this.employeeId= employeeId;
		this.employeeName= designation;
		this.designation= employeeName;
		
	}*/
}
