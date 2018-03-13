package solidprinciples.singlerepo.solution;
/**
 * 
 * @author Jitesh
 * @date - 03/13/2018
 *
 */
public class TaxModel {
	private double principalAmount;
	private double priInterest;
	private double vatTax;
	private double serviceTax;
	private boolean isServiceTxnApplicable;
	private double gst;
	private double isGstApplicable;
	
	
	
	public double getPrincipalAmount() {
		return principalAmount;
	}
	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount = principalAmount;
	}
	public double getPriInterest() {
		return priInterest;
	}
	public void setPriInterest(double priInterest) {
		this.priInterest = priInterest;
	}
	public double getVatTax() {
		return vatTax;
	}
	public void setVatTax(double vatTax) {
		this.vatTax = vatTax;
	}
	public double getServiceTax() {
		return serviceTax;
	}
	public void setServiceTax(double serviceTax) {
		this.serviceTax = serviceTax;
	}
	public boolean isServiceTxnApplicable() {
		return isServiceTxnApplicable;
	}
	public void setServiceTxnApplicable(boolean isServiceTxnApplicable) {
		this.isServiceTxnApplicable = isServiceTxnApplicable;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getIsGstApplicable() {
		return isGstApplicable;
	}
	public void setIsGstApplicable(double isGstApplicable) {
		this.isGstApplicable = isGstApplicable;
	}

}
