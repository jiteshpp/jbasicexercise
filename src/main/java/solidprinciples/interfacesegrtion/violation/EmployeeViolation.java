package solidprinciples.interfacesegrtion.violation;

public interface EmployeeViolation {

	public boolean addEmployee(Employee e);
	
	public Employee getEmployee(int id);
	
	public String getDepartment(int id);
	
	public boolean setAppraisal (int id , double salPercentage);
}
