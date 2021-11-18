class SundayCalc {
//   QUESTION: How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
private int numberOfSundays = 0;
private int numberOfDays = 0;
private int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};

    int CalculateSunday(){
        for (int i = 1901; i <= 2000; i++ ) {
            for (int month : months) {
                numberOfDays += month; //add days in month array to Number of days
                if (numberOfDays % 4 == 0 && month == 28) {
                    numberOfDays += 1;
                }
                if (numberOfDays % 7 == 0){
                    numberOfSundays += 1; //adds 1 to sunday count if sunday fell on first of the month
                }
            }
        }
        return numberOfSundays;
    }

}