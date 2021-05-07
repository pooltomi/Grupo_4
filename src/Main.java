
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

		System.out.println("Total Empleados Fabrica " + format.format(EMPLEADOS));

		System.out.println("Ingrese cantidad de empleados sector 1 : "); // recuerde que no puede ser mayor a "
		// + format.format(EMPLEADOS) + " :");
		totalDeEmpleadosSector1 = scan.nextInt();
		scan.nextLine();
		if (totalDeEmpleadosSector1 <= EMPLEADOS) {

			restanEmpleados = (EMPLEADOS - totalDeEmpleadosSector1);

			if ((restanEmpleados != 0)) {

				if ((restanEmpleados != 0)) {
					System.out.println("Ingrese cantidad de empleados sector 2  : "); // recuerde que no puede ser mayor
																						// a "
					// + format.format(restanEmpleados) + " :");
					totalDeEmpleadosSector2 = scan.nextInt();

					if ((totalDeEmpleadosSector2 <= restanEmpleados)) {

						restanEmpleados = (restanEmpleados - totalDeEmpleadosSector2);

						if ((restanEmpleados != 0)) {

							System.out.println("Ingrese cantidad de empleados sector 3 : "); // recuerde que no puede
																								// ser
																								// mayor
																								// a "
							// + format.format(restanEmpleados) + " :");
							totalDeEmpleadosSector3 = scan.nextInt();
							if ((restanEmpleados != 0) && totalDeEmpleadosSector3 <= restanEmpleados) {

								restanEmpleados = (restanEmpleados - totalDeEmpleadosSector3);
							} else {
								System.out.println("Se supero la cantidad de empleados en el sector ");
							}

						} else {
							System.out.println("Se supero la cantidad de empleados en el sector ");
						}

					}
				}
			} else {
				System.out.println("Se supero la cantidad de empleados en el sector ");
			}
		}

		if (restanEmpleados <= 50) {

			for (int i = 1; i <= 3; i++) {

				System.out.println("\nIndique su sector: ");

				sector = scan.nextInt();
				scan.nextLine();

				switch (sector) {
				case 1: {

					System.out
							.println("Cantidad de empleados en el sector : " + format.format(totalDeEmpleadosSector1));

					if (totalDeEmpleadosSector1 <= EMPLEADOS) {
						for (int j = 1; j <= totalDeEmpleadosSector1; j++) {

							temperatura = ((Math.random() * (40 - 35)) + 35);

							System.out.println("La temperatura es de: " + format.format(temperatura));

							if (temperatura >= 37.5) {

								cantidadDeCasos1 = (cantidadDeCasos1 + 1);

							}
						}
					}

					System.out.println("\nCasos sospechosos en sector 1: " + format.format(cantidadDeCasos1));

				}
					break;
				case 2: {

					System.out
							.println("Cantidad de empleados en el sector : " + format.format(totalDeEmpleadosSector2));

					if (totalDeEmpleadosSector2 <= EMPLEADOS) {
						for (int j = 1; j <= totalDeEmpleadosSector2; j++) {

							temperatura = ((Math.random() * (40 - 35)) + 35);

							System.out.println("La temperatura es de: " + format.format(temperatura));

							if (temperatura >= 37.5) {

								cantidadDeCasos2 = (cantidadDeCasos2 + 1);

							}
						}
					}

					System.out.println("\nCasos sospechosos en sector 2: " + format.format(cantidadDeCasos2));
				}

					break;
				case 3: {

					System.out
							.println("Cantidad de empleados en el sector : " + format.format(totalDeEmpleadosSector3));

					if (totalDeEmpleadosSector3 <= EMPLEADOS) {
						for (int j = 1; j <= totalDeEmpleadosSector3; j++) {

							temperatura = ((Math.random() * (40 - 35)) + 35);

							System.out.println("La temperatura es de: " + format.format(temperatura));

							if (temperatura >= 37.5) {

								cantidadDeCasos3 = (cantidadDeCasos3 + 1);

							}
						}
					}

					System.out.println("\nCasos sospechosos en sector 3: " + format.format(cantidadDeCasos3));
				}
					break;
				}
			}

			casosGenerales = (cantidadDeCasos1 + cantidadDeCasos2 + cantidadDeCasos3);
			if (totalDeEmpleadosSector1 > 0) {
				porcentajeDeCasos1 = (double) ((cantidadDeCasos1 / totalDeEmpleadosSector1) * 100);
			}
			if (totalDeEmpleadosSector2 > 0) {
				porcentajeDeCasos2 = (double) ((cantidadDeCasos2 / totalDeEmpleadosSector2) * 100);
			}
			if (totalDeEmpleadosSector3 > 0) {
				porcentajeDeCasos3 = (double) ((cantidadDeCasos3 / totalDeEmpleadosSector3) * 100);
			}

			System.out.println("\nLa cantidad de casos generales de COVID son: " + format.format(casosGenerales));
			System.out.println("\nEl sector 1 tiene: " + format.format(porcentajeDeCasos1)
					+ " % de empleados con sospecha de COVID");
			System.out.println("\nEl sector 2 tiene: " + format.format(porcentajeDeCasos2)
					+ " % de empleados con sospecha de COVID");
			System.out.println("\nEl sector 3 tiene: " + format.format(porcentajeDeCasos3)
					+ " % de empleados con sospecha de COVID");

			System.out.println("\nLa fabrica tiene " + format.format((casosGenerales / EMPLEADOS) * 100)
					+ " % empleados sospechosos de " + format.format(EMPLEADOS));
		}
	}

}