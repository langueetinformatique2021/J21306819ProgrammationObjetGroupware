package tp2;

/**
 * La classe testAB contient une méthode main qui teste la méthode divise() de la classe B un certain nombre de fois.
 */
public class testAB {
	
	/**
	 * La méthode main() initialise des entiers n à 1 et m à 50 et crée une boucle exécutée m fois, qui à chaque itération, 
	 * calcule le résultat de B.divise(n) et le réassigne à n et affiche ensuite le résultat dans la console sous le format :
	 * "itération n°{i}: {n}".  
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m = 50, n = 1;
		
		for (int i = 1; i<=m; i++)	{
			n = B.divise(n);
			System.out.println("itération n°" + i + ": " + n);
		}
	}

}
