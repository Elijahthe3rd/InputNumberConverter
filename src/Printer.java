public class Printer {
    private final AgeToSeconds convertYearsToSeconds = new AgeToSeconds();


    public void printGreet(User user) {
        StringBuilder sb = new StringBuilder("\rHello " + user.getName() + " " + user.getSurname());
        System.out.println(sb.append("\r"));
    }

    public void printUserAge(User user) {
        StringBuilder sb2 = new StringBuilder(", You are " + user.getAge() + "years old.");
        System.out.print(sb2);
    }

    public void printAgeInSecond(User user) {
        convertYearsToSeconds.setYearToSecond(user);
        StringBuilder sb2 = new StringBuilder("You are " +
                user.getAge() + "years old.");
        System.out.println(sb2);
    }

    public void printSecondsInMilliSecond(User user) {
        StringBuilder sb2;
        String ageInMilliSecs = String.valueOf(convertYearsToSeconds.getAgeSecondsToMilliseconds());
        sb2 = new StringBuilder(user.getAge() +
                "yrs, to Seconds = " +
                (Double.parseDouble(ageInMilliSecs) + "s"));
        System.out.println(sb2.append("\r"));
    }

    //Converts user age -> seconds -> milliseconds,then print them respectively.
    public void PrintDistance(User user) {
        CalculateDistance distanceCalculator = new CalculateDistance();
        String miles = distanceCalculator.KilometreToMiles(user);
        double meters = (Double.parseDouble(miles) * 1609);
        System.out.println("\r");
        System.out.println(user.getDistance() + " To Miles = " + miles + "mi");
        System.out.println("\r");
        System.out.println(miles + "mi " + "in metres = " + meters + "m");

    }

    public void decToHexOrOctalOrBinary(User user) {
        //create array of string numbers from user date of birth
        String[] datesArray = user.getDob().split("/");
        int day = 0;
        // int month=0;
        // int year=0;
        // year=Integer.getInteger( datesArray[2]);
        // month=Integer.getInteger(datesArray[1]);

        //cast to int from string then assign to relevant field or variable
        day = Integer.parseInt( datesArray[0]);

        String hexa = Integer.toHexString(day);

        System.out.println("\nHexaDecimal Value is : " + hexa);
        String octal = Integer.toOctalString(day);
        System.out.println("\nOctal Value is : " + octal);
        String binary = Integer.toBinaryString(day);
        System.out.println("\nBinary Value is : " + binary);
    }

}
