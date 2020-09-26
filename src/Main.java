public class Main {
    public static void main(String[] args) {
        System.out.println(getJob(WeekDayConstants.MONDAY));
    }

    public static String getJob(WeekDayConstants weekDay) {
        if (weekDay == WeekDayConstants.SATURDAY || weekDay == WeekDayConstants.SUNDAY) {
            return "Day off";
        }

        return "Coding day";
    }
}
