import com.snakeAndLadder.model.Player;
import com.snakeAndLadder.service.Service;

public class App {

    public static void main(String args[]){

        System.out.println("Welcome to The Snake And Ladder Game...!!");

        Player player = new Player();

        System.out.println("Player initial position: " + player.getPosition());

        Service service = new Service();
        
        service.playTurn(player);
    }
}