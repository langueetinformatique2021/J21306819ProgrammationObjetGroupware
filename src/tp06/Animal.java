package tp06;

/**
 * Création et gestion des animaux
 */
public abstract class Animal {
	private String espèce;
	private int nb_pattes = 0;
	
	/**
	 * Constructeur de la classe Animal
	 * @param type nom de l’espèce
	 * @param pattes nombre de pattes
	 */
	public Animal(String type, int pattes) {
		espèce = type;
		nb_pattes = pattes;
	}
	
	/**
	 * Présentation des caractéristiques de l’animal
	 */
	public void présente() {
		System.out.println("je suis un représentant de l’espèce " + espèce + " et j’ai " + nb_pattes + " pattes");
	}
	
	public abstract void crie();
}
