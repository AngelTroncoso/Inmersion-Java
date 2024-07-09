import modelo.Pelicula;
import modelo.Serie;

public class Main {
    public static void main(String[] args) {
    Principal principal = new Principal();
    principal.muestraElMenu();
    Pelicula matrix = new Pelicula();
    matrix.setNombre("Matrix");
    matrix.setTiempoDeDuracionEnMinutos(120);
    matrix.setFechaDeLanzamiento(1999);

    Pelicula encanto = new Pelicula();
    encanto.setNombre("Encanto");
    encanto.setTiempoDeDuracionEnMinutos(120);
    encanto.setFechaDeLanzamiento(2022);
    encanto.muestraFichaTecnica();
    matrix.muestraFichaTecnica();

    Serie friends = new Serie();
    friends.setNombre("Friend");
    friends.setFechaDeLanzamiento(1996);
    friends.setDuracionEnMinutosPorEpisodios(30);
    friends.setTemporadas(10);
    friends.setEpisodioPorTemporada(22);
    friends.muestraFichaTecnica();

    }
}

