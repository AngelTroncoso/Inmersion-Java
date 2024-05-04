import modelo.Pelicula;

import java.util.Scanner;

public class Principal {
    public void muestraElMenu(){

        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){

            String menu = """
                    Bienvenido(a) a Screenmatch
                    1)Registrar nueva pelicula
                    2)Registrar nueva serie
                    9)Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("ingrese el nombre de la pelicula");
                    String nombre = teclado.nextLine();
                    System.out.println("ingrese el año de lanzamiento la pelicula");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("ingrese la duracion en minutos de la pelicula");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();

                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");



            }
        }
    }
}
