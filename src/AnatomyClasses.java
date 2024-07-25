public class AnatomyClasses {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("My Name is".concat(completeName(" Lucas", "Freitas")));
    }

   public static String completeName(String firstName, String lastName)
   {
       return firstName.concat(" ").concat(lastName);
   }
}