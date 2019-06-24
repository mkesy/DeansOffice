/**
 * Created by Mikolaj on 15.01.2018.
 */
public class Temp {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int alicePoints = 0;
        int bobPoints = 0;

        for (int i = 0; i <= 2; i++) {

            String variableA = "a" + String.valueOf(i);
            String variableB = "b" + String.valueOf(i);

            if (variableA > variableB) {
                alicePoints += 1;
            } else if (variableB < variableA) {
                bobPoints += 1;
            }

        }
        int[] table = {alicePoints, bobPoints};
        return table;
    }

    public static void main(String[] args) {

    }
}
