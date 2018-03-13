package solidprinciples.interfacesegrtion.violation;
/**
 * 
 * @author Jitesh
 * @date - 03/13/2018
 *
 */
public interface EmployeeViolation {

	public boolean addEmployee(Employee e);
	
	public Employee getEmployee(int id);
	
	public String getDepartment(int id);
	
	public boolean setAppraisal (int id , double salPercentage);
}
