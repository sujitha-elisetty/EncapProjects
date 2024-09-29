package encap.array;

import java.util.ArrayList;

class Team{
	private ArrayList<String> players;
	public ArrayList<String> getPlayers() {
		return players;
		
	}
	public void setPlayers( ArrayList<String> players) {
		this.players = new ArrayList<String>();
	}
}
public class EncapArray {

	public static void main(String[] args) {
		ArrayList<String> players = new ArrayList<>();
		players.add("hello");
		players.add("ram");
		players.add("seeta");
		players.add("seet");
		players.add("swetha");
		players.add("bench");
		System.out.println(players);
		players.set(0, "shyam");
		System.out.println(players);
		players.remove(0);
		System.out.println(players);
		System.out.println(players.size());
		for(int i=0;i<players.size();i++) {
			System.out.println(players.get(i));
		}
		
		}

}
