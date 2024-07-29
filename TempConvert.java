public class TempConvert
{
    private double temp;
    public TempConvert(double temp)
    {
        this.temp = 0.0;
    }
    public double getTemp()
    {
        return temp;
    }
    public static double convertToC(double celsius) 
    {
        celsius = 5.0/9 * (celsius - 32);
        return celsius;
    }
    public static double convertToF(double faren) 
    {
        faren = (9.0/5 * faren) + 32;
        return faren;
    }
    public static void main(String args[])
    {
        System.out.println(convertToC(32));
        System.out.println(convertToF(0));
        System.out.println(convertToC(100));
    }
}