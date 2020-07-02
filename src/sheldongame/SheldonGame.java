package sheldongame;
import java.util.Scanner;
public class SheldonGame {
    public static int enter(String messege){
        Scanner scan = new Scanner(System.in);
        System.out.println(messege);
        return scan.nextInt();
    }
    public static void welcome(){
        System.out.println("Hi welcome to the Sheldon game\n");
        System.out.println("-----------The rules----------");
        System.out.println("- Scissors cuts paper");
        System.out.println("- Paper covers rock");
        System.out.println("- Rock crushes lizard");
        System.out.println("- Lizard poisons Spock");
        System.out.println("- Spock smashes scissors");
        System.out.println("- Scissors decapitates lizard");
        System.out.println("- Lizard eats paper");
        System.out.println("- Paper disproves Spock");
        System.out.println("- Spock vaporizes rock");
        System.out.println("- Rock crushes scissors\n");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.println("4. Lizard");
        System.out.println("5. Spock\n");
    }
    public static void selectCharacter(){
        int idCharacter;
        idCharacter = enter("Select your character: ");
        Character characterRock = new Character(1);
        Character characterPaper = new Character(2);
        Character characterScissors = new Character(3);
        Character characterLizard = new Character(4);
        Character characterSpock = new Character(5);
        Opponent machine = new Opponent();
        switch (idCharacter) {
            case 1:
                characterRock.setAttack(idCharacter);
                checkRock(characterRock, characterPaper, characterScissors, characterLizard, characterSpock, machine);
                break;
            case 2:
                characterPaper.setAttack(idCharacter);
                checkPaper(characterRock, characterPaper, characterScissors, characterLizard, characterSpock, machine);
                break;
            case 3: 
                characterScissors.setAttack(idCharacter);
                checkScissors(characterRock, characterPaper, characterScissors, characterLizard, characterSpock, machine);
                break;
            case 4:
                characterLizard.setAttack(idCharacter);
                checkLizard(characterRock, characterPaper, characterScissors, characterLizard, characterSpock, machine);
                break;
            case 5:
                characterSpock.setAttack(idCharacter);
                checkSpock(characterRock, characterPaper, characterScissors, characterLizard, characterSpock, machine);
                break;
            default:
                System.out.println("Please, choose a correct option");
        }
    }
    public static void checkRock(Character characterRock1, Character characterPaper1, Character characterScissors1, Character characterLizard1, Character characterSpock1,Opponent machine1){
        if (machine1.getAttack() == characterRock1.getAttack()){
            System.out.println("Its a draw");
        }
        else{
            if((machine1.getAttack() == characterPaper1.getAttack())){
                System.out.println("Paper cover Rocke, you lose");
            }
            else{
                if ((machine1.getAttack() == characterScissors1.getAttack())){
                    System.out.println("Rock crushes Scissors, you win");
                }
                else{
                    if((machine1.getAttack() == characterLizard1.getAttack())){
                        System.out.println("Rock crushes lizard, you win");
                    }
                    else{
                        if((machine1.getAttack() == characterSpock1.getAttack())){
                            System.out.println("Spock vaporizes rock, you lose");
                        }
                    }
                }
            }
        }
    }
    public static void checkPaper(Character characterRock1, Character characterPaper1, Character characterScissors1, Character characterLizard1, Character characterSpock1,Opponent machine1){
        if (machine1.getAttack() == characterPaper1.getAttack()){
            System.out.println("Its a draw");
        }
        else{
            if((machine1.getAttack() == characterRock1.getAttack())){
                System.out.println("Paper cover Rock, you win");
            }
            else{
                if ((machine1.getAttack() == characterScissors1.getAttack())){
                    System.out.println("Scissors cuts paper, you lose");
                }
                else{
                    if((machine1.getAttack() == characterLizard1.getAttack())){
                        System.out.println("Lizard eats paper, lose");
                    }
                    else{
                        if((machine1.getAttack() == characterSpock1.getAttack())){
                            System.out.println("Paper disproves Spock, you win");
                        }
                    }
                }
            }
        }
    }
    public static void checkScissors(Character characterRock1, Character characterPaper1, Character characterScissors1, Character characterLizard1, Character characterSpock1, Opponent machine1){
        if (machine1.getAttack() == characterScissors1.getAttack()){
            System.out.println("Its a draw");
        }
        else{
            if((machine1.getAttack() == characterRock1.getAttack())){
                System.out.println("Rock crushes Scissors, you lose");
            }
            else{
                if ((machine1.getAttack() == characterPaper1.getAttack())){
                    System.out.println("Scissors cuts paper, you win");
                }
                else{
                    if((machine1.getAttack() == characterLizard1.getAttack())){
                        System.out.println("Scissors decapitates lizard, win");
                    }
                    else{
                        if((machine1.getAttack() == characterSpock1.getAttack())){
                            System.out.println("Spock smashes scissors, you lose");
                        }
                    }
                }
            }
        }
    }
    public static void checkLizard(Character characterRock1, Character characterPaper1, Character characterScissors1, Character characterLizard1, Character characterSpock1,Opponent machine1){
        if (machine1.getAttack() == characterLizard1.getAttack()){
            System.out.println("Its a draw");
        }
        else{
            if((machine1.getAttack() == characterRock1.getAttack())){
                System.out.println("Rock crushes Lizard, you lose");
            }
            else{
                if ((machine1.getAttack() == characterPaper1.getAttack())){
                    System.out.println("Lizard eats paper, you win");
                }
                else{
                    if((machine1.getAttack() == characterScissors1.getAttack())){
                        System.out.println("Scissors decapitates lizard, lose");
                    }
                    else{
                        if((machine1.getAttack() == characterSpock1.getAttack())){
                            System.out.println("Lizard poisons Spock, you win");
                        }
                    }
                }
            }
        }
    }
    public static void checkSpock(Character characterRock1, Character characterPaper1, Character characterScissors1, Character characterLizard1, Character characterSpock1,Opponent machine1){
        if (machine1.getAttack() == characterSpock1.getAttack()){
            System.out.println("Its a draw");
        }
        else{
            if((machine1.getAttack() == characterRock1.getAttack())){
                System.out.println("Spock vaporizes rock, you win");
            }
            else{
                if ((machine1.getAttack() == characterPaper1.getAttack())){
                    System.out.println("Paper disproves Spock, you lose");
                }
                else{
                    if((machine1.getAttack() == characterScissors1.getAttack())){
                        System.out.println("Spock smashes scissors, win");
                    }
                    else{
                        if((machine1.getAttack() == characterLizard1.getAttack())){
                            System.out.println("Lizard poisons Spock, you lose");
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        welcome();
        selectCharacter();
    }
}