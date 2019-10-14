package JAVA_FOR_KIDS._old.GameBoyAdvance_begin;

public class GameBoy extends VideoGame {
    public static void main(String[] args) {
        System.out.println("Игра началась");

        VideoGame GameBoy = new VideoGame();

        GameBoy.start();


        GameBoy.stop();


        GameBoy.saveScore();
    }
}
