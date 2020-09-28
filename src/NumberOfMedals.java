import java.util.Objects;

public class NumberOfMedals {
    private int goldCount;
    private int silverCount;
    private int bronzeCount;

    public NumberOfMedals(int goldCount, int silverCount, int bronzeCount) {
        this.goldCount = goldCount;
        this.silverCount = silverCount;
        this.bronzeCount = bronzeCount;
    }

    public int getGoldCount() {
        return goldCount;
    }

    public int getSilverCount() {
        return silverCount;
    }

    public int getBronzeCount() {
        return bronzeCount;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof NumberOfMedals)) return false;
        return (this.goldCount == ((NumberOfMedals) o).goldCount)
                && (this.silverCount == ((NumberOfMedals) o).silverCount)
                && (this.bronzeCount == ((NumberOfMedals) o).bronzeCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goldCount, silverCount, bronzeCount);
    }
}
