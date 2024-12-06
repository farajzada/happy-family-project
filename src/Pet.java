import java.util.Arrays;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;      // 1-100
    private String[] habits;

    public Pet(String species, String nickname, int age, int trickLevel, String[] catHabits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        setTrickLevel(trickLevel);
        habits = new String[trickLevel];

    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        if (trickLevel >= 1 && trickLevel <= 100) {
            this.trickLevel = trickLevel;
        } else {
            throw new IllegalArgumentException("Hiylə səviyyəsi 1 və 100 arası olmalıdır.");
        }
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void introduce() {
        System.out.println("Hello! I am a " + species + " and my name is " + nickname + ".");
        System.out.println("I am " + age + " years old and my trick level is " + trickLevel + ".");
        System.out.println("My habits are: " + Arrays.toString(habits));
    }

    public void eat() {
        System.out.println("Mən yeyirəm.");
    }

    public void respond() {
        System.out.println("Salam, sahib. Mən - " + nickname + ". Darıxıram!");
    }

    public void foul() {
        System.out.println("Mən bunu ört-basdır etməliyəm.");
    }
}
