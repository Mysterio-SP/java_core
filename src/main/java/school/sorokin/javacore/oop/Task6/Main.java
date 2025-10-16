package school.sorokin.javacore.oop.Task6;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Sergey", 5);

        System.out.println("Очки первого игрока - " + player1.personalScore);
        System.out.println("Общее количество очков - " + GameScore.totalScore);

        Player player2 = new Player("Иван", 10);

        System.out.println("Очки второго игрока - " + player2.personalScore);
        System.out.println("Общее количество очков - " + GameScore.totalScore);

        Player player3 = new Player("Михаил", 5);

        System.out.println("Очки третьего игрока - " + player3.personalScore);
        System.out.println("Общее количество очков - " + GameScore.totalScore);

    }
}
