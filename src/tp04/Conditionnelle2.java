package tp04;
/**
 * La classe Conditonnelle1 contient uniquement une méthode main qui à partir de 3 variables p1=10, p2=9 et p3=-1, assigne
 * à p4 la valeur minimale pour ensuite l’afficher dans la console
 */
public class Conditionnelle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p1 = 10, p2 = 9, p3 = -1;
		int p4;
		if (p1 < p2) {
			if (p1 < p3) p4 = p1;
			else p4 = p3;
		}
		else {
			if (p2<p3) p4 = p2;
			else p4 = p3;
		}
		System.out.println(p4);
	}
}
