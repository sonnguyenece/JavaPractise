import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1 == null && o2 == null) {
            return 0;
        }
        // If o1 is null, regarded as o2 is larger
        if (o1 == null) {
            return -1;
        }
        // If o2 is null, regarded as o1 is larger .
        if (o2 == null) {
            return 1;
        }
        // Rule:
        // Sort gradually increase over age.
        int value = o1.getAge() - o2.getAge();
        if (value != 0) {
            return value;
        }
        // If age is the same, then compare fullName.
        // Compare by Alphabet.
        value = o1.getFullName().compareTo(o2.getFullName());
        return value;
    }

}
