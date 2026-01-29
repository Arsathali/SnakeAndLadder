import com.snakeAndLadder.model.Player;
import com.snakeAndLadder.service.Service;

public class App {

    public static void main(String args[]){

        System.out.println("Welcome to The Snake And Ladder Game...!!");

        Player player1 = new Player("player-1");
        Player player2 = new Player("Player-2");

        System.out.println("Player initial position: " + player1.getPosition());
        System.out.println("Player initial position: " + player2.getPosition());

        Service service = new Service();
        Player currentPlayer = player1;

          while (true) {
            
            boolean playAgain = service.playTurn(currentPlayer);

            if(service.hasPlayerWon(currentPlayer)){
                System.out.println("\n🏆 " + currentPlayer.getName() + " WON THE GAME!");
                System.out.println("Total dice rolls to win: " + currentPlayer.getDiceRollCount());
                break;
            }

            if (!playAgain) {
              currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }
            System.out.println("----------------------------");
        }
    }
}