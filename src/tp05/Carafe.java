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
		this.contenu_ = 0; this.capacite_ = 0;
	}
	
	/**
	 * Constructeur de la classe Carafe. Lorsqu’on la crée, On suppose qu’on ne peut que définir la capacité.
	 * Elle est supposée initialement vide.
	 * @param cap
	 */
	public Carafe(int cap) {
		this.contenu_ = 0; this.capacite_ = cap;
	};
	
	/**
	 * Accesseur en lecture de contenu
	 * @return contenu
	 */
	public int getContenu() {
		return this.contenu_;
	}
	
	/**
	 * Accesseur en lecture de contenu.
	 * @return capacite
	 */
	public int getCapacite() {
		return this.capacite_;
	}
	
	/**
	 * Accesseur en écriture de la capacité
	 * @param cap int taille de la capacité qu’on veut redéfinir
	 */
	private void Capacite(int cap) {
		this.capacite_ = cap;
	}
	
	/**
	 * Accesseur en écriture du contenu. S’assure que le contenu ne peut dépasser la capacité
	 * @param cap int taille du contenu qu’on veut redéfinir
	 */
	private void Contenu(int cont) {
		if (cont + this.contenu_ > this.capacite_) this.contenu_ = this.capacite_;
		else this.contenu_ = cont;
	}
	
	/**
	 * Méthode remplissant la carafe.
	 */
	public void Remplir() {
		this.contenu_ = this.capacite_;
	}
	
	/**
	 * Méthode vidant la carafe.
	 */
	public void Vider() {
		this.contenu_ = 0;
	}
	
	/**
	 * Méthode transvasant le contenu de cette carafe dans une autre carafe dans la mesure du possible
	 * (s’il y a plus d’eau dans cette carafe que ne peut en récupérer la seconde carafe, alors ). 
	 * @param carafe2
	 */
	public void Transvaser(Carafe carafe2) {
		int cap_carafe2 = carafe2.getCapacite(), cont_carafe2 = carafe2.getContenu();
		int dif_contenu_carafe2 = cap_carafe2 - cont_carafe2;
		int contenu_a_verser;
		
		if (dif_contenu_carafe2 < this.contenu_) contenu_a_verser = dif_contenu_carafe2;
		else contenu_a_verser = this.contenu_;
		
		carafe2.Contenu(contenu_a_verser + cont_carafe2);
		this.contenu_ = this.contenu_ - contenu_a_verser;
	}
}