import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args)  throws FileNotFoundException {
        Map<String, List<Purchase>> map = new TreeMap<>();
        map = loadData(map,"shopAssortment.txt");
        writeSummary(map,"summary.txt");
    }


    /*
    Reads from a file line-by-line; puts each column into a String array, and from this array an object is initialized.
    If map does contain the key we add a list as a key's value, otherwise we add key and associated value to the map
     */
    public static Map<String,List<Purchase>> loadData(Map<String, List<Purchase>> map1,String path) throws FileNotFoundException{
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            String[] parts = scanner.nextLine().split(" ");
            Purchase p1 = new Purchase(parts[1],Integer.parseInt(parts[2]));

            if (!map1.containsKey(parts[0])){
                List<Purchase> list = new ArrayList<>();
                list.add(p1);
                map1.put(parts[0], list);
            } else {
                map1.get(parts[0]).add(p1);
            }
        }
        return map1;
    }

    /*Looping the map to write to a file "summary.txt"
    Loops through map's key sets values to find Purchase object's names and prices.
    Initialize variables accordingly and write them to a .txt file
     */
    public static void writeSummary(Map<String, List<Purchase>> map2,String path) throws  FileNotFoundException{
        PrintWriter writer = new PrintWriter(path);

        for (String s : map2.keySet()){
            int totalPrice = 0;
            int numberOfPurchase = map2.get(s).size();
            Set<String> differentItem = new TreeSet<>();
            for ( Purchase x : map2.get(s)){
                differentItem.add(x.name());
                totalPrice += x.price();
            }
            writer.println(s + " "  + differentItem.size() + " " + numberOfPurchase + " " + totalPrice);
        }

        writer.close();
    }

}
