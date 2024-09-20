import java.util.Random;

public class app {
    public static void main(String[] args) {
        rollSixDice();
    }


    private static void rollSixDice() {
        Random rand = new Random();
        for (int i = 0; i < 6; i++){
            int roll = rand.nextInt(6);
            roll++;
            System.out.println(roll);
        }

    }
}
