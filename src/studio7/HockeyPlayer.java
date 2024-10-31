package studio7;

public class HockeyPlayer {
	private String name;
	private int jersey;
	private String hand;
	private String shoots;
	private int points;
	private int assists;
	private int goals;
	private int games;
	
	HockeyPlayer(String name, int jersey, String hand, String shoots){
		this.name = name;
		this.jersey = jersey;
		this.hand = hand;
		this.shoots = shoots;
		this.goals = 0;
		this.assists = 0;
		this.points = 0;
		this.games = 0;
	}
	
	public static void game(HockeyPlayer player,int goals, int assists) {
		player.goals += goals;
		player.assists += assists;
		player.points += goals+assists;
		player.games ++;
	}
	
	public static void main(String[] args) {
		HockeyPlayer player1 = new HockeyPlayer("Bob",13,"right","right");

	}

}
