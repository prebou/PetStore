package entites;

import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class Fish extends Animal{

    private FishLivEnv livingEnv;

    public Fish() {
    }

    public Fish(FishLivEnv livingEnv) {
        this.livingEnv = livingEnv;
    }

    public Fish(Date birth, String couleur, PetStore petStore, FishLivEnv livingEnv) {
        super(birth, couleur, petStore);
        this.livingEnv = livingEnv;
    }

    /**
     * Getter
     *
     * @return livingEnv
     */
    public FishLivEnv getLivingEnv() {
        return livingEnv;
    }

    /**
     * Setter
     *
     * @param livingEnv
     */
    public void setLivingEnv(FishLivEnv livingEnv) {
        this.livingEnv = livingEnv;
    }
}
