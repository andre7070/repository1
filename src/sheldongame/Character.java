package sheldongame;
public class Character {
    private int attack;
    public Character(int attack){
        this.attack = attack;
    }
    public int getAttack(){
        return attack;
    }
    public void setAttack(int attack){
        this.attack = attack;
    }
}