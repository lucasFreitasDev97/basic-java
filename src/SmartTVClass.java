public class SmartTVClass {

//    Let's create an example of a class to represent a smarTV that has:
//
//      1- Characteristics: on (boolean), channel (int) and volume (int)
//      2 - Our TV can turn on and off and thus change the on state
//      3 - Our TV will always increase and decrease the volume by +1 or -1
//      4 - Our TV will be able to change channels 1 by 1 or by setting the corresponding number

    boolean turnOn = false;
    int chanel = 1;
    int volume = 0;

    public boolean turnOn() {
        return turnOn = true;
    }

    public boolean turnOf(){
        return turnOn = false;
    }

    public int changeChanel(int number){
        return chanel = number;
    }

    public int changePlusChanel(){
        return chanel++;
    }

    public int changeLessChanel(){
        return chanel--;
    }

    public int changePlusVolume(){
        return volume++;
    }

    public int changeLessVolume(){
        return volume--;
    }
}