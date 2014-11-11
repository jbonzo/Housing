public class TestDriver {
    public static void main(String[] args) {
        MySortedSet<Brother> set = CSVReader.readAndAdd("C:/Users/Ricky/Desktop/Projects/House/Responses.csv").sort(
                                    (a, b) -> a.compareTo(b));
        System.out.println(set);

    }
}