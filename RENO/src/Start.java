
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot RC = new Robot("Pepito");
		Robot RX = new Robot("Enrique");
		
		System.out.println(RC);
		System.out.println(RX);
		RC.Pelea(RX);
		System.out.println(RC);
		System.out.println(RX);
		
		
	}

}
