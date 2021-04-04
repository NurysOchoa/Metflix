public class App {
    public static void main(String[] args) throws Exception {
        // A partir de Metflix, buscar la temporada 5 episodio 1 de la serie
        // How I met your mother y
        // reproducir el episodio.

        Metflix miMetflix = new Metflix();

        System.out.println("Inicializando catalogo de Metflix");

        miMetflix.inicializarCatalogo();// Estoy llamando al metodo que crea las pelis y series.

        Serie serieBuscada = miMetflix.buscarSerie("How I met your mother");

        Temporada temporada = serieBuscada.buscarTemporada(5);

        Episodio episodio = temporada.buscarEpisodio(1);

        episodio.reproducir();

        // ____________________________________________________________________________

        Pelicula peliculaBuscada = miMetflix.buscarPelicula("La piel que habito");
        System.out.println(peliculaBuscada.nombre);
        System.out.println(peliculaBuscada.añoLanzamiento);

        Director directorBuscado = miMetflix.buscarDirector("Sleepers");

        System.out.println("El director de la pelicula Sleepers es " + directorBuscado.nombre);

    }
}
