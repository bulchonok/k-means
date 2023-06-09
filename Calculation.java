import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Calculation {

    public static void train(String train_set) {
        try {
            Files.lines(Path.of(train_set)).forEach(
                    line -> {
                        List<Double> params = new ArrayList<>();
                        String[] tmp = line.split(",");
                        for (int i = 0; i <= tmp.length - 2; i++) {
                            params.add(Double.parseDouble(tmp[i]));
                        }
                        new ObjectK(params, tmp[tmp.length - 1]);
                    }
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void test() {

        for (Centroids centroid :
                Centroids.al) {
            centroid.list_of_objects.clear();
        }
        for (ObjectK obj :
                ObjectK.al) {

            smallest(obj).list_of_objects.add(obj);

        }

        for (Centroids centroid :
                Centroids.al) {
            centroid.CalculateNewVektor();
        }


    }

    public static double get_sum() {
        double distsum = 0;
        for (Centroids centroid :
                Centroids.al) {
            for (ObjectK o :
                    centroid.list_of_objects) {
                distsum += centroid.calculateDistance(o);
            }

        }
        return distsum;
    }

    public static Centroids smallest(ObjectK objectK) {
        Centroids cNULL = null;
        double mindistance = Double.MAX_VALUE;
        for (Centroids centroid :
                Centroids.al) {
            double distance = centroid.calculateDistance(objectK);
            if (mindistance > distance) {
                mindistance = distance;
                cNULL = centroid;
            }

        }

        return cNULL;
    }


}
