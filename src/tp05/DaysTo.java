package tp05;

public class DaysTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date_target = new Date(14, 07, 2024);
		Date date_today = new Date();
		int nb_jours = 0;
		while (date_today.CompareTo(date_target)) {
			date_today.Incrementer();
			nb_jours++;
		}
		System.out.println("Il reste " + nb_jours + " jours avant le 14 juillet 2024");
	}

}
