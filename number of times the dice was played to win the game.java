public class SnakeLadder {
	static int counter = 0;


	public static int rollDice() {
		int dice = (int) (Math.random() * 10) % 6 + 1;
		counter++;
		return dice;
	}


	public static void playerOption() {
		int position = 0;

		while (position < 100) {
			int check = (int) (Math.random() * 10) % 3 + 1;
			System.out.println();
			System.out.println("Playing Option :" + check);

			switch (check) {
			case 1:
				System.out.println("player is not playing ");
				System.out.println("Player remain at position : " + position);
				break;

			case 2:
				int dice = rollDice();
				System.out.println("Dice Rolled... " + dice);
				position = position + dice;
				System.out.println("Its Ladder....");
				if (position > 100) {
					position = position - dice;
				}
				System.out.println("player is playing at : " + position);
				break;

			default:
				int dice2 = rollDice();
				System.out.println("Dice Rolled.... " + dice2);
				position = position - dice2;
				System.out.println("Ohhhh....its Snake");
				if (position < 1) {
					position = 0;
				}
				System.out.println("player position : " + position);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Lets play...");
		playerOption();
		System.out.println("Total Count to Win the Game : " + counter);
	}
}