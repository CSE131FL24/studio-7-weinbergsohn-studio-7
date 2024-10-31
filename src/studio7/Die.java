package studio7;

public class Die {

	public static int getDiceRoll(int n) {
		return (int)(Math.random()*n+1);
	}
	public static void main(String[] args) {
		int numSides = 6;
		System.out.println(getDiceRoll(numSides));
	}

}
