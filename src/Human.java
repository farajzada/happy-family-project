import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int birthYear;
    private String phoneNumber;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;
    private Family family;


    public Human(String name, String surname, int birthYear, String phoneNumber, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.phoneNumber = phoneNumber;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        if (iq >= 1 && iq <= 100) {
            this.iq = iq;
        } else {
            throw new IllegalArgumentException("IQ 1 və 100 arasında olmalıdır.");
        }
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void introduce() {
        System.out.println("Salam! Mənim adım " + name + " " + surname + ".");
        System.out.println("Doğum ilim: " + birthYear);
        System.out.println("Telefon nömrəm: " + phoneNumber);
        System.out.println("IQ səviyyəm: " + iq);

        if (mother != null) {
            System.out.println("Anamın adı: " + mother.getName());
        }
        if (father != null) {
            System.out.println("Atamın adı: " + father.getName());
        }
        if (pet != null) {
            System.out.println("Mənim ev heyvanımın adı: " + pet.getNickname());
        }

        System.out.println("Cədvəl:");
        for (String[] dayActivity : schedule) {
            System.out.println(Arrays.toString(dayActivity));
        }

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return birthYear == human.birthYear && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(phoneNumber, human.phoneNumber) && Objects.equals(pet, human.pet) && Objects.equals(mother, human.mother) && Objects.equals(father, human.father) && Objects.deepEquals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthYear, phoneNumber, iq, pet, mother, father, Arrays.deepHashCode(schedule));
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthYear=" + birthYear +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }


}
