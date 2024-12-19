package ej.kits;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

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
        System.out.println("Nombre de bloc dans le kit : " + this.blocs.size());
        System.out.print("Liste des mots clés du kit : ");
        // Consumer est une interface fonctionnelle native en Java
        Consumer<String> fonctionAnonyme = System.out::print;
        this.motsCles.forEach(fonctionAnonyme);
    }

    public void sauvegarder() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n Kit de démarrage : \n");
        for(String motCle : motsCles) {
            builder.append(motCle).append(" ");
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("kit.txt"));
            writer.write(builder.toString());
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