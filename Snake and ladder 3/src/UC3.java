
public class UC3 {
	int dice() {
		int dice = (int)(Math.random()*10%6+1);
		return dice;
	}

	int option() {
		int option = (int)(Math.random()*10%3+1);
		return option;

		}
	public static void main(String[] args) {
		int position = 0;
		UC3 a = new UC3();
		System.out.println("Welcome To Snake And Ladder Game");
		System.out.println("Player 1 is at position "+position);
		System.out.println("Player 1 rolls the dice and got");
		System.out.println(a.dice());
		int option = a.option();
		if(option == 1) {
			System.out.println("No Play | Player stay at position where he was");
		}
		else if (option == 2) {
			System.out.println("Ladder |Player move ahead by number "+a.dice());
			position = position +a.dice();
		}
		else if (option == 3) {
			System.out.println("Snake |Player bitten by snake go back by number  "+a.dice());
			position = position -a.dice();
		}

	}

}

