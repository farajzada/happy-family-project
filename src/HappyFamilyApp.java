public class HappyFamilyApp {
    public static void main(String[] args) {
        String[] catHabits = {"meoww","siçan tuta bilər","oynaya bilər"};


        Pet myCat = new Pet("Pişik","Ibo",3,40, catHabits);

        myCat.introduce();

        System.out.println("\nEv heyvanı hərəkətləri: ");
        myCat.eat();
        myCat.respond();
        myCat.foul();
    }
}