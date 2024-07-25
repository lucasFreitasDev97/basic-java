public class AnatomyClass {
    public static void main(String[] args) {
        String firstName = "Lucas";
        String lastName = "Freitas";

        System.out.println("Hello world!");
        System.out.println(completeName(firstName, lastName));
    }

   public static String completeName(String firstName, String lastName)
   {
       return "My name is " + firstName + " " + lastName;
   }
}