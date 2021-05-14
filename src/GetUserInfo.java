import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.stream.Stream;

public class GetUserInfo {

    private final Scanner sc = new Scanner(System.in);
    private String name;
    private String surname;
    private String date_of_birth;
    private String distance;
    User user;
    public void getUserInfo() {
        try {

            System.out.println("What is your name:\n");
            name = sc.next().trim();

            System.out.println("What is your surname:\n");
            surname = sc.next().trim();

            System.out.println(name);
            System.out.println("\n");

            System.out.println("Enter your date of birth (DD/MM/YYYY)::\n");
            date_of_birth = sc.next().trim();

            System.out.println("How far is your favourite store from your home  in Kilometers (e.g) 34km :\n");
            String localDistance;
            localDistance = sc.next().trim();

            distance = localDistance;
            user=new User(name, surname,date_of_birth , distance);

        } catch (Exception e) {
            Stream.ofNullable(e.getMessage()).forEach(System.out::println);
        }
    }
    public User getUser(){
        return user;
    }
}
