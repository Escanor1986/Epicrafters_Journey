package ej;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    // Crée un logger pour la classe actuelle
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args){

        // Les différents niveaux de logs
        logger.trace("Ceci est un message TRACE (très détaillé)");
        logger.debug("Ceci est un message DEBUG (utile pour le débogage)");
        logger.info("Ceci est un message INFO (information générale)");
        logger.warn("Ceci est un message WARN (avertissement)");
        logger.error("Ceci est un message ERROR (erreur)");
        logger.fatal("Ceci est un message FATAL (erreur critique)");

        // Simulation d'une exception
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logger.error("Erreur de division par zéro", e);
        }

        logger.info("Fin de l'application.");

            Kit kitDeDemarrage = new Kit();
            kitDeDemarrage.afficherKit();

        try {
            Porte porte = new Porte(1, 1, 1, true);
            porte.verrouiller();
        } catch (IllegalBlocException e) {
            System.out.println("Impossible de construire le bloc.");
        } catch (PorteVerrouilleException exception) {
            System.out.println("La porte est déjà vérrouillée.");
        }





    }

}