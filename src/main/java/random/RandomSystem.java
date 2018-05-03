package random;

public class RandomSystem {

    private int errorChance;

    public void generate(){
        int errorChance = (int)( Math.random() * 35) - 30;
        System.out.println(errorChance);
    }
}
