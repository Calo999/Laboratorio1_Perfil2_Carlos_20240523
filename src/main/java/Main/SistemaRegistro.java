package Main;

import java.util.ArrayList;
import java.util.List;

import static Main.Main.scanner;

public class SistemaRegistro {

    private List<String> libros = new ArrayList<>();

    public void AgregarLibro(){
        System.out.println("Ingrese un nuevo libro");
        String nombreLibro = scanner.nextLine();
        libros.add(nombreLibro);
        System.out.println("Libro agregado" + nombreLibro);
    }

    public void MostrarLibros(){
        if(libros.isEmpty()){
            System.out.println("No hay libros");
        } else {
            System.out.println("--Libros registrados--");
            for (String libro : libros){
                System.out.println(libro);
            }
        }
    }

    public void BuscarLibros(){

    }

    public void MostrarRecienteAntiguo(){

    }

    public void Salir(){

    }
}
