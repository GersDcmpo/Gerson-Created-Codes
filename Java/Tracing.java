package InterJavaProg;

public class Tracing {
    public static void main (String[] args) {

        int x1 = 20;
        int y1 = 3;
        while (x1 > y1) {
            y1 = y1 + (x1 % 4);
            x1 = x1 - 2;
            System.out.println(x1 + "   " + y1);
        }
        System.out.println("");
        System.out.println("");
        int x2 = 57;
        int y2 = 3;
        switch (x2 % 9) {
            case 0:
            case 1:
                y2++;
            case 2:
                y2 = y2 - 2;
                break;
            case 3:
                y2 = y2 + 2;
            case 4:
                break;
            case 5:
            case 6:
                y2 = y2 + 3;
        }
        System.out.println(y2);
        System.out.println("");
        System.out.println("");
        int sum = 0;
        int num = 8;
        if (num <0)
            sum = sum + num;
        else if (num > 5)
            sum = num +15;
        System.out.println(sum);
        System.out.println("");
        System.out.println("");
        int x3 = 0;
        int i;
        for (i = 0; i < 5; i++)
        x3 = 3 * x3 + i;
        System.out.println(x3);
        System.out.println("");
        System.out.println("");
        int num1 = 15;
        while (num1 > 0)
        num1 = num1 - 3;
        System.out.println(num1);

        int x = 4,y;
        if (x < 4)
            y = 2;
        else if (x > 4)
        {
            if (x > 7)
            y = 4;
            else
            y = 6;
        }
        else
        y = 8;
        System.out.println(y);

    }
}