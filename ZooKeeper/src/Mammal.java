
public class Mammal {
	protected int energyLevel;
	public Mammal() {
		super();
		this.energyLevel=100;
		}
	public void displayEnergyLevel() {
		System.out.println("Energy level: "+this.energyLevel);
		}
	public int getEnergyLevel() {
		return energyLevel;
		}
}