public class UC7 {
		int turn = 2;
		int position1 = 0;
		int position2 = 0; 
		int dice() {
			int dice = (int)(Math.random()*10%6+1);
			return dice;
		}

		int option() {
			int option = (int)(Math.random()*10%3+1);
			return option;

			}
		int turnChange() {
			if(turn == 2) {
				turn = 1;
			}
			else if(turn == 1) {
				turn=2;
			}
			return turn;
		}

		void maingame( ) {
			int dice = dice();
			int option = option();
			switch(option) {
			case 1 :
				turnChange();
			break;

			case 2 :
			if(turn == 1 && position1<100)
			{
				position1 = position1+dice;
				if(position1>100) {
					position1=position1-dice;
				}
				else if(position1<=100) {
					break;
				}
			}
			if(turn == 2 && position2<100) {

				position2 = position2+dice;
				if(position2>100) {
					position2 = position2-dice;
				}
				else if(position2<=100) {
					break;
				}
				turnChange();

				}
			break;
			case 3 :
			{
				if(turn == 1 && position1>0)
				{
					position1 = position1-dice;

					}
				}
				if(turn == 2 && position2>0) {

					position2 = position2-dice;
				}
				turnChange();
				break;
			}
		}

		public static void main(String[] args) {
			int diceCount = 0;
			UC7 rv = new UC7();
			System.out.println("Welcome To snake and ladder game");
			while(rv.position1<=99 &&rv.position2<=99) {
			rv.maingame();
			diceCount++;
			System.out.println("Player position after roll no "+diceCount+" is "+rv.position1);
			System.out.println("Player position after roll no "+diceCount+" is "+rv.position2);
			}
			System.out.println("Player 1 reached position "+rv.position1);
			System.out.println("Player 2 reached position "+rv.position2);
			if(rv.position1>rv.position2) {
				System.out.println("player 1 win");
			}
			else {
				System.out.println("player 2 win");
			}

			System.out.println("Dice Count is "+diceCount);
	}
} 
