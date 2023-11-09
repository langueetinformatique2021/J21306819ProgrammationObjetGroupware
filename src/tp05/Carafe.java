package tp05;

/**
 * Classe carafe
 */
public class Carafe {
	// attributs de classe privés
	private int contenu_, capacite_;
	
	/**
	 * Constructeur vide de la classe Carafe. Initialise le contenu et la capacite à 0. 
	 */
	public Carafe() {
		contenu_ = 0; capacite_ = 0;
	}
	
	/**
	 * Constructeur de la classe Carafe. Lorsqu’on la crée, On suppose qu’on ne peut que définir la capacité.
	 * Elle est supposée initialement vide.
	 * @param cap
	 */
	public Carafe(int cap) {
		contenu_ = 0; capacite_ = cap;
	};
	
	/**
	 * Accesseur en lecture de contenu
	 * @return contenu
	 */
	public int getContenu() {
		return contenu_;
	}
	
	/**
	 * Accesseur en lecture de contenu.
	 * @return
	 */
	public int getCapacite() {
		return capacite_;
	}
	
	/**
	 * Accesseur en écriture de la capacité
	 * @param cap int taille de la capacité qu’on veut redéfinir
	 */
	public void Capacite(int cap) {
		capacite_ = cap;
	}
	
	/**
	 * Accesseur en écriture du contenu. S’assure que le contenu ne peut dépasser la capacité
	 * @param cap int taille du contenu qu’on veut redéfinir
	 */
	public void Contenu(int cont) {
		if (cont + contenu_ > capacite_) contenu_ = capacite_;
		else contenu_ = cont;
	}
	
	/**
	 * Méthode remplissant la carafe.
	 */
	public void Remplir() {
		contenu_ = capacite_;
	}
	
	/**
	 * Méthode vidant la carafe.
	 */
	public void Vider() {
		contenu_ = 0;
	}
	
	/**
	 * Méthode transvasant le contenu de cette carafe dans une autre carafe. 
	 * @param carafe2
	 */
	public void Transvaser(Carafe carafe2) {
		int cap_carafe2 = carafe2.getCapacite(), cont_carafe2 = carafe2.getContenu();
		int dif_contenu_carafe2 = cap_carafe2 - cont_carafe2;
		int contenu_a_verser;
		if (dif_contenu_carafe2 < contenu_) contenu_a_verser = dif_contenu_carafe2;
		else contenu_a_verser = contenu_;
		carafe2.Contenu(contenu_a_verser + cont_carafe2);
		contenu_ = contenu_ - contenu_a_verser;
	}
	
}
