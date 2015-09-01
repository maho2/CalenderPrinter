public class CalendarPrinter
{
    public static void main (String[] args) {
        int x = 1;
        while (x < 31)
        {
            if (x==5||x==6||x==12||x==13||x==19||x==20||x==26||x==27)
            {
                System.out.println("September " + x + " - Weekend");
            }
            else if (x==7)
            {
                System.out.println("September " + x + " - No School (Labor Day)");
            }
            else if (x==25)
            {
                System.out.println("September " + x + " -End of the marking period");
            }
            else
            {
                System.out.println("September " + x );
            }
            x++;
        }
    }
}