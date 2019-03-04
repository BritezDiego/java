import java.util.Scanner;
public class calculadoraimc{
public static void main(String[] a){
	// delclaracion de variables
	String nombre;
	int edad;
	float peso;
	float estatura;
	float imc;
	char genero;
	
	// Asignacion de valores
	Scanner scan = new Scanner(System.in);
	System.out.println("Nombre:");
	nombre = scan.nextLine();
	
	System.out.println("Edad:");
	edad = scan.nextInt();
	
	System.out.println("Ingrese su peso:");
	peso = scan.nextFloat();
	
	System.out.println("Ingrese su estatura:");
	estatura = scan.nextFloat();
	
	System.out.println("M / F:");
	genero = scan.next().charAt(0);
	
	// Calculo de IMC
	imc = peso / (estatura * estatura);
	System.out.println("Indice de masa corporal:" + imc);
	
	// Salida a pantalla 
	if (imc < 18.5){
		System.out.println("BAJO DE PESO");
	}
	else if(imc >= 18.5 && imc <= 24.9){
		System.out.println("PESO NORMAL");		
	}
	else if(imc >= 25 && imc <= 30){
		System.out.println("SOBREPESO");		
	}
	else if(imc >= 31 && imc <= 34.9){
		System.out.println("OBESIDAD GRADO 1");		
	}
	else if(imc >= 35 && imc <= 39.9){
		System.out.println("OBESIDAD GRADO 2");		
	}
	else if (imc >= 40) {
	 System.out.println("OBESIDAD GRADO 3");
	}
	
}

}