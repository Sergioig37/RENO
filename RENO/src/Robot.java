
public class Robot {
	
	private String nombre;
	private int puntosDeVida;
	private int ataque;
	private int defensa;
	
	
	/*
	 * solo pedimos el nombre a la hora de construit el robot porque 
	 * los puntos de vida son 100 por defecto y el ataque y la defensa
	 * se calculan de forma aleatoria
	 */
	public Robot(String nombre) {
		
		this.nombre = nombre;
		this.puntosDeVida = 100;
		this.ataque = (int)(Math.random()*21);
		this.defensa = (int)(Math.random()*101);
	}
	
	/*
	 * este método servirá para que los dos robots peleen.
	 */
	public void Pelea(Robot robot) {
			
		
			/*
			 * para decidir quien ataca primero lo haremos con un númmero aleatorio,
			 * en juegso tipo Pokemon el que primero ataca suele ser el que más puntos
			 * de velocidad tenga, como aquí no tenemos el atributo velocidad el que ataque primero será 
			 * el que saque el número más grande. En caso de empate se vuelve a repetir.
			 */
			System.out.println("¡¡¡Comienza el combate!!!");
			int turnoRobot1 = (int)(Math.random()*6);
			int turnoRobot2 = (int)(Math.random()*6);
			
			/*
			 * estas dos variables sirven para calcular la potencia de ataque 
			 * de los robots
			 */
			int numeroAtaqueRobot1;
			int numeroAtaqueRobot2;
		
			if(turnoRobot1>turnoRobot2) {
					
					
					while(this.puntosDeVida>0&&robot.puntosDeVida>0) {
							System.out.println("Turno de " +this.nombre);
							numeroAtaqueRobot1 = (int)(Math.random()*101);
							
							System.out.println("Saca " +numeroAtaqueRobot1 +" de ataque");
							
							if(numeroAtaqueRobot1>robot.defensa) {
								
								System.out.println("Ataque realizado con éxito");
								System.out.println("-"+this.ataque+" puntos de vida");
								robot.puntosDeVida = robot.puntosDeVida - this.ataque;
							}
							else {
								System.out.println("Ataque defendido");
							}
							
							System.out.println("Turno de " +robot.nombre);
							numeroAtaqueRobot2 = (int)(Math.random()*101);
							System.out.println("Saca " +numeroAtaqueRobot2 +" de ataque");
							
							if(numeroAtaqueRobot2>this.defensa) {
								
								System.out.println("Ataque realizado con éxito!");
								System.out.println("-" +robot.ataque +" puntos de vida");
								this.puntosDeVida = this.puntosDeVida - robot.ataque;
							}
							else {
								System.out.println("Ataque defendido");
							}
							
						
					}
					if(this.puntosDeVida<=0) {
						this.puntosDeVida=0;
						System.out.println(this.nombre +" pierde...");
						System.out.println(robot.nombre+" ES EL GANADOR!!!");
					}
					else if(robot.puntosDeVida<=0) {
						robot.puntosDeVida=0;
						System.out.println(robot.nombre +" pierde...");
						System.out.println(this.nombre+" ES EL GANADOR!!!");
					}
			}
			else if (turnoRobot1<turnoRobot2) {
				
				while(this.puntosDeVida>0 && robot.puntosDeVida>0) {
					System.out.println("Turno de " +robot.nombre);
					numeroAtaqueRobot2 = (int)(Math.random()*101);
					
					System.out.println("Saca " +numeroAtaqueRobot2 +" de ataque");
					
					if(numeroAtaqueRobot2>this.defensa) {
						
						System.out.println("Ataque realizado con éxito");
						System.out.println("-"+robot.ataque+" puntos de vida");
						this.puntosDeVida = this.puntosDeVida - robot.ataque;
					}
					else {
						System.out.println("Ataque defendido");
					}
					
					System.out.println("Turno de " +robot.nombre);
					numeroAtaqueRobot1= (int)(Math.random()*101);
					System.out.println("Saca " +numeroAtaqueRobot1 +" de ataque");
					
					if(numeroAtaqueRobot1>this.defensa) {
						
						System.out.println("Ataque realizado con éxito!");
						System.out.println("-" +this.ataque +" puntos de vida");
						robot.puntosDeVida = robot.puntosDeVida - this.ataque;
					}
					else {
						System.out.println("Ataque defendido");
					}
					
				
			}
			if(this.puntosDeVida<=0) {
				this.puntosDeVida=0;
				System.out.println(this.nombre +" pierde...");
				System.out.println(robot.nombre+" ES EL GANADOR!!!");
			}
			else if(robot.puntosDeVida<=0) {
				robot.puntosDeVida=0;
				System.out.println(robot.nombre +" pierde...");
				System.out.println(this.nombre+" ES EL GANADOR!!!");
			}
			}
			
			else if(turnoRobot1==turnoRobot2) {
				
				while(turnoRobot1==turnoRobot2) {
					turnoRobot1 = (int)(Math.random()*6);
					turnoRobot2 = (int)(Math.random()*6);
				}
				while(this.puntosDeVida>0&&robot.puntosDeVida>0) {
					System.out.println("Turno de " +this.nombre);
					numeroAtaqueRobot1 = (int)(Math.random()*101);
					
					System.out.println("Saca " +numeroAtaqueRobot1 +" de ataque");
					
					if(numeroAtaqueRobot1>robot.defensa) {
						
						System.out.println("Ataque realizado con éxito");
						System.out.println("-"+this.ataque+" puntos de vida");
						robot.puntosDeVida = robot.puntosDeVida - this.ataque;
					}
					else {
						System.out.println("Ataque defendido");
					}
					
					System.out.println("Turno de " +robot.nombre);
					numeroAtaqueRobot2 = (int)(Math.random()*101);
					System.out.println("Saca " +numeroAtaqueRobot2 +" de ataque");
					
					if(numeroAtaqueRobot2>this.defensa) {
						
						System.out.println("Ataque realizado con éxito!");
						System.out.println("-" +robot.ataque +" puntos de vida");
						this.puntosDeVida = this.puntosDeVida - robot.ataque;
					}
					else {
						System.out.println("Ataque defendido");
					}
					
				
			}
			if(this.puntosDeVida<=0) {
				this.puntosDeVida=0;
				System.out.println(this.nombre +" pierde...");
				System.out.println(robot.nombre+" ES EL GANADOR!!!");
			}
			else if(robot.puntosDeVida<=0) {
				robot.puntosDeVida=0;
				System.out.println(robot.nombre +" pierde...");
				System.out.println(this.nombre+" ES EL GANADOR!!!");
			}
	}
	else if (turnoRobot1<turnoRobot2) {
		
		while(this.puntosDeVida>0&&robot.puntosDeVida>0) {
			System.out.println("Turno de " +robot.nombre);
			numeroAtaqueRobot2 = (int)(Math.random()*101);
			
			System.out.println("Saca " +numeroAtaqueRobot2 +" de ataque");
			
			if(numeroAtaqueRobot2>this.defensa) {
				
				System.out.println("Ataque realizado con éxito");
				System.out.println("-"+robot.ataque+" puntos de vida");
				this.puntosDeVida = this.puntosDeVida - robot.ataque;
			}
			else {
				System.out.println("Ataque defendido");
			}
			
			System.out.println("Turno de " +robot.nombre);
			numeroAtaqueRobot1= (int)(Math.random()*101);
			System.out.println("Saca " +numeroAtaqueRobot1 +" de ataque");
			
			if(numeroAtaqueRobot1>this.defensa) {
				
				System.out.println("Ataque realizado con éxito!");
				System.out.println("-" +this.ataque +" puntos de vida");
				robot.puntosDeVida = robot.puntosDeVida - this.ataque;
			}
			else {
				System.out.println("Ataque defendido");
			}
			
		
		}
		if(this.puntosDeVida<=0) {
			this.puntosDeVida=0;
			System.out.println(this.nombre +" pierde...");
			System.out.println(robot.nombre+" ES EL GANADOR!!!");
		}
		else if(robot.puntosDeVida<=0) {
			robot.puntosDeVida=0;
			System.out.println(robot.nombre +" pierde...");
			System.out.println(this.nombre+" ES EL GANADOR!!!");
		}
		}
				
				
			
			
		
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
