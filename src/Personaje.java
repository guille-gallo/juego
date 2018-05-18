
public class Personaje {
	
	String nombre;
	int energia;
	
	public Personaje(String nombre, int energia) {
		super();
		this.nombre = nombre;
		this.energia = energia;
	}	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}	
	
	void pegar(Personaje x) {
		System.out.println("estoy pegando");
		System.out.println(x.nombre);
		x.energia --;
	}
}