package ej;

// Cette exception personnalisée hérite de "Exception" (pas RuntimeException)
public class IllegalBlocException extends Exception {
    // Constructeur par défaut
    public IllegalBlocException() {
        super("Les dimensions du Bloc sont invalides !");
    }

    // Constructeur avec message personnalisé
    public IllegalBlocException(String message) {
        super(message);
    }
}
