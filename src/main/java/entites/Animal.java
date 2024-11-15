package entites;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "animal")
@Inheritance(strategy = InheritanceType.JOINED)
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "BIRTH")
    private Date birth;

    @Column(name = "COULEUR")
    private String couleur;

    @ManyToOne
    @JoinColumn(name = "ID_PET_STORE")
    private PetStore petStore;

    public Animal() {
    }

    public Animal(Date birth, String couleur, PetStore petStore) {
        this.birth = birth;
        this.couleur = couleur;
        this.petStore = petStore;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("id=").append(id);
        sb.append(", birth=").append(birth);
        sb.append(", couleur='").append(couleur).append('\'');
        sb.append(", petStore=").append(petStore);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Getter
     *
     * @return id
     */
    public long getId() {
        return id;
    }

    /**
     * Setter
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Getter
     *
     * @return birth
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * Setter
     *
     * @param birth
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * Getter
     *
     * @return couleur
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     * Setter
     *
     * @param couleur
     */
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    /**
     * Getter
     *
     * @return petStore
     */
    public PetStore getPetStore() {
        return petStore;
    }

    /**
     * Setter
     *
     * @param petStore
     */
    public void setPetStore(PetStore petStore) {
        this.petStore = petStore;
    }
}
