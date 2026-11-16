import java.util.Random;
public class ArrayTesting
{
    public static void main(String[] args)
    {
        int [] dataPoints = new int [50];
        int total = 0;
        int avg = 0;
        Random rnd = new Random();


        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i]= rnd.nextInt(100);
            total = dataPoints[i] +total;
        }

        for (int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i] + " | ");
        }

        avg = total/50;
        System.out.println("\nThe average of the random array dataPoints is: "+avg+
                "\nThe sum of your values is: "+total);


    }
}