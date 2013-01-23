public class Shaker extends Employee {
	
	public Shaker(int id, double ws) {
		super(id, ws);
	}
	
	public void work() {
		shake();
	}
	
	public void shake() {
		setEffectivenessMultiplier(getEffectivenessMultiplier() + 0.02);
	}
}