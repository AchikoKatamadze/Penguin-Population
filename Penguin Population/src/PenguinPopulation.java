

public class PenguinPopulation extends MiniJava {

    public static void main(String[] args){
        int n = readInt();

        int y = 2, a = 0, s = 0; // YASSS QUEEN!

        for (int i = 0; i < n; i++) {
            s = a;
            a = y;
            y = 2 * a + s;
        }

        write(y + a + s);
    }
}