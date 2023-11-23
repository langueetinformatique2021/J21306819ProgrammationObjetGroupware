package tp06;

public class Végétal {
	private String espèce;
	
	public Végétal(String type) {
		espèce = type;
	}
	
	public void présente() {
		System.out.println("Je suis un représentant de l’espèce " + espèce);
	}
}
