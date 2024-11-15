package entites;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "NUMBER")
    private String number;

    @Column(name = "STREET")
    private String street;

    @Column(name = "ZIP_CODE")
    private String zipCode;

    @Column(name = "CITY")
    private String city;

    @OneToOne(mappedBy = "address")
    private PetStore petStore;

    public Address() {
    }

    public Address(String number, String street, String zipCode, String city) {
        this.number = number;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
    }

    public Address(String number, String street, String zipCode, String city, PetStore petStore) {
        this.number = number;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.petStore = petStore;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("id=").append(id);
        sb.append(", number='").append(number).append('\'');
        sb.append(", street='").append(street).append('\'');
        sb.append(", zipCode='").append(zipCode).append('\'');
        sb.append(", city='").append(city).append('\'');
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
     * @return number
     */
    public String getNumber() {
        return number;
    }

    /**
     * Setter
     *
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Getter
     *
     * @return street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Setter
     *
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Getter
     *
     * @return zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Setter
     *
     * @param zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Getter
     *
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * Setter
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
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
