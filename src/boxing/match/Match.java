package boxing.match;

import boxing.player.Fighter;
import boxing.utils.PlayerScanner;

public class Match {

	private MatchWithPlayerOutput matchWithPlayerOutput = new MatchWithPlayerOutput();
	private MatchWithFighterList matchWithFighterList = new MatchWithFighterList();
	private Fighter f1;
	private Fighter f2;
	private int minWeight = 85;
	private int maxWeight = 100;
	private int fn = 1;

	public Match() {

		System.out.println(
				"Welcome to the Boxing Game \n ####################### \n We have fighter list or you can create your own Fighter ");
		System.out.println("write (1) for creating your own figher  Write (2) for using list");

		int playerFighterChoose = PlayerScanner.intScanner();
		if (playerFighterChoose == 1) {
			UserOutputMatch();
		}
		if (playerFighterChoose == 2) {
			listMatch();
		}

	}

	public void UserOutputMatch() {

		System.out.println("The weight of fighters must be between the 85 and 100 kg.");

		f1 = matchWithPlayerOutput.userMatch(fn++);
		
		f2 = matchWithPlayerOutput.userMatch(fn);
		run();

	}

	public void listMatch() {

		matchWithFighterList.fighterList();

		f1 = matchWithFighterList.fighterListMatch(fn++);

		f2 = matchWithFighterList.fighterListMatch(fn);

		run();

	}

	public void run() {
		System.out.println("The box match between " + f1.getName() + " and " + f2.getName() + " is starting !");
		if (ischeck()) {
			int r = 1;
			while (this.f1.getHealth() > 0 && this.f2.getHealth() > 0) {

				System.out.println(r + "." + " ROUND");
				this.f2.setHealth(f2.getHealth() - this.f1.hit(f2));
				if (isWin()) {

					break;
				}
				this.f1.setHealth(f1.getHealth() - this.f2.hit(f1));

				if (isWin()) {
					break;
				}
				r++;
				System.out.println(f2.getName() + "'s current health is " + f2.getHealth());
				System.out.println(f1.getName() + "'s current health is " + f1.getHealth());

			}

		} else {
			System.out.println("Fighter are not in weight rage");
		}

	}

	private boolean ischeck() {

		return (this.f1.getWeight() >= minWeight && this.f1.getWeight() <= maxWeight)
				&& (this.f2.getWeight() >= minWeight && this.f2.getWeight() <= maxWeight);

	}

	private boolean isWin() {

		if (this.f1.getHealth() == 0) {
			System.out.println(f2.getName() + " has won !");
			System.out.println(f2.getName() + "'s current health is " + f2.getHealth());
			System.out.println(f1.getName() + "'s current health is " + f1.getHealth());
			return true;

		}
		if (this.f2.getHealth() == 0) {
			System.out.println(f1.getName() + " has won !");
			System.out.println(f2.getName() + "'s current health is " + f2.getHealth());
			System.out.println(f1.getName() + "'s current health is " + f1.getHealth());
			return true;

		}

		return false;
	}

}
