
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		final double EMPLEADOS = 50;

		int sector = 0;
		double restanEmpleados = 0;

		double totalDeEmpleadosSector1 = 0;
		double totalDeEmpleadosSector2 = 0;
		double totalDeEmpleadosSector3 = 0;

		double cantidadDeCasos1 = 0;
		double cantidadDeCasos2 = 0;
		double cantidadDeCasos3 = 0;

		double porcentajeDeCasos1 = 0;
		double porcentajeDeCasos2 = 0;
		double porcentajeDeCasos3 = 0;

		double casosGenerales = 0;

		double temperatura = 0;

		DecimalFormat format = new DecimalFormat("0.#");

		System.out.println(
				"Ingrese cantidad de empleados sector 1 recuerde que no puede ser mayor a " + EMPLEADOS + " :");
		totalDeEmpleadosSector1 = scan.nextInt();
		restanEmpleados = (EMPLEADOS - totalDeEmpleadosSector1);

		System.out.println(
				"Ingrese cantidad de empleados sector 2 recuerde quen no puede ser mayor a " + restanEmpleados + " :");
		totalDeEmpleadosSector2 = scan.nextInt();
		restanEmpleados = (restanEmpleados - totalDeEmpleadosSector2);

		System.out.println(
				"Ingrese cantidad de empleados sector 3 recuerde quen no puede ser mayor a " + restanEmpleados + " :");
		totalDeEmpleadosSector3 = scan.nextInt();
		restanEmpleados = (restanEmpleados - totalDeEmpleadosSector3);

		for (int i = 1; i <= 3; i++) {

			System.out.println("\nDe que sector es?: ");

			sector = scan.nextInt();
			scan.nextLine();

			switch (sector) {
			case 1: {

				System.out.println(totalDeEmpleadosSector1);

				for (int j = 0; j <= totalDeEmpleadosSector1; j++) {

					temperatura = ((Math.random() * (40 - 35)) + 35);

					System.out.println("La temperatura es de: " + format.format(temperatura));

					if (temperatura >= 37.5) {

						cantidadDeCasos1 = (cantidadDeCasos1 + 1);

					}

				}
				System.out.println("\nCasos sospechosos en sector 1: " + format.format(cantidadDeCasos1));

			}
				break;
			case 2: {

				System.out.println(totalDeEmpleadosSector2);

				for (int j = 0; j <= totalDeEmpleadosSector2; j++) {

					temperatura = ((Math.random() * (40 - 35)) + 35);

					System.out.println("La temperatura es de: " + format.format(temperatura));

					if (temperatura >= 37.5) {

						cantidadDeCasos2 = (cantidadDeCasos2 + 1);

					}

				}
				System.out.println("\nCasos sos en sector 2: " + format.format(cantidadDeCasos2));
			}

				break;
			case 3: {

				System.out.println(totalDeEmpleadosSector3);

				for (int j = 0; j <= totalDeEmpleadosSector3; j++) {

					temperatura = ((Math.random() * (40 - 35)) + 35);

					System.out.println("La temperatura es de: " + format.format(temperatura));

					if (temperatura >= 37.5) {

						cantidadDeCasos3 = (cantidadDeCasos3 + 1);

					}
				}
				System.out.println("\nCasos positivos en sector 3: " + format.format(cantidadDeCasos3));
			}
				break;
			}
		}

		casosGenerales = (cantidadDeCasos1 + cantidadDeCasos2 + cantidadDeCasos3);
		porcentajeDeCasos1 = (double) ((cantidadDeCasos1 / totalDeEmpleadosSector1) * 100);
		porcentajeDeCasos2 = (double) ((cantidadDeCasos2 / totalDeEmpleadosSector2) * 100);
		porcentajeDeCasos3 = (double) ((cantidadDeCasos3 / totalDeEmpleadosSector3) * 100);

		System.out.println("\nLa cantidad de casos generales de COVID son: " + casosGenerales);
		System.out.println(
				"\nEl sector 1 tiene: " + format.format(porcentajeDeCasos1) + " % de empleados con sospecha de COVID");
		System.out.println(
				"\nEl sector 2 tiene: " + format.format(porcentajeDeCasos2) + " % de empleados con sospecha de COVID");
		System.out.println(
				"\nEl sector 3 tiene: " + format.format(porcentajeDeCasos3) + " % de empleados con sospecha de COVID");

		System.out.println("\nLa fabrica tiene " + format.format((casosGenerales / EMPLEADOS) * 100)
				+ "% empleados sospechosos de " + EMPLEADOS);
	}

}
