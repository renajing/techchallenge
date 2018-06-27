import java.io.*;
import java.util.*;

/**
 * Created by renajing on 6/26/18.
 */
public class Question1 {

    public static boolean doesFileExist(String path){
        File f = new File(path);
        return f.exists();
    }

    public static HashMap<String, List<String>> readWordsIntoMap(String path){
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        List<String> list = new ArrayList<String>();
        File file = new File(path);
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String text = null;

            while ((text = reader.readLine()) != null) {
                list.add(text);
                String [] arr = text.split(" – ");
                String key = arr[0];
                String [] values = arr[1].split(", ");
                List<String> valuesList = Arrays.asList(values);
                map.put(key,valuesList);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }
        return map;
    }

    public static void readMap(HashMap<String, List<String>> map){
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            System.out.println(entry.getKey());
            List<String> valuesList = entry.getValue();
            for(String s : valuesList){
                System.out.println(s);
            }
        }
    }

    public static void main(String [] args) {
        String path = "./src/main/resources/dictionary.txt";
        if(!Question1.doesFileExist(path)){
            System.exit(1);
        };
        HashMap<String, List<String>> map = readWordsIntoMap(path);
        readMap(map);
    }

}
