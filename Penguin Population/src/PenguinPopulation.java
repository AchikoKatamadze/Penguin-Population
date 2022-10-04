

public class PenguinPopulation extends MiniJava {

    public static void main(String[] args){
        int n = readInt("Please insert a number:");

        int x = 2, a = 0, z = 0;

        for (int i = 0; i < n; i++) {
            z = a;
            a = x;
            x = 2 * a + z;
        }

        write(x + a + z);
    }
}