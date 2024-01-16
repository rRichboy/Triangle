import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Введите сторону 1: ");
            float A = in.nextFloat();

            System.out.print("Введите сторону 2: ");
            float B = in.nextFloat();

            System.out.print("Введите сторону 3: ");
            float C = in.nextFloat();


            if (Valid(A, B, C))
            {
                System.out.printf("Треугольник со сторонами 1=%.2f 2=%.2f 3=%.2f – существует.%n", A, B, C);
            }
            else
            {
                System.out.printf("Треугольник со сторонами 1=%.2f 2=%.2f 3=%.2f – не существует.%n", A, B, C);
            }


        }
        catch (NoSuchElementException ex)
        {
            System.out.println("Введите числа!");
        }
        finally
        {
            in.close();
        }
    }

    private static boolean Valid(float A, float B, float C) {
        return (A + B > C) && (B + C > A) && (A + C > B);
    }
}
