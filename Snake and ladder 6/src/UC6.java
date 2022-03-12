import java.util.Random;
public class UC6 {
	    public static void main(String[] args) {
	        int currentplace = 0;
	        int roll = 0;
	        System.out.println("Welcone to snake and ladder game");
	        while (currentplace <= 99) {
	            Random rn = new Random();
	            int dice = rn.nextInt(6) + 1;
	            System.out.println("The player got die value"+dice);
	            currentplace = currentplace + dice;
	            roll = roll + 1;
	            
	            Random a = new Random();
	            int option = a.nextInt(3) + 1;

	            switch (option) {
	                case 1:
	                    currentplace = currentplace;
	                    System.out.println("The player got no play");
	                    break;
	                case 2:
	                    currentplace = currentplace + dice;
	                    System.out.println("The player got ladder");
	                    if (currentplace > 100) {
	                        currentplace = currentplace - dice;
	                    }
	                    break;
	                case 3:
	                    currentplace = currentplace - dice-dice;
	                    System.out.println("The player got snake");
	                    if (currentplace < 0) {
	                        currentplace = 0;
	                    }
	                    break;
	            }
	            if (currentplace > 100) {
	                currentplace = currentplace - dice;
	            }
	            System.out.println("Present position of player  : "+currentplace);
	            System.out.println("--------------------------------------");
	        }
	        System.out.println("The Player finally reached 100 and Won the game");
	        System.out.println("No of times the die rolls : "+roll);
	  }
}
