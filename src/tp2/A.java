package tp2;

/**
 * La classe A contient une unique méthode treize prenant un entier n et renvoyant un booléen indiquant si cet entier est divisible par 13.
 */
public class A {
	/**
	 * La méthode treize prend un entier n et renvoyant un booléen indiquant si cet entier est divisible par 13.
	 * @param n: entier dont on doit tester la divisibilité par 13.
	 * @return résultat de ce test.
	 */
	public static boolean treize(int n)	{
		return (n % 13 == 0);
	}
}
