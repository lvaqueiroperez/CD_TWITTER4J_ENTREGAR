package twitter4jproyect;

import java.util.List;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;
import java.util.*;

/**
 * Clase donde se implementa todo el código y métodos del programa (en cada
 * método se han configurado los "OAuth Credentials" con un builder)
 *
 * @author luis-
 */
public class Methods {

    ////////////////////////////////////////////////////////////////////////
    // The factory instance is re-useable and thread safe. !!!!
    //No vamos a poder tener más de un objeto twitter: se usa un
    //factory para crear un objeto y acceder con él indirectamente a una clase que creará
    //y nos devolverá un objeto singleton (que hemos llamado "twitter" y es de
    //tipo twitter)
    /**
     * Método para escribir un tweet.
     *
     * @throws TwitterException
     */
    public static void postTweet() throws TwitterException {
        Scanner read = new Scanner(System.in);

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("YuBc0S4HnopaKfe0ny4o4tefa")
                .setOAuthConsumerSecret("XPDrzHQ0ZeP3lSN1K44WkZ8LedWnZh0LtIewD8k0Oe6h7fKgM8")
                .setOAuthAccessToken("1108644141657935872-2DIWZ5zAW2RlbPyh4p5KZzu5uRBgwY")
                .setOAuthAccessTokenSecret("GGsFaIZkBDvUjj7WWLmGoClHqrryQ8s60U5JBd4C2uUHG");

        /**
         * Creación de objeto Singleton tipo "Twitter" a través de un Factory.
         */
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();

        //// POST TWEET
        /**
         * Creamos una variable String con el tweet que queremos publicar.
         */
        System.out.println("Introduce tu nuevo estado");
        String latestStatus = read.nextLine();
        /**
         * Creamos variable tipo "Status" y le asociamos nuestro tweet.
         */
        Status newStatus = twitter.updateStatus(latestStatus);

        /**
         * Mostramos por pantalla un mensaje en caso de que el tweet se haya
         * publicado correctamente.
         */
        System.out.println("Successfully updated the status to [" + newStatus.getText() + "].");
    }
////////////////////////////////////////////////////////////////////////////////////////////////
//GET USER'S TIMELINE
    //UNA VEZ CREADO NUESTRO SINGLETON "Twitter", CREAMOS UN ARRAYLIST
    //DONDE SE ALMACENARÁN LOS DATOS DE NUESTRA TIMELINE USANDO NUESTRO SINGLETON

    /**
     * Método para obtener la "TimeLine" de nuestro user
     *
     * @throws TwitterException
     */
    public static void timeLine() throws TwitterException {

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("YuBc0S4HnopaKfe0ny4o4tefa")
                .setOAuthConsumerSecret("XPDrzHQ0ZeP3lSN1K44WkZ8LedWnZh0LtIewD8k0Oe6h7fKgM8")
                .setOAuthAccessToken("1108644141657935872-2DIWZ5zAW2RlbPyh4p5KZzu5uRBgwY")
                .setOAuthAccessTokenSecret("GGsFaIZkBDvUjj7WWLmGoClHqrryQ8s60U5JBd4C2uUHG");

        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();

        /**
         * ArrayList donde se almacenarán todos los datos de nuestra TimeLine
         * que se mostrarán por pantalla.
         */
        List<Status> statuses = twitter.getHomeTimeline();
        //MOSTRAMOS LA TIMELINE RECORRIENDO EL ARRAYLIST COMO SIEMRPE Y ACCEDIENDO
        //A SUS DATOS, TODO CON UN FOREACH(SE PODRÍA RECORRER DE OTRAS MANERAS)

        System.out.println("Showing home timeline.");
        /**
         * For donde se recorre el ArrayList y se va mostranto todo por
         * pantalla.
         */
        for (Status status : statuses) {
            System.out.println(status.getUser().getName() + ":"
                    + status.getText());
        }
    }
//////////////////////////////////////////////////////////////////////////////////////
//SEARCH FOR TWEETS: (ANY)
    //CREAMOS UNA VARIABLE "Query" A LA QUE ASOCIAREMOS UN OBJETO "Query"
    //CON EL STRING QUE QUEREMOS BUSCAR EN TWITTER

    /**
     * Método para buscar tweets que contengan el String introducido.
     *
     * @throws TwitterException
     */
    public static void searchAny() throws TwitterException {

        Scanner read2 = new Scanner(System.in);

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("YuBc0S4HnopaKfe0ny4o4tefa")
                .setOAuthConsumerSecret("XPDrzHQ0ZeP3lSN1K44WkZ8LedWnZh0LtIewD8k0Oe6h7fKgM8")
                .setOAuthAccessToken("1108644141657935872-2DIWZ5zAW2RlbPyh4p5KZzu5uRBgwY")
                .setOAuthAccessTokenSecret("GGsFaIZkBDvUjj7WWLmGoClHqrryQ8s60U5JBd4C2uUHG");

        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        /**
         * Instanciamos objeto de tipo "Query" con el String que queremos
         * buscar.
         */
        System.out.println("Introduce un texto a buscar:");
        String texto = read2.nextLine();
        Query query = new Query(texto);
        //CREAMOS UNA VARIABLE "QueryResult" A LA QUE ASOCIAREMOS LOS RESULTÁDOS DE LA BÚSQUEDA:
        /**
         * Creamos variable tipo "QueryResult" a la que asociaremos los
         * resultados de la búsqueda.
         */
        QueryResult result = twitter.search(query);
        //RECORREMOS LOS RESULTADOS DE LA VARIABLE "QueryResult" Y LOS ENSEÑAMOS COMO SI 
        //FUERA UN ARRAYLIST
        /**
         * Mostramos los resultados por pantalla recorriendo la variable
         * "QueryResult".
         */
        for (Status status
                : result.getTweets()) {
            System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
        }

    }

}
