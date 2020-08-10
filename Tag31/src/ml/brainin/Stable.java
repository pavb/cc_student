package ml.brainin;

public class Stable {
	private Creature[] creatures;
	private int currentCapacity = 0;
	
	private Creature[] getCreaturs() {
		return creatures;
	}

	private void setCreaturs(Creature[] creaturs) {
		this.creatures = creaturs;
	}


	private void setCreaturesCount(int creaturesCount) {
		this.setCreaturs(new Creature[creaturesCount]);
	}

	public void addCreature(Creature creature) throws RuntimeException{
		for (int i = 0; i < creatures.length; i++) {
			if (creatures[i] == null) {
				creatures[i] = creature;
				currentCapacity++;
				return;
			}
		}
		throw new RuntimeException("Stable is full, no room for new creature!");
	}
 	public void feedCreatures(int  indexHungry) {
 		System.out.println("\nindexHungry : "+indexHungry+" currentCapacity : "+currentCapacity+" \n");
		int i = 0;
		for (; i < creatures.length; i++) {
			if (creatures[i] != null) {
				if (i < indexHungry) {
					creatures[i].feedCreature();
				}
				creatures[i].printCreature();
			}
		}
		if (indexHungry ==currentCapacity) {
			System.out.println("All creatures are fed, no food left!");
		}else if (indexHungry > currentCapacity) {
			System.out.println("All creatures are fed, some food is left!");
		}else {
			System.out.println("Not enough food, some creatures go hungry!");
		}
		
	}
	public Stable() {
		this(5);
	}

	public Stable(int creaturesCount) {
		this.setCreaturesCount(creaturesCount);
		printStable();
	}

	private void printStable() {
		System.out.println("Current capacity : "+creatures.length);
		System.out.println("+----------------------------+");
		System.out.println("|                            |");
		System.out.println("|                            |");
		System.out.println("|                            |");
		System.out.println("|                            |");
		System.out.println("|                            |");
		System.out.println("|                            |");
		System.out.println("+----------------------------+");
	}
}
