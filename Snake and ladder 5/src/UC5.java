import java.util.Random;
public class UC5 {
	    public static void main(String[] args) {
	        int currentplace = 0;
	        System.out.println("Welcome to snake and ladder game");
	        while (currentplace <= 99) {
	            Random s = new Random();
	            int dice = s.nextInt(6) + 1;
	            currentplace = currentplace + dice;
	            System.out.println("The player die value:" + dice);
	            Random a = new Random();
	            int option = a.nextInt(3) + 1;

	            switch (option) {
	                case 1:
	                    currentplace = currentplace;
	                    System.out.println("The player got no play");
	                    break;
	                case 2:
	                    currentplace = currentplace + dice;
	                    System.out.println("The player get ladder");
	                    if (currentplace > 100) {
	                        currentplace = currentplace - dice;
	                    }
	                    break;
	                case 3:
	                    currentplace = currentplace - dice - dice;
	                    System.out.println("The player get snake");
	                    if (currentplace < 0) {
	                        currentplace = 0;
	                    }
	                    break;
	            }
	            if (currentplace > 100) {
	                currentplace = currentplace - dice;
	            }
	            System.out.println("Current place of the Player : " + currentplace);
	            System.out.println("____________________________");
	        }
	        System.out.println("Finally winned the Game and reached " + currentplace);
	  } 
}
