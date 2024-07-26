public class DataTypeClass {
    public static void main(String[] args) {
        /*

        Main data types in java

        Data Type   Size        Description
        byte	    1 byte	    Stores whole numbers from -128 to 127
        short	    2 bytes	    Stores whole numbers from -32,768 to 32,767
        int	        4 bytes	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long	    8 bytes	    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float	    4 bytes	    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double	    8 bytes	    Stores fractional numbers. Sufficient for storing 15 decimal digits
        boolean	    1 bit	    Stores true or false values
        char	    2 bytes	    Stores a single character/letter or ASCII values
         */

        byte age = 27;
        short year = 2024;
        int products = 504_378; // Don't start with 0
        long stores = 6_674_521_430L; // Don't start with 0
        float rate = 2.75F;
        double value = 5_430.65;
        boolean isActive = true;

        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Quantity of Products: " + products);
        System.out.println("Quantity of Stores: " + stores);
        System.out.println("Import Rate: U$ " + rate);
        System.out.println("Value: U$ " + value);
        System.out.println("Company is Active? " + isActive);
    }
}