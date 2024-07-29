public class OperatorClass {
    public static void main(String[] args) {
        int number01 = 500;
        int number02 = 340;
        //===============ARITHMETICS===============//
        int sumValue = number01 + number02; //  -> +
        int subtractionValue = number01 - number02; // -> -
        int multiplicationValue = number01 * number02; // -> *
        int moduleValue = number01 % number02; // -> %
        double divisionValue = (double) number01 / (double) number02; // -> /


        System.out.println("=====================");
        System.out.println("Arithmetics Operators");
        System.out.println("=====================");
        System.out.println(" -> " + number01 + " + " + number02 + " = " + sumValue);
        System.out.println(" -> " + number01 + " - " + number02 + " = " + subtractionValue);
        System.out.println(" -> " + number01 + " x " + number02 + " = " + multiplicationValue);
        System.out.println(" -> " + number01 + " % " + number02 + " = " + moduleValue);

        //String convert
        String formattedResultDivision = String.format("%.2f", divisionValue);
        System.out.println(" -> " + number01 + " / " + number02 + " = " + formattedResultDivision);

        //==============INCREMENT=====================//

    }
}