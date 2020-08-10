package ml.brainin;

public class CreaturePrint {

	
	public void printHeady(boolean istHungrig){
		if (istHungrig) {
			System.out.println("|           ||||||           |");
			System.out.println("|          |      |          |");
			System.out.println("|          | @  @ |          |");
			System.out.println("|          |      |          |");
			System.out.println("|          | ,--, |          |");
			System.out.println("|           \\____/          |");
		}
		else {
			System.out.println("|           ||||||           |");
			System.out.println("|          |      |          |");
			System.out.println("|         |  @  @  |         |");
			System.out.println("|         |        |         |");
			System.out.println("|         \\  `--´  /        |");
			System.out.println("|          \\______/         |");
		}
	}
	
	public void printFooty(boolean istHungrig){
		if (istHungrig) {
			System.out.println("|       *************        |");
			System.out.println("|     **    @   @    **      |");
			System.out.println("|   **     .-----.      **   |");
			System.out.println("|  *       `-----´       *   |");
			System.out.println("|   *********************    |");
			System.out.println("|    _|  _|  _|_  |_  |_     |");
		}
		else {
			System.out.println("|      ***************       |");
			System.out.println("|   ***     @   @     ***    |");
			System.out.println("|  *                     *   |");
			System.out.println("|  *       `-----´       *   |");
			System.out.println("|   *********************    |");
			System.out.println("|    _|  _|  _|_  |_  |_     |");
		}
	}
	
	public void printTrunky(boolean istHungrig){
		if (istHungrig) {
			System.out.println("|  @    @                    |");
			System.out.println("|   \\___/                    |");
			System.out.println("|   /   \\_________________   |");
			System.out.println("|  ( ~~~                  \\  |");
			System.out.println("|   \\_____________________/  |");
			System.out.println("|                            |");
		}
		else {
			System.out.println("|  @    @                    |");
			System.out.println("|   \\___/                    |");
			System.out.println("|   /   \\_________________   |");
			System.out.println("|  ( °-°                  \\  |");
			System.out.println("|   \\                     /  |");		
			System.out.println("|    \\___________________/   |");
		}
	}
	
	

}
