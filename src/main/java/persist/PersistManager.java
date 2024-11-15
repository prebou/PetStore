package persist;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public final class PersistManager {
    private static EntityManagerFactory emf;

    public PersistManager() {
    }

    public static EntityManager getEntityManager(){
        return null;
    }

    /**
     * Getter
     *
     * @return emf
     */
    public static EntityManagerFactory getEmf() {
        if (emf == null){
            emf = Persistence.createEntityManagerFactory("default");
        }
        return emf;
    }

    public static void closeEntityManagerFactory() {
        if (emf != null) {
            emf.close();
        }
    }
}
