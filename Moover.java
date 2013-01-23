public class Moover extends Employee {
	
	public Moover(int id, double ws) {
		super(id, ws);
	}
	
	public void work() {
		takeOrder();
		deliverShake();
	}
	
	public void deliverShake() {
		if (calculateChances(5)) {
			setEffectivenessMultiplier(getEffectivenessMultiplier() - 0.1);
		} else {
			setEffectivenessMultiplier(getEffectivenessMultiplier() + 0.03);
		}	
	}
	
	public void takeOrder() {
		if (calculateChances(20)) {
			setEffectivenessMultiplier(getEffectivenessMultiplier() - 0.1);
		} else {
			setEffectivenessMultiplier(getEffectivenessMultiplier() + 0.05);
		}	
	}
	
}