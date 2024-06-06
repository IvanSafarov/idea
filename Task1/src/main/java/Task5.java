public class Task5 {
    public static void sinTab(double start, double end, double step)
    {
        {
            for (double i = start; i < end; i = i + step){
                System.out.println("sin(" + i + ") = " + Math.sin(i));
            }
        }
    }
}
