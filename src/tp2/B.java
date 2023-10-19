package tp2;
/**
 * La classe B contient une unique méthode divise() prenant un entier n et qui renvoie n/2 s’il est divisible par 13 et n+2 sinon.
 */
public class B {
	/**
	 * La méthode divise() prenant un entier n et qui renvoie n/2 s’il est divisible par 13 et n+2 sinon.
	 * @param n: entier à modifier
	 * @return n/2 si divisible par 13 et n+2 sinon.
	 */
	public static int divise(int n)	{
		if (A.treize(n)) return n/2;
		return n+2;
	}
}
