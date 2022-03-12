
public class UC2 {
	int dice() {
		int dice = (int)(Math.random()*10%6+1);
		return dice;
	}
	public static void main(String[] args) {
		int position = 0;
		UC2 a = new UC2();		
		System.out.println("Player 1 is at position "+position);
		int dice=(int)(Math.random()*10%6+1);
		System.out.println("Player 1 rolls the dice and got");
		System.out.println(a.dice());
	}
}
