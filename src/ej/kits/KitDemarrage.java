package ej.kits;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;

import ej.blocs.IBloc;
import ej.exceptions.IllegalBlocException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class KitDemarrage {

    private static final Logger logger = LogManager.getLogger(KitDemarrage.class);

    private final Set<IBloc> blocs = new LinkedHashSet<IBloc>();
    private final Set<String> motsCles = new LinkedHashSet<String>();

    public Set<IBloc> getBlocs() {
        return blocs;
    }

    public Set<String> getMotsCles() {
        return motsCles;
    }

    public KitDemarrage(final Set<IBloc> blocs) throws IllegalBlocException {
        this.blocs.addAll(blocs);

        motsCles.add("Cabane");
        motsCles.add("Muraille");
        motsCles.add("Maison");
    }

    public void afficherKit() {
        System.out.println("Nombre de blocs dans le kit : " + blocs.size());
        System.out.print("Liste des mots clés du kit : ");
        for (String motCle : motsCles) {
            System.out.print(motCle + " ");
        }
    }

    // Méthode permettant d'écrire les données dans un fichier que l'on crée on the fly
    public void sauvegarder() {
        // Construction de la chaîne de texte à écrire
        StringBuilder builder = new StringBuilder();
        // Ajout de la première ligne de texte
        builder.append("Kit de démarrage : \n");
        for(String motCle : motsCles) {
            builder.append(motCle).append(" "); // Ajoute chaque mot clé suivi d'un espace
        }

        try {
            // Ouverture d'un BufferedWriter lié à un FileWriter pour le fichier "kit.txt"
            BufferedWriter writer = new BufferedWriter(new FileWriter("kit.txt"));
            // Écriture de la chaîne construite dans le fichier
            writer.write(builder.toString());
            // Fermeture du flux d'écriture pour éviter les fuites de ressources
            writer.close();
        } catch(IOException e) {
            logger.error("Impossible d'écrire dans le fichier : {}", String.valueOf(e));
        }
    }

    public void charger() {
        try (BufferedReader reader = new BufferedReader(new FileReader("kit.txt"))) {
            String line = null;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            logger.error("Le fichier kit.txt n'existe pas.");
        } catch (IOException e) {
            logger.error("Impossible de lire le fichier kit.txt");
        }
    }


}