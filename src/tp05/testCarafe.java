package tp05;

public class testCarafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carafe carafe1 = new Carafe(7);
		Carafe carafe2 = new Carafe(4);
		
		carafe2.Remplir();
		carafe2.Transvaser(carafe1);
		carafe2.Remplir();
		carafe2.Transvaser(carafe1);
		carafe1.Vider();
		carafe2.Transvaser(carafe1);
		carafe2.Remplir();
		carafe2.Transvaser(carafe1);
		System.out.println("La carafe 1 contient " + carafe1.getContenu() + "L.");
	}

}
