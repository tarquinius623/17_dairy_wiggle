import java.util.Random;
// @BC: Clean, well designed superclass here. Nicely done.
public abstract class Employee {
	private double effectivenessMultiplier;
	private double baseWeeklySalary;
	private double totalPaymentToDate;
	private int idNumber;
	Random r = new Random();
	
	public 
	Employee(int n, double ws){
		idNumber = n;
		baseWeeklySalary = ws;
		effectivenessMultiplier = 1;
		totalPaymentToDate = 0;
	}
	
	public abstract void work();
	
	// @BC: Looking at how this is used in all of your subclasses, would you reconsider how to implement your mutator method(s) here?
	public void setEffectivenessMultiplier(double em) {
		effectivenessMultiplier = em;
	}
	
	public double getEffectivenessMultiplier() {
		return effectivenessMultiplier;
	}
	
	public void setTotalPayment(double p) {
		totalPaymentToDate = p;
	}
	
	public double getTotalPayment() {
		return totalPaymentToDate;
	}
	
	public void earnPaycheck(){
		double paycheck = baseWeeklySalary * effectivenessMultiplier;
		setTotalPayment(getTotalPayment() + paycheck);
	}
	
	public void earnBonus(double amt){
		setTotalPayment(getTotalPayment() + amt);
	}
	
	public boolean calculateChances(int p) {
		int rand = r.nextInt(101);
		if (rand <= p) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		double paycheck = baseWeeklySalary * effectivenessMultiplier;
		return "Employee #"+idNumber+" has made "+totalPaymentToDate+" so far with a current salary of "+paycheck+"." ;
	}
}