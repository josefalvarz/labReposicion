/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labguirepo;

import java.util.Scanner;

public class LabGUIRepo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("1. Registrar Alumno");
            System.out.println("2. Búsqueda");
            System.out.println("3. Conteo");
            System.out.println("4. Salir");
             opcion = scanner.nextInt();

            scanner.nextLine();
            switch (opcion) {
                case 1:
                    registrarAlumno();
                    break;
                case 2:
                    busqueda();
                    break;
                case 3:
                    conteo();
                    break;
                case 4:
                    System.out.println("Salio del programa");
                    break;
                default:
                    System.out.println("Opción invalida.");
                    break;
            }
        } while (opcion != 0);

    }

    public static void registrarAlumno() {
        //El uso de return detiene la ejecución del método si una condición de validación falla
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese numero de cuenta: ");
        String numCuenta = leer.nextLine();
        if (numCuenta.length() != 8) {
            System.out.println("El número de cuenta debe tener 8 caracteres.");
            return;
        }

        System.out.println("Ingrese el código de la clase: ");
        String codigoClase = leer.nextLine();
        if (codigoClase.length() < 4 || codigoClase.length() > 5) {
            System.out.println("El código de la clase es invalido.");
            return;
        }

        System.out.println("Ingrese el año de matrícula: ");
        String matricula = leer.nextLine();
        if (matricula.length() != 4 || Integer.parseInt(matricula) < 2011 || Integer.parseInt(matricula) > 2024) {
            System.out.println("El año de matrícula es invalido");
            return;
        }

        System.out.println("Ingrese el numero de seccion: ");
        String numSeccion = leer.nextLine();
        if (numSeccion.length() != 3) {
            System.out.println("El número de sección debe tener 3 caracteres.");
            return;
        }

        System.out.println("Alumno registrado exsitosamente.");

    }

    public static void busqueda() {

    }

    public static void conteo() {

    }

}
