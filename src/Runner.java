import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
        GetUserInfo userInfo = new GetUserInfo();
        userInfo.getUserInfo();

        User user = new User(
                userInfo.getUser().getName(),
                userInfo.getUser().getSurname(),
                userInfo.getUser().getDob(),
                userInfo.getUser().getDistance()
        );


        Printer printer = new Printer();
        printer.printGreet(user);
        printer.printUserAge(user);
        printer.PrintDistance(user);
        printer.printAgeInSecond(user);
        printer.printSecondsInMilliSecond(user);
        printer.decToHexOrOctalOrBinary(user);
    }
}
