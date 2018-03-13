package solidprinciples.interfacesegrtion.violation;

public class EmployeeInterSegViolations implements EmployeeViolation {

	public boolean addEmployee(Employee e) {
		return false;
	}

	public Employee getEmployee(int id) {
		return null;
	}

	public String getDepartment(int id) {
		return null;
	}

	public boolean setAppraisal(int id, double salPercentage) {
		return false;
	}

}
