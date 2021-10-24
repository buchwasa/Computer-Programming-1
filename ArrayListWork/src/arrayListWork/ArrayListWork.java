package arrayListWork;

import java.util.ArrayList;

public class ArrayListWork {

	public static void main(String[] args) {
		ArrayList<String> footballTeams = new ArrayList<String>();

		footballTeams.add("Patriots");
		footballTeams.add("Washington Football Team");

		System.out.println(footballTeams.size());

		footballTeams.add("Dolphins");
		for (String footballTeam : footballTeams) {
			System.out.println(footballTeam);
		}
		footballTeams.add(0, "Bearcats");
	}
}
