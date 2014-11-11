import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;

public class CSVReader {

    public static MySortedSet<Brother> readAndAdd(String csvFile) {

        String line = "", csvSplitBy = ",";
        BufferedReader br = null;
        Brother bro = null;
        int iNum;
        String intials, name;
        boolean coopStatus, inHouse, positionStatus;

        Comparator<Brother> c = (a, b) -> a.compareTo(b);
        MySortedSet<Brother> set = new MySortedSet<Brother>(c);

        try {

            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {

                String[] attributes = line.split(csvSplitBy);

                if (attributes[1].equals("Yes")) {

                    iNum = Integer.parseInt(attributes[2]);
                    name = attributes[3];
                    intials = attributes[4];
                    inHouse = attributes[5].equals("Yes");
                    coopStatus = attributes[6].equals("Yes");
                    positionStatus = attributes[7].equals("Yes");
                    bro = new Brother(iNum, intials, name, coopStatus, inHouse,
                        positionStatus);
                    System.out.println(bro);
                    set.add(bro);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
              e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return set;
    }
}