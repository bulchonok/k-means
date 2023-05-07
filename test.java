import java.security.cert.TrustAnchor;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        HashMap<Integer, Double> distMap = new HashMap<>();
        HashMap<Integer, Double> distMapSorted = new HashMap<>();
        distMap.put(1, 2.3);
        distMap.put(2, 2.1);
        distMap.put(3, 2.4);
        distMap.put(4, 2.0);
        distMap.put(5, 2.2);
        distMap.put(6, 2.1);
        int k = 4;

//        new ObjectK(1, 2, 3, 3, "a");
//        new ObjectK(1, 2, 3, 3, "b");
//        new ObjectK(1, 2, 3, 3, "a");
//        new ObjectK(1, 2, 3, 3, "b");
//        new ObjectK(1, 2, 3, 3, "b");
//        new ObjectK(1, 2, 3, 3, "a");
//        String[] arr = new String[k];
//        System.out.println(ObjectK.getObjGroup(1));
//        distMap.entrySet().stream().sorted(HashMap.Entry.<Integer, Double>comparingByValue()
//                .reversed()).limit(k).forEach(e -> {
//            int l = 0;
//            while (!(arr[l] == null || arr[l].length() == 0)) {
//                l++;
//            }
//            arr[l] = ObjectK.getObjGroup(Integer.parseInt(e.getKey().toString()));
//        });
//        HashMap<String, Integer> counter = new HashMap<>();
//        for (String a : arr
//        ) {
//            if (counter.get(a) == null) counter.put(a, 1);
//            else counter.put(a, counter.get(a) + 1);
//        }
//        System.out.println(Collections.max(counter.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey());
//
    }
}
