import java.util.ArrayList;

public class Player {

    private String name;
    private int score = 0;
    private ArrayList<Die> dieList = new ArrayList<>();

    static int ID = 1;

    public Player() {
        name = "Player " + ID;
        ID++;
    }

    public void rollDices() {
        for (int i = 0; i < dieList.size(); i++) {
            dieList.get(i).roll();
        }
    }

    public void addDie(int sides)    {
        dieList.add(new Die(sides));
    }
    public void increaseScore() {
        score++;
    }

    public int getDieValue()   {
        int value = 0;
        for (int i = 0; i < dieList.size(); i++) {

            value = value + dieList.get(i).getCurrentValue();
        }
        return value;
    }

    public int getDieListSize() {
        return dieList.size();
    }

    public String getName() { return name; }

    public int getScore()   { return score; }

}

