public class TestDriver {
    public static void main(String[] args) {
        MySortedSet<Brother> set = CSVReader.readAndAdd("Responses.csv").sort(
                                    (a, b) -> a.compareTo(b));
        System.out.println(set);

    }
}