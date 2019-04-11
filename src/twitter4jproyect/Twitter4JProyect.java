package twitter4jproyect;

import twitter4j.TwitterException;
//USE ONLY WHEN THE WHOLE PROGRAM IS IN THE MAIN CLASS !!!
//import java.util.List;
//import twitter4j.DirectMessage;
//import twitter4j.Query;
//import twitter4j.QueryResult;
//import twitter4j.Status;
//import twitter4j.Twitter;
//import twitter4j.TwitterException;
//import twitter4j.TwitterFactory;
//import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author luis-
 */
public class Twitter4JProyect {

    /**
     * Main class donde se accede a los métodos static de la clase "Methods"
     * También se puede implementar en esta clase todo el programa
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TwitterException {

        Methods.postTweet();
        Methods.timeLine();
        Methods.searchAny();

////        
////        
//////////////////////////PONIENDO TODO EN EL MAIN////////////////////////////////    
//////////////////////////////////////////////////////////////////////////////////        
//        /**
//         * Builder usado para configurar los "OAuth Credentials".
//         *
//         */
//        ConfigurationBuilder cb = new ConfigurationBuilder();
//        cb.setDebugEnabled(true)
//                .setOAuthConsumerKey("X0Y5ZeFTTxH923EHpSmVauMpC")
//                .setOAuthConsumerSecret("s95FnuX4lo4UqNm0jhH2d4viLc2JqkZxmQ5dkyblbniDCKq2xs")
//                .setOAuthAccessToken("1108644141657935872-ox5NvyRVAyQsx1wOLDtUUHdrvdmSZF")
//                .setOAuthAccessTokenSecret("LkbxIXLtQDXIRO1KVePcZIMjgwm2lcjYZd7H7sp1WtWyK");
//        ////////////////////////////////////////////////////////////////////////
//        // The factory instance is re-useable and thread safe. !!!!
//        //No vamos a poder tener más de un objeto twitter: se usa un
//        //factory para crear un objeto y acceder con él indirectamente a una clase que creará
//        //y nos devolverá un objeto singleton (que hemos llamado "twitter" y es de
//        //tipo twitter)
//        /**
//         * Creación de objeto Singleton tipo "Twitter" a través de un Factory.
//         */
//        TwitterFactory tf = new TwitterFactory(cb.build());
//        Twitter twitter = tf.getInstance();
//
//        //// POST TWEET
//        /**
//         * Creamos una variable String con el tweet que queremos publicar.
//         */
//        String latestStatus = "Hola qué tal";
//        /**
//         * Creamos variable tipo "Status" y le asociamos nuestro tweet.
//         */
//        Status newStatus = twitter.updateStatus(latestStatus);
//
//        /**
//         * Mostramos por pantalla un mensaje en caso de que el tweet se haya
//         * publicado correctamente.
//         */
//        System.out.println("Successfully updated the status to [" + newStatus.getText() + "].");
////////////////////////////////////////////////////////////////////////////////////////////////////
//////GET USER'S TIMELINE
//        //UNA VEZ CREADO NUESTRO SINGLETON "Twitter", CREAMOS UN ARRAYLIST
//        //DONDE SE ALMACENARÁN LOS DATOS DE NUESTRA TIMELINE USANDO NUESTRO SINGLETON
//        /**
//         * ArrayList donde se almacenarán todos los datos de nuestra TimeLine
//         * que se mostrarán por pantalla.
//         */
//        List<Status> statuses = twitter.getHomeTimeline();
//        //MOSTRAMOS LA TIMELINE RECORRIENDO EL ARRAYLIST COMO SIEMRPE Y ACCEDIENDO
//        //A SUS DATOS, TODO CON UN FOREACH(SE PODRÍA RECORRER DE OTRAS MANERAS)
//        System.out.println("Showing home timeline.");
//        /**
//         * For donde se recorre el ArrayList y se va mostranto todo por
//         * pantalla.
//         */
//        for (Status status : statuses) {
//            System.out.println(status.getUser().getName() + ":"
//                    + status.getText());
//        }
////////////////////////////////////////////////////////////////////////////////////////
////SEARCH FOR TWEETS: (ANY)
////      //CREAMOS UNA VARIABLE "Query" A LA QUE ASOCIAREMOS UN OBJETO "Query"
//        //CON EL STRING QUE QUEREMOS BUSCAR EN TWITTER
//        /**
//         * Instanciamos objeto de tipo "Query" con el String que queremos
//         * buscar.
//         */
//        Query query = new Query("Hola");
//        //CREAMOS UNA VARIABLE "QueryResult" A LA QUE ASOCIAREMOS LOS RESULTÁDOS DE LA BÚSQUEDA:
//        /**
//         * Creamos variable tipo "QueryResult" a la que asociaremos los
//         * resultados de la búsqueda.
//         */
//        QueryResult result = twitter.search(query);
//        //RECORREMOS LOS RESULTADOS DE LA VARIABLE "QueryResult" Y LOS ENSEÑAMOS COMO SI 
//        //FUERA UN ARRAYLIST
//        /**
//         * Mostramos los resultados por pantalla recorriendo la variable
//         * "QueryResult".
//         */
//        for (Status status : result.getTweets()) {
//            System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
//        }
    }

}
