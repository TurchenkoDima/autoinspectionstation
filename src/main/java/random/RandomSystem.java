package random;

public class RandomSystem {

    public static int  generateError(){
        int errorChance = (int)( Math.random() * 35) - 30;
        System.out.println(errorChance);
        return errorChance;
    }

    public static int generateIndex(int length){
        int index = (int)( Math.random() * (length)) - 1;
        return index;
    }
}
