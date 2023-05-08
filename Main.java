

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter k:");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String train_set = "iris.data";
        Calculation.train(train_set);
        for (int i = 1; i <= k; i++) {
            Double[] arr = ObjectK.al.get(i - 1).params.toArray(new Double[ObjectK.paramNum]);
            ArrayList<Double> list = new ArrayList<>();
            Collections.addAll(list, arr);
            new Centroids(list, "c" + i);
        }
        boolean run = true;
        double prev_sum = -1;
        int counter = 0;
        while (run) {
            counter++;
            System.out.print("iterration " + counter + ": ");
            Calculation.test();
            double sum = Calculation.get_sum();
            if (sum == prev_sum) run = !run;
            prev_sum = sum;
            System.out.println(sum);
        }
        for (Centroids c :
                Centroids.al) {
            System.out.println(c.name + "" + c.list_of_objects.stream().collect(groupingBy(ObjectK::getGroup, Collectors.counting())) + " :" + c.list_of_objects);

        }

    }
}
