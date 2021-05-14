import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class User {
    private String name;
    private String surname;
    private String dob;
    private String distance_from_store;
    private  int age;

    public User(String name, String surname, String dob,String distance_from_store) {
        this.name = name;
        this.surname = surname;
        this.distance_from_store = distance_from_store;
        this.dob =dob ;
        setAge(dob);
        this.age=getAge();
    }

    private void setAge(String dob) {
        String dates[]=dob.split("/");
        String year= (Integer.parseInt(dates[2])>0)?dates[2]:"Dob provided will result in negative age";
        String month=(Integer.parseInt(dates[1])>0)?dates[1]:"Dob provided will is invalid may result to negative output";
        String day=(Integer.parseInt(dates[0])>0)?dates[0]:"Dob provided will is invalid may result to negative output";
        LocalDate d=LocalDate.of( Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));

        this.age = Period.between(d,LocalDate.now()).getYears();
    }

    //Accumulators
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getDob() {
        return dob;
    }
    public String getDistance() {
        return distance_from_store;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "{\nname='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dob=" + dob +
                ", distance_from_store='" + distance_from_store + '\'' +
                ", age=" + age +"\n"+
                '}';
    }
}
