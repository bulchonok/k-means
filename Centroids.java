import java.util.ArrayList;
import java.util.List;

public class Centroids {
    static ArrayList<Centroids> al = new ArrayList<>();

    String name;
    double[] Vektor;
    double[] OldVektor;
    ArrayList<ObjectK> list_of_objects = new ArrayList<>();

    public Centroids(List<Double> params, String name) {
        this.name = name;
        this.Vektor = new double[ObjectK.paramNum];

        for (int i = 0; i < params.size(); i++) {
            Vektor[i] = params.get(i);
        }

        this.OldVektor = new double[ObjectK.paramNum];
        al.add(this);
    }

    public void CalculateNewVektor() {

        OldVektor = Vektor.clone();

        for (int i = 0; i < Vektor.length; i++) {
            double current_sum = 0;

            for (ObjectK o :
                    list_of_objects) {
                current_sum += o.params.get(i);
            }
            int devider = list_of_objects.size();
            if (list_of_objects.isEmpty()) {
                devider = 1;
            }
            current_sum = current_sum / devider;
            Vektor[i] = current_sum;
        }
    }


    public double calculateDistance(ObjectK obj) {
        double sum = 0;
        for (int i = 0; i < Vektor.length; i++) {
            sum += Math.pow((Vektor[i] - obj.params.get(i)), 2);
        }
        return sum;
    }
}