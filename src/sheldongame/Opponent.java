package sheldongame;
import java.util.Random;
public class Opponent {
    Random num1 = new Random();
    private int attack;
    public Opponent(){
        this.attack = num1.nextInt(5)+1;
    }
    public int getAttack(){
        return attack;
    }
}