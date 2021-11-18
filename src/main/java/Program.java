public class Program {
    public static void main(String[] args) {
        SundayCalc SundayCalc = new SundayCalc();
        DateTimeCalc DateTimeCalc = new DateTimeCalc();
        System.out.println("Number of Sundays w/o DateTime Library: "+SundayCalc.CalculateSunday());
        System.out.println("Number of Sundays with DateTime Library: "+DateTimeCalc.DateTimeCalculator());
    }
}
