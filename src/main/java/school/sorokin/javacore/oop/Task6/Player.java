package school.sorokin.javacore.oop.Task6;

public class Player {

    String name;
    int personalScore = 0;


    Player(String name, int points) {
        this.name = name;
        this.personalScore += points;

        GameScore.addPoints(points);
    }
}
