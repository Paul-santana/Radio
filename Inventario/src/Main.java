import java.util.Scanner;

public class Main {
	static Scanner entrada= new Scanner(System.in);

	public static void main(String[] args) {
		String referencia;
		int cantidad;
		System.out.println("Favor ingresar referencia de productos:");
		referencia = entrada.nextLine();
		System.out.println("Favor ingresar cantidad");
		cantidad = entrada.nextInt();
	}

}
