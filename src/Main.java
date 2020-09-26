import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println(getJob(WeekDayConstants.MONDAY));

        System.out.println(Arrays.toString(WeekDayConstants.values()));
        for (WeekDayConstants day : WeekDayConstants.values()
        ) {
            System.out.println(day);
        }

//        List<WeekDayConstants> day = Arrays.asList(WeekDayConstants.values());
//        day.forEach(System.out::println);

    }

    public static String getJob(WeekDayConstants weekDay) {
        if (weekDay == WeekDayConstants.SATURDAY || weekDay == WeekDayConstants.SUNDAY) {
            return "Day off";
        }

        return "Coding day";
    }
}
