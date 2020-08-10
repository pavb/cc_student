package ml.brainin;

public class Application {

	public void go() {
		int creaturesCount = (int)(Math.random() * (10) + 1);
		Stable stable = new Stable(creaturesCount);
		stable.addCreature(new Creature(CreatureType.Heady));
		stable.addCreature(new Creature(CreatureType.Footy));
		stable.feedCreatures(3);
		stable.addCreature(new Creature(CreatureType.Heady));
		stable.addCreature(new Creature(CreatureType.Trunky));
		stable.feedCreatures(3);
	}
	public static void main(String[] args) {
		Application application = new Application();
		application.go();
	}
}
