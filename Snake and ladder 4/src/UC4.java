
public class UC4 {
	int dice() {
		int dice=(int)(Math.random()*10%6+1);
		return dice;	}

	int option() {
		int option=(int)(Math.random()*10%3+1);
		return option;
		}
	
	public static void main(String[] args) {
		int position=0;
		UC4 a=new UC4();
		System.out.println("Welcome To Snake And Ladder Game");
		System.out.println("Player 1 is at position "+position);
		System.out.println("Player 1 rolls the dice and got");
		while(position<100){
		int option = a.option();
		switch (option) {
			case 1:
			System.out.println("No play");
			break;
			case 2  :
			System.out.println("Ladder");
			position = position +a.dice();
			 if(position>100){
				position = position -a.dice();
				}
			break;

			case 3:
			System.out.println("Snake");
			if(position>0) {
			position = position -a.dice();
			}
			else if(position<0){
			break;
		}
			break;

		}

	}
		System.out.println("Player 1 win is in position "+position);
	}


}
