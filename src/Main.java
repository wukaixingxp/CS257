public class Main {

    public static void main(String[] args) {
        Board game = new Board();
        game.startGame();
//        game.generateRandom();
//        game.generateRandom();
        game.printBoard();
        game.rollLeft();
        game.printBoard();
    }
}

