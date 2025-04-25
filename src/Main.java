import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
public class Main {
    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();
        try {
            studentsMap.put(4, "John");
            studentsMap.put(2, "Jane");
            studentsMap.put(3, "Bob");
            studentsMap.put(1, "Mary");


            System.out.println("Sorted by ID" + studentsMap);
        }catch (IllegalArgumentException e){
            System.out.println("Illegal message displayed:" + e.getMessage());
        }

        Map<Integer, String> sortedStudentsMap = new TreeMap<>(studentsMap);
        System.out.println("Sorted Students: " + sortedStudentsMap);


        //sort by value
        List<Map.Entry<Integer, String>> list = new ArrayList<>(studentsMap.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Map<Integer, String> sortedByValueMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list) {
            sortedByValueMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println("Sorted Student Map by Value: " + sortedByValueMap);
    }
}