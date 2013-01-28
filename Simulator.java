import java.util.Random;

public class Simulator {
	private Employee[] employees;
	private int numberOfWeeks;
	// @BC: Remember to save initialization for methods (and constructors). We'll talk about this convention more
	//	(and eventually break it when we learn about FINAL fields) soon
	Random r = new Random();
	
	public static void main(String[] args){
		System.out.println("Welcome to the Dairy Wiggle Simulator!");
		Simulator s = new Simulator();
	}
	
	public Simulator(){
		employees = new Employee[6];
		numberOfWeeks = 24;
		System.out.println("Initializing Employees");
		for (int index = 0; index < employees.length; index++) {
			// @BC: These if statements can be simplified. They don't need the &&. Can you think of how?
			if (index < 2) {
				employees[index] = new TastebudStylist(index, 8.00);
			} else if (index > 1 && index < 4) {
				employees[index] = new Moover(index, 7.50);
			} else if (index > 3 && index <= 6) {
				employees[index] = new Shaker(index, 7.00);
			}
		}
		System.out.println("Employees Successfully Initialized!");
		for (int i = 0; i < numberOfWeeks; i++){
			System.out.println("");
			System.out.println("It is week #"+(i+1));
			for (int i1 = 0; i1 < employees.length; i1++) {
				int dayCount = 0;
				while (dayCount < 5) {
					employees[i1].work();
					dayCount = dayCount + 1;
				}
				employees[i1].earnPaycheck();
				System.out.println(employees[i1]);
			}
			// @BC: Careful -- you are using magic numbers here. Can you think of how to do this with the % operator?
			if (i == 3 || i == 7 || i == 11 || i == 15 || i == 19 || i == 23) {
				int winner = r.nextInt(employees.length);
				double bonusAmt = 100 + r.nextInt(100);
				employees[winner].earnBonus(bonusAmt);
				System.out.println("Employee #"+winner+" has won the bonus!");
			}
		}
	}
}