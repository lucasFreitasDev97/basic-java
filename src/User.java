public class User {
    public static void main(String [] args) throws Exception{
        SmartTVClass smartTVClass = new SmartTVClass();
        System.out.println("==============");
        System.out.println("SmartTV Status 1.0");
        System.out.println("==============");
        System.out.println("Turn On: " + smartTVClass.turnOn);
        System.out.println("Chanel: " + smartTVClass.chanel);
        System.out.println("Volume: " + smartTVClass.volume);

        smartTVClass.changePlusChanel();
        smartTVClass.changePlusChanel();
        smartTVClass.changePlusChanel();
        smartTVClass.changePlusChanel();
        smartTVClass.changePlusChanel();
        smartTVClass.changeLessChanel();

        smartTVClass.changePlusVolume();
        smartTVClass.changePlusVolume();
        smartTVClass.changePlusVolume();
        smartTVClass.changePlusVolume();
        smartTVClass.changePlusVolume();
        smartTVClass.changeLessVolume();

        System.out.println("==============");
        System.out.println("SmartTV Status 2.0");
        System.out.println("==============");
        System.out.println("Turn On: " + smartTVClass.turnOn);
        System.out.println("Chanel: " + smartTVClass.chanel);
        System.out.println("Volume: " + smartTVClass.volume);

        smartTVClass.changeChanel(10);

        System.out.println("==============");
        System.out.println("SmartTV Status 3.0");
        System.out.println("==============");
        System.out.println("Turn On: " + smartTVClass.turnOn);
        System.out.println("Chanel: " + smartTVClass.chanel);
        System.out.println("Volume: " + smartTVClass.volume);
    }
}
