package boxing.match;

import boxing.player.Fighter;
import boxing.utils.PlayerScanner;

public class MatchWithPlayerOutput {


	private Fighter f;


	public Fighter userMatch(int fn) {

		System.out.println(" Fighter " + fn + " Please write your name");
		String fnname = PlayerScanner.stringScanner();
		System.out.println(" Fighter " + fn + " Please write damage");
		int fndamage = PlayerScanner.intScanner();
		System.out.println(" Fighter " + fn + " Please write health  ");
		int fnhealth = PlayerScanner.intScanner();
		System.out.println(" Fighter " + fn + " Please write weight  ");
		int fnweight = PlayerScanner.intScanner();
		System.out.println(" Fighter " + fn + " Please write your dodge per cent");
		int fndodge = PlayerScanner.intScanner();
		f = new Fighter(fnname, fndamage, fnhealth, fnweight, fndodge);

		System.out.println("Fighter " + fn + " IS READY!!");
		return f;

	}

}
