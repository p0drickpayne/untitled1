import java.util.ArrayList;
import java.util.Scanner;


public class SimpleDiceGame {

    static ArrayList<Player> players = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        players = initialize();

        for (int i = 0; i < 5 ; i++) {

            System.out.println("Runda " + (i + 1));

            takeTurn(players);
            getWinners(players);
        }
    }

    private static ArrayList<Player> initialize(){
        ArrayList<Player> players = new ArrayList<>();

        System.out.println("Antal spelare?");
        int numberOfPlayers = sc.nextInt();
        System.out.println(numberOfPlayers + " Spelare");

        System.out.println("Hur många tärningar");
        int numberOfDices = sc.nextInt();
        System.out.println(numberOfDices + " Stycken tärningar ");

        System.out.println("Antal sidor?");
        int numberOfDieSides = sc.nextInt();
        System.out.println("Med " + numberOfDieSides + " Sidor");
        //Lägger till nya spelare så länge i är mindre än det antal spelare man skrev in
        for (int i = 0; i < numberOfPlayers ; i++) {
            players.add(new Player());

            //Lägger till nya tärningar så länge j är mindre än det antal tärningar man skrev in
            //Samt lägger på sidor på tärningarna (ger varje tärning ett värde?)
            //Spelarna får även tärningarna??
            for (int j = 0; j < numberOfDices ; j++) {
                //Addar antal tärningar och sidor till spelaren så dom har något att slå
                players.get(i).addDie(numberOfDieSides);

            }
        }
     return players;
    }

    private static void takeTurn(ArrayList<Player> players) {



        for (int i = 0; i < players.size() ; i++) {
            players.get(i).rollDices();
            System.out.println("Gissa ett nummer");
            int guessedNumber = sc.nextInt();

            System.out.println(players.get(i).getName() + " Du gissade på " + guessedNumber);
            players.get(i).rollDices();

            System.out.println("Summan av de " + players.get(i).getDieListSize() + " tärningarna " + players.get(i).getDieValue());

            if (guessedNumber == players.get(i).getDieValue())  {
                players.get(i).increaseScore();

                System.out.println(players.get(i).getName() + " gissade rätt och fick 1 poäng");
            }

        }
    }
    private static  ArrayList<Player> getWinners(ArrayList<Player>players)  {

        ArrayList<Player> winners = new ArrayList<>();

        //for (int i = 0; i < players.size(); i++) { }

        /*vad behöver jag hämta?
        spelarna och deras reultat
        Vad behöver jag skriva ut?
        Deras score och placering
        Hur skriver vi ut det?
        Genom att stortera scoren och skriva ut den
         */

        for (Player i : winners)    {
            System.out.println(players);
        }
            return winners;

    }
}
