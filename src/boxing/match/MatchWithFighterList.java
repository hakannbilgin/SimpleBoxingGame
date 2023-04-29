package boxing.match;

import java.util.Formatter;
import boxing.player.Fighter;
import boxing.utils.PlayerScanner;

public class MatchWithFighterList {

	private int id;
	private Fighter f;
	
	public void fighterList() {
		
		String fighterFormat = " Fighter Name %s [ID %d]/ [Damage %d] / [Health %d] / [ Weight %d]  / [ Dodge %d] \n ";
		Formatter formatter = new Formatter();

		formatter.format(fighterFormat, "Egolu Hakan", 1, 25, 100, 100, 30)
				.format(fighterFormat, "Uzun Mustafa", 2, 25, 100, 85, 35)
				.format(fighterFormat, "Omurga Kıran", 3, 30, 80, 85, 45)
				.format(fighterFormat, "Gülle Ahmet", 4, 20, 120, 90, 35)
				.format(fighterFormat, "Tek Kol Mithat", 5, 35, 60, 90, 50);
		System.out.println(formatter);
		
	}
	
	public Fighter fighterListMatch(int fn) {
		
		
		System.out.println(" Player "+fn+" Please select your Fighter");
		id = PlayerScanner.intScanner();

		switch (id) {
		case 1:
			f = new Fighter("Egolu Hakan", 25, 100, 100, 30);
			break;
		case 2:
			f = new Fighter("Uzun Mustafa", 25, 100, 85, 35);
			break;
		case 3:
			f = new Fighter("Omurga Kıran", 30, 80, 85, 45);
			break;
		case 4:
			f = new Fighter("Gülle Ahmet", 20, 120, 90, 35);
			break;
		case 5:
			f = new Fighter("Tek Kol Mithat", 35, 60, 90, 50);
			break;
		default:
			break;
		}
		
		return f;
	}
}
