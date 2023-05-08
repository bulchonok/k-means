import java.util.ArrayList;
import java.lang.Math;
import java.util.List;

public class ObjectK {
    static ArrayList<ObjectK> al = new ArrayList<>();
    static int paramNum =0;

    String group;
    List<Double> params;

    public ObjectK(List<Double> params, String group) {
        this.group = group;
        this.params = params;
        paramNum= params.size();
        al.add(this);
    }

    @Override
    public String toString() {
        return "{" + group  +
               "[" + params +
               "]}";
    }

    public  String getGroup() {
        return this.group;
    }
}