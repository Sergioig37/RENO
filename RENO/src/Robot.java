
public class Robot {
	
	private String nombre;
	private int puntosDeVida;
	private int ataque;
	private int defensa;
	
	
	public Robot(String nombre) {
		
		this.nombre = nombre;
		this.puntosDeVida = 100;
		this.ataque = (int)(Math.random()*21);
		this.defensa = (int)(Math.random()*101);
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntosDeVida() {
		return puntosDeVida;
	}
	public void setPuntosDeVida(int puntosDeVida) {
		this.puntosDeVida = puntosDeVida;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	@Override
	public String toString() {
		return "Robot [nombre=" + nombre + ", puntosDeVida=" + puntosDeVida + ", ataque=" + ataque + ", defensa="
				+ defensa + "]";
	}
	
	
	
	
	
}
