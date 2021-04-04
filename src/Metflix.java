import java.util.ArrayList;
import java.util.List;

public class Metflix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();
    
    //Metodo que inicializa el catalogo con las peliculas/series que querramos
    public void inicializarCatalogo(){

        //Pelis: Titanic, Batman: El caballero de la noche 
        Pelicula titanic; //declara una variable que apuntara a una Pelicula
        titanic = new Pelicula(); //Estas ultimas 2 lineas: Pelicula titanic = new Pelicula();

        titanic.nombre = "Titanic";
        titanic.añoLanzamiento = 1997;
        titanic.duracion = 210; //3hs 30

        Actor actor = new Actor();
        actor.nombre = "Leo DiCaprio";

        Director james = new Director();
        james.nombre = "James Cameron";
        titanic.director = james;

        //Agrego a la lista de actores del objeto titanic
        titanic.actores.add(actor); //metodo Add -> agregar a una lista

        //Recien ahora estoy agregando a Titanic al catalogo
        this.peliculas.add(titanic);

        //Otra Peli
        Pelicula batman = new Pelicula();
        batman.nombre = "Batman: el caballero de la nohe";
        batman.añoLanzamiento = 2008;
        batman.duracion = 152;

        //No voy a declarar otra variable actor, voy a reusar
        //siempre primero antes de reusar
        // re instanciar
        actor = new Actor(); //Creo un nuevo actor, pero referenciado con la variable actor
        actor.nombre = "Christian Bale";

        batman.actores.add(actor);

        Director nolan = new Director();
        nolan.nombre = "Christopher Nolan";
        batman.director = nolan;


        this.peliculas.add(batman);

        //Mis peliculas

         Pelicula sleepers = new Pelicula(); //se hizo en un solo paso

         sleepers.nombre = "Sleepers";
         sleepers.añoLanzamiento = 1996;
         sleepers.duracion = 147;

         actor = new Actor();   //reuso la variable ya creada
         actor.nombre = "Robert De Niro";
         sleepers.actores.add(actor);

         Director barry = new Director();
         barry.nombre = "Barry Levison";
         sleepers.director = barry;

        
         this.peliculas.add(sleepers);

        //_____________________________________________________________

         Pelicula mammaMia = new Pelicula(); //se hizo en un solo paso

         mammaMia.nombre = "Mamma Mia";
         mammaMia.añoLanzamiento = 1999;
         mammaMia.duracion = 110;

         actor = new Actor();   //reuso la variable ya creada
         actor.nombre = "Meryl Streep";
         mammaMia.actores.add(actor);

         Director lloyd = new Director();
         lloyd.nombre = "Phyllida Lloyd";
         mammaMia.director = lloyd;

        
         this.peliculas.add(mammaMia);

         //____________________________________________________________

         Pelicula laPielQueHabito = new Pelicula(); //se hizo en un solo paso

         laPielQueHabito.nombre = "La piel que habito";
         laPielQueHabito.añoLanzamiento = 2011;
         laPielQueHabito.duracion = 125;

         actor = new Actor();   //reuso la variable ya creada
         actor.nombre = " Antonio Banderas ";
         laPielQueHabito.actores.add(actor);

         Director pedro = new Director();
         pedro.nombre = "Pedro Almodovar";
         laPielQueHabito.director = james;

         this.peliculas.add(laPielQueHabito);



        //How I met your mother. Serie

        Serie howIMetYM = new Serie();
        howIMetYM.nombre = "How I met your mother";
        howIMetYM.añoLanzamiento = 2005;
        
        actor = new Actor();
        actor.nombre = "Neil Patrick Harris";

        howIMetYM.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Cobie Smulders";

        howIMetYM.actores.add(actor);
        
        //T5:E11
        //creo la temporada
        Temporada temporada = new Temporada();
        temporada.numero = 5;
     
        //Creo el episodio
        Episodio episodio = new Episodio();
        episodio.nombre = "The last cigarrette";
        episodio.numero = 11;

        //vinculo temporada con episodio
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.nombre = "Definitions";
        episodio.numero = 1;

        temporada.episodios.add(episodio);

        //Agrego la temporada
        howIMetYM.temporadas.add(temporada);


        //T3
        //creo la temporada
        temporada = new Temporada();
        temporada.numero = 3;
     
        //Creo el episodio
        episodio = new Episodio();
        episodio.nombre = "Wait for it";
        episodio.numero = 1;

        //vinculo temporada con episodio
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.nombre = "Little Boys";
        episodio.numero = 4;

        temporada.episodios.add(episodio);

        //Agrego la temporada
        howIMetYM.temporadas.add(temporada);

        //Aca esta toda la serie con 2 temporadas y cada una con 2 episodios.
        this.series.add(howIMetYM);

        Serie bbt = new Serie();
        bbt.nombre = "The BigBang Theory";
        bbt.añoLanzamiento = 2007;
        
        actor = new Actor();
        actor.nombre = "Kaley Cuoco";

        bbt.actores.add(actor);

        
        //creo la temporada
        temporada = new Temporada();
        temporada.numero = 1;
     
        //Creo el episodio
        episodio = new Episodio();
        episodio.nombre = "Pilot";
        episodio.numero = 1;

        //vinculo temporada con episodio
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.nombre = "The Cooper-Hofstadter Polarizatio";

        temporada.episodios.add(episodio);

        //Agrego la temporada
        bbt.temporadas.add(temporada);

        this.series.add(bbt);

    }
    
    //Buscar Serie
    public Serie buscarSerie(String nombreABuscar){

        // series = | serie1 | serie2 | serie25 | serie40 |
        //vamos a usar el foreach: que sirve para recorrer listas
        //este ciclo, tiene una variable, que apunta en cada vuelta
        //a cada elemento de la lista
        //o sea la primer vez, va a apuntar a serie1, despues a serie2 despues
        //serie25 hasta que termina.
        for (Serie serie : this.series) {
            //pregunto si el nombre de la serie actual
            //que estoy recorriendo es la que necesito
            if (serie.nombre.equals(nombreABuscar))
                return serie; //devuelvo esta serie.
        }
        //si llego hasta aca, es porque no encontro la serie.
        return null;

    }

    //Buscar Pelicula
    public Pelicula buscarPelicula(String nombreABuscar){

        //vamos a usar el foreach: que sirve para recorrer listas
        //este ciclo, tiene una variable, que apunta en cada vuelta
        //a cada elemento de la lista
        
        for (Pelicula pelicula : this.peliculas) {
            //pregunto si el nombre de la pelicula actual
            //que estoy recorriendo es la que necesito
            if (pelicula.nombre.equals(nombreABuscar))
                return pelicula; //devuelvo esta pelicula
        }
        //si llego hasta aca, es porque no encontro la pelicula
        return null;

    }

    //buscar un director

    public Director buscarDirector(String nombreABuscar){
  
        //vamos a usar el foreach: que sirve para recorrer listas
        //este ciclo, tiene una variable, que apunta en cada vuelta
        //a cada elemento de la lista
        
        for (Pelicula pelicula : this.peliculas) {
            //pregunto si el nombre de la pelicula actual
            //que estoy recorriendo es la que necesito
            if (pelicula.nombre.equals(nombreABuscar))
                return pelicula.director; //devuelvo esta pelicula
        }
        //si llego hasta aca, es porque no encontro la pelicula
        return null;

    }
    //
}
    //como hago para que solo busque la pelicula y no la serie?
    //por que hay una letra M al lado de mis clases en el listado src?