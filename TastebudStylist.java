public class TastebudStylist extends Employee {

	public TastebudStylist(int id, double ws) {
		super(id, ws);
	}
	
	public void work() {
		makeShake();
	}
	
	public void makeShake() {
		if (calculateChances(10)) {
			setEffectivenessMultiplier(1);
		} else {
			setEffectivenessMultiplier(getEffectivenessMultiplier() + 0.1);
		}	
	}
}