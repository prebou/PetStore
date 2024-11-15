package execute;


import entites.Address;
import entites.Animal;
import entites.PetStore;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class App {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("petstore");
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    // Créer un nouveau magasin
    PetStore petStore = new PetStore("Animalerie","Pqul");
    // ... remplir les données du magasin
    Address address = new Address("17","rue stalingrad","92700","Colombes");
    // ... remplir les données de l'adresse
    petStore.setAddress(address);


    em.persist(petStore);
    em.getTransaction().commit();

    // Récupérer tous les animaux d'un magasin
    List<Animal> animals = em.createQuery("SELECT a FROM Animal a WHERE a.petStore = :petStore", Animal.class).setParameter("petStore", petStore).getResultList();

    em.close();
    emf.close();
}