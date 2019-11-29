package enhanced_floop_practice;

public class EnhForLoop
{
    public static void main(String[] args)
    {
        int bucky[] = {3,4,5,6,7};
        int total = 0;

        for(int x: bucky)
        {
            total += x;
        }

        System.out.println(total);


        System.out.println(average(43,21,1,6));
    }

    public static int average(int...numbers)
    {
        int total = 0;
        for(int x: numbers)
        {
            total += x;
        }

        return total/numbers.length;
    }
}
