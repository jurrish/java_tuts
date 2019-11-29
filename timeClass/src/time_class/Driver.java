package time_class;

public class Driver
{

    public static void main(String[] args)
    {

        TimeClass time = new TimeClass();
        System.out.println(time.toMilitary());

        time.setTime(13,6,20);
        System.out.println(time.toMilitary());

        System.out.println(time.toString());

    }
}
