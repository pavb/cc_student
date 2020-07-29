package ml.brainin;

public class OvenSimulator {
	public static void main(String[] args) {
		Oven oven = new Oven();
		
		Cotton cotton = new Cotton();
		Paper paper = new Paper();
		Coal coal = new Coal();
		Turf turf = new Turf();
		Wood wood = new Wood();
		
		boolean down = false;
		int refregirateCount = 5;
		while(!down) {
			int index = (int)(Math.random() * 4) + 1;
			try {
				switch (index) {
				case 0:
					cotton.burning(oven);
					break;
				case 1:
					paper.burning(oven);
					break;
				case 2:
					coal.burning(oven);
					break;
				case 3:
					turf.burning(oven);
					break;
				default:
					wood.burning(oven);
					break;
				}
			}catch(RuntimeException re) {
				System.out.println(re.getMessage());
				try {
					int temperature = (int)(Math.random() * ((350) + 1)) + 100;
					oven.gefrigerate(temperature);
					refregirateCount--;
					if (refregirateCount < 0) {
						down = false;
					}
				}catch(RuntimeException re1) {
					System.out.println(re1.getMessage());
					down = true;
				}
			}
		}
		System.out.println("Bye.");
		System.exit(0);
	}
}
