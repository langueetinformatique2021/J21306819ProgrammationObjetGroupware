package tp06;

/**
 * Classe de création et de gestion de félins
 */
public class Félin extends Animal{
	// ajout d’attributs propres à la classe
	protected boolean domestique = false;
	
	/**
	 * Constructeur de la classe Félin
	 * @param type nom de l’espèce
	 */
	public Félin(String type) {
		super(type, 4);
	}
	
	/**
	 * Présentation des caractéristiques de l’animal dans la console
	 */
	public void présente() {
		super.présente();
		
		String etat = (domestique) ? "domestique": "sauvage";
		System.out.println("Je suis vraiment un animal " + etat);
	}
	
	/**
	 * Cri du félin
	 */
	public void crie() {
		System.out.println("Miaou");
	}
}
