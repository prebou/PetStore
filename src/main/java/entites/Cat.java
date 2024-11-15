package entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class Cat extends Animal{

    @Column(name = "CHIP_ID")
    private String chipId;

    public Cat() {
    }

    public Cat(String chipId) {
        this.chipId = chipId;
    }

    public Cat(Date birth, String couleur, PetStore petStore, String chipId) {
        super(birth, couleur, petStore);
        this.chipId = chipId;
    }

    /**
     * Getter
     *
     * @return chipId
     */
    public String getChipId() {
        return chipId;
    }

    /**
     * Setter
     *
     * @param chipId
     */
    public void setChipId(String chipId) {
        this.chipId = chipId;
    }
}
