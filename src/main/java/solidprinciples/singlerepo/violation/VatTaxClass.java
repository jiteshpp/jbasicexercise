package solidprinciples.singlerepo.violation;

/**
 * 
 * @author Jitesh
 * @date - 03/13/2018
 *
 */
public class VatTaxClass {

	private double principalAmount;
	private double priInterest;
	private double vatTax;
	private double serviceTax;
	private boolean isServiceTxnApplicable;
	private double gst;
	private boolean isGstApplicable;

	public VatTaxClass(double principalAmount, double priInterest, double serviceTax) {
		this.principalAmount = principalAmount;
		this.priInterest = priInterest;
		this.serviceTax = serviceTax;

	}

	public double calculateTax() {

		return principalAmount * (priInterest + serviceTax) / 100;
	}

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

	public boolean getIsGstApplicable() {
		return isGstApplicable;
	}

	public void setIsGstApplicable(boolean isGstApplicable) {
		this.isGstApplicable = isGstApplicable;
	}

}
