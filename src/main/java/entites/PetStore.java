package entites;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "petStore")
public class PetStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "MANAGERE_NAME")
    private String managerName;

    @ManyToMany(mappedBy = "petStores")
    private Set<Product> products;

    @OneToMany(mappedBy = "petStore")
    private Set<Animal> animals;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ADDRESS_ID")
    private Address address;

    public PetStore() {
    }

    public PetStore(String name, String managerName) {
        this.name = name;
        this.managerName = managerName;
    }

    public PetStore(String name, String managerName, Set<Product> products, Set<Animal> animals) {
        this.name = name;
        this.managerName = managerName;
        this.products = products;
        this.animals = animals;
    }

    public PetStore(String name, String managerName, Set<Product> products, Set<Animal> animals, Address address) {
        this.name = name;
        this.managerName = managerName;
        this.products = products;
        this.animals = animals;
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PetStore{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", managerName='").append(managerName).append('\'');
        sb.append(", products=").append(products);
        sb.append(", animals=").append(animals);
        sb.append(", address=").append(address);
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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter
     *
     * @return managerName
     */
    public String getManagerName() {
        return managerName;
    }

    /**
     * Setter
     *
     * @param managerName
     */
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    /**
     * Getter
     *
     * @return products
     */
    public Set<Product> getProducts() {
        return products;
    }

    /**
     * Setter
     *
     * @param products
     */
    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    /**
     * Getter
     *
     * @return animals
     */
    public Set<Animal> getAnimals() {
        return animals;
    }

    /**
     * Setter
     *
     * @param animals
     */
    public void setAnimals(Set<Animal> animals) {
        this.animals = animals;
    }

    /**
     * Getter
     *
     * @return address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Setter
     *
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
    }
}
