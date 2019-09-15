import java.util.Random;

public class Die {
    private int currentValue;
    private int sides;

    Die(int sides)  {
        this.sides = sides;
    }

    public int getCurrentValue()    {
        return currentValue;
    }
    public int getSides()   {
        return sides;
    }
    public void roll()  {
        Random rolling = new Random();

        currentValue = rolling.nextInt(sides -1) + 1;
    }
}