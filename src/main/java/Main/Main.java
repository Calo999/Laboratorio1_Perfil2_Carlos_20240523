package Main;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int select = 0;

    public static void main(String[] args) {
        SistemaRegistro demo = new SistemaRegistro();

        System.out.println("Bienvenido a la Biblioteca DonBosco");
        System.out.println("Seleccione con su respectivo numero la accion que quiere realizar");


        while(select != 0){
            try {
                System.out.println("1 - Agregar Libros");
                System.out.println("2 - Registro de Libros");
                System.out.println("3 - Buscar libro con ISBN");
                System.out.println("4 - Mostrar libros por orden de llegada");
                System.out.println("5 - Salir del Sistema");

                select = Integer.parseInt(scanner.nextLine());

                switch (select){
                    case 1:
                        System.out.println("<<--Agregar libro nuevo-->>");
                        demo.AgregarLibro();
                        break;
                    case 2:
                        System.out.println("<<--Registro de Libros-->>");
                        demo.MostrarLibros();
                        break;
                    case 3:
                        System.out.println("<<--Buscar libros mediante ISBN-->>");
                        demo.BuscarLibros();
                        break;
                    case 4:
                        System.out.println("<<--Ordenar Libros por orden de ingreso");
                        demo.MostrarRecienteAntiguo();
                        break;
                    case 5:
                        System.out.println("<<--Saliendo...-->>");
                        demo.Salir();
                        break;
                }
            }catch(Exception e){
                System.out.println("Error");
            }
        }
    }
}
