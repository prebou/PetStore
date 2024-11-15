package execute;


import entites.Address;
import entites.Animal;
import entites.PetStore;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import persist.PersistManager;

import java.util.List;

public class App {
    public static void main(String[] args) {

        EntityManagerFactory emf = PersistManager.getEmf();
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        // Créer un nouveau magasin
        PetStore petStore = new PetStore("Animalerie", "Paul");
        // ... remplir les données du magasin
        Address address = new Address("17", "rue stalingrad", "92700", "Colombes");
        // ... remplir les données de l'adresse
        em.persist(petStore);
        petStore.setAddress(address);

        // Récupérer tous les animaux d'un magasin
        //List<Animal> animals = em.createQuery("SELECT a FROM Animal a WHERE a.petStore = :petStore", Animal.class).setParameter("petStore", petStore).getResultList();

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
