

public class PenguinPopulation extends MiniJava {

    public static void main(String[] args){
        int n = readInt("Please insert a number:");

        int x = 2, y = 0, z = 0;
        int i = 0;

        while (i < n) {
            i++;
            z = y;
            y = x;
            x = 2 * y + z;
        }

        write(x + y + z);
    }
}