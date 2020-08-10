package ml.brainin;

public class Creature extends CreaturePrint implements IFeeding{
	private CreatureType creatureType;
	private boolean isHungry;
	
	private CreatureType getCreatureType() {
		return creatureType;
	}

	private void setCreatureType(CreatureType creatureType) {
		this.creatureType = creatureType;
	}

	private boolean isHungry() {
		return isHungry;
	}

	private void setIsHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}

	public Creature() {
		this(CreatureType.Footy);
	}
	
	public Creature(CreatureType creatureType) {
		this.setCreatureType(creatureType);
	}

	@Override
	public void feedCreature() {
		this.setIsHungry(false);
	}

	@Override
	public void printCreature() {
		switch(creatureType) {
			case Footy:
				super.printFooty(this.isHungry());
			break;
			case Heady:
				super.printHeady(this.isHungry());
			break;
			case Trunky:
				super.printTrunky(this.isHungry());
			break;
		}
		
	}
	
}
