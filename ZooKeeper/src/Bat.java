
public class Bat extends Mammal{

	public Bat() {
		this.energyLevel=300;
	}
	public void fly() {
		if(this.energyLevel>=50) {
			System.out.println("trrrrrrrrrrrb");
			this.energyLevel-=50;
			this.displayEnergyLevel();
			
		}
		else {
			System.out.println("Bat has no energy!");
			this.displayEnergyLevel();
		}
	}
	public void eatHumans() {
		this.energyLevel+=25;
		this.displayEnergyLevel();
	}
	public void attackTown() {
		if(this.energyLevel>=100) {
			System.out.println("tshhhhhrrrr");
			this.energyLevel-=100;
		}
		else {
			System.out.println("Bat has no energy!");
		}
	}

}
