package tp04;

/**
 * La classe Conditonnelle3 contient une méthode mediane qui prend pour argument 3 entiers et renvoie la valeur mediane parmi ceux-ci. 
 * La fonction main permet de tester cette fonction mediane pour les 6 permutations possibles de 3 valeurs.
 */
public class Conditionnelle3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p1 = 10, p2 = 9, p3 = -1;
//		int p1  = 9, p2 = 10, p3 = -1;
//		int p1 = 9, p2 = -1, p3 = 10;
//		int p1 = 9, p2 = 10, p3 = -1;
//		int p1 = 10, p2 = -1, p3 = 9;
//		int p1 = -1, p2 = 10, p3 = 9;
//		int p1 = -1, p2 = 9, p3 = 10;
		int p4 = mediane(p1, p2, p3);
		System.out.println(p4);
		
	}
	
	
	/**
	 * La méthode mediane prend comme argument 3 entiers et renvoie la valeur médiane parmi ceux-ci. 
	 * @param p1 premier entier
	 * @param p2 second entier
	 * @param p3 troisième entier
	 * @return la mediane parmi p1, p2, p3
	 */
	public static int mediane(int p1, int p2, int p3) {
		int p4;
		if ((p1 >= p2 && p1 < p3)|(p1 >= p3 && p1 < p2)) p4 = p1; 
		else if ((p2 >= p1 && p2 < p3)|(p2 >= p3 && p2 < p1)) p4 = p2;
		else p4 = p3;
		return p4;
	}
}
