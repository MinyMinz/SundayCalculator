import java.time.*;

class DateTimeCalc {
    private int numberOfSundays = 0;
    int DateTimeCalculator() {
        for (LocalDate startDate = LocalDate.of(1901, 1, 1);
             startDate.isBefore(LocalDate.of(2001,1,1));
             startDate = startDate.plusMonths(1)) {
            if(startDate.getDayOfWeek() == DayOfWeek.SUNDAY){
                numberOfSundays += 1;
            }
        }
        return numberOfSundays;
    }
}


