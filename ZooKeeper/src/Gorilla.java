
public class Gorilla extends Mammal{
	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		if(this.energyLevel>=5){
			System.out.println("Gorilla has thrown a rock at you");
			this.energyLevel-=5;
			this.displayEnergyLevel();
		}
		else {
			System.out.println("Gorilla has no energy!");
			this.displayEnergyLevel();
		}
	}
	
	public void eatBananas() {
		System.out.println("Mmmmm! Energy increased by 10");
		this.energyLevel+=10;
		this.displayEnergyLevel();
	}
	
	public void climb() {
		if(this.energyLevel>=10) {
			System.out.println("Gorilla is climbing!");
			this.energyLevel-=10;
			this.displayEnergyLevel();
		}
		else {
			System.out.println("Gorilla has no energy!");
			this.displayEnergyLevel();
		}
	}
	
}
