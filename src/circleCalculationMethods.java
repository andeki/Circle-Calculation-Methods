public class circleCalculationMethods
{
    //diameter calculation method as per formula 2 times radius
    public static double diameterCalc(double rad)
    {
        return 2*rad;
    }

    //area calculation method as per formula pi times radius squared
    public static double areaCalc(double rad)
    {
        return Math.PI*Math.pow(rad,2);
    }

    //circumference calculation method as per formula 2 times pi times radius
    public static double circumferenceCalc(double rad)
    {
        return 2*Math.PI*rad;
    }

}
