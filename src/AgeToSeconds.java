import java.time.LocalTime;
import java.time.ZoneOffset;

public class AgeToSeconds {

    private double yearsInSeconds;
    private double ageSecondsToMilliseconds;
    private double ageInSecond;

    //methods converts age into seconds.
    public void setYearToSecond(User user) {
        int age = user.getAge();
        int yearsInHours=age * 8760;
        this.yearsInSeconds= yearsInHours * 31_556_952;
        //using below mutator to convert seconds to milliseconds
        setAgeSecondsToMilliseconds(getYearsInSeconds());
    }
    public double getYearsInSeconds() {
        return yearsInSeconds;
    }
    public void setAgeSecondsToMilliseconds(double ageInSeconds) {
        this.ageSecondsToMilliseconds = ageInSeconds * 1_000;
    }
    public double getAgeSecondsToMilliseconds() {
        return ageSecondsToMilliseconds;
    }
}
