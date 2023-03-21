

public class Summative1
{
    public static void main(String[] args)
    {
        int[] alpha = new int[5];
        int j;

        for (j = 0; j < 5; j++) {
            alpha[j] = 2 * j;
            System.out.println("for loop");
            System.out.println(alpha[j]);

            if (j % 2 == 1) {
                alpha[j - 1] = alpha[j] + j;
                System.out.println("if loop");
                System.out.println(alpha[j]);
            }
        }

        
        

    }
}