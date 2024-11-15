package entites;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "CODE")
    private String code;

    @Column(name = "LABEL")
    private String label;

    @Column(name = "TYPE")
    private ProdType type;

    @Column(name = "PRICE")
    private double price;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "PROD_PETSTORE", joinColumns = @JoinColumn(name = "ID_PROD", referencedColumnName = "ID"),
    inverseJoinColumns = @JoinColumn(name = "ID_PETSTORE", referencedColumnName = "ID"))
    private Set<PetStore> petStores;

    public Product() {
    }

    public Product(String code, String label, ProdType type, double price) {
        this.code = code;
        this.label = label;
        this.type = type;
        this.price = price;
    }

    public Product(String code, String label, ProdType type, double price, Set<PetStore> petStores) {
        this.code = code;
        this.label = label;
        this.type = type;
        this.price = price;
        this.petStores = petStores;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("id=").append(id);
        sb.append(", code='").append(code).append('\'');
        sb.append(", label='").append(label).append('\'');
        sb.append(", type=").append(type);
        sb.append(", price=").append(price);
        sb.append(", petStores=").append(petStores);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Getter
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter
     *
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter
     *
     * @return label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Setter
     *
     * @param label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Getter
     *
     * @return type
     */
    public ProdType getType() {
        return type;
    }

    /**
     * Setter
     *
     * @param type
     */
    public void setType(ProdType type) {
        this.type = type;
    }

    /**
     * Getter
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Setter
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Getter
     *
     * @return petStores
     */
    public Set<PetStore> getPetStores() {
        return petStores;
    }

    /**
     * Setter
     *
     * @param petStores
     */
    public void setPetStores(Set<PetStore> petStores) {
        this.petStores = petStores;
    }

}
