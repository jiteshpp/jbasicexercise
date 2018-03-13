package solidprinciples.singlerepo.solution;
/**
 * 
 * @author Jitesh
 * @date - 03/13/2018
 *
 */
public class CalculateTaxClas {
	public double calculateTax(TaxModel taxModel)
	{
	
	double principalAmount = taxModel.getPrincipalAmount();
	double priInerest = taxModel.getPriInterest();
	double serviceTax = taxModel.getServiceTax();
		return principalAmount*(priInerest+serviceTax)/100;
	}
}
