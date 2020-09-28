public class Main {
    public static void main(String[] args) {
        NumberOfMedals american = new NumberOfMedals(40, 15, 15);
        NumberOfMedals japan = new NumberOfMedals(10, 5, 20);

        // Thành tích của đội Hàn Quốc
        NumberOfMedals korea = new NumberOfMedals(10, 5, 20);

        System.out.println("Medals of American equals Japan ? " + american.equals(japan));

        System.out.println("Medals of Korea equals Japan ? " + korea.equals(japan));
    }
}
