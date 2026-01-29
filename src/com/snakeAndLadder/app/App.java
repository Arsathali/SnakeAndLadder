import com.snakeAndLadder.model.Player;

/**
 * Snake and Ladder Game – Single Player
 *
 * Description:
 * This use case represents a simple Snake and Ladder game played by a single player.
 * The player starts at position 0 and rolls a dice to move forward on the board.
 * The game includes snakes (which move the player down) and ladders (which move the
 * player up). The objective is to reach the final position on the board.
 *
 * @author Developer
 * @version v1
 */

public class App {

    public static void main(String args[]){

        System.out.println("Welcome to The Snake And Ladder Game...!!");

        Player player = new Player();

        System.out.println("Player initial position: " + player.getPosition());
    }
}