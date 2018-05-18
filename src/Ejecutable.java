

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personaje pepe = new Personaje("Pepe", 100);
		Personaje pipo = new Personaje("Pipo", 90);
		
		
		pepe.pegar(pipo);
		System.out.println(pipo.getEnergia());
		
		pipo.pegar(pepe);
		System.out.println(pepe.getEnergia());
	}

}
