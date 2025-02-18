package tablas;

import java.util.ArrayList;
import java.util.List;

public class Row {
    private List<Double> data;
    public Row() {
        data = new ArrayList<Double>();
    }

    public List<Double> getData() {
        return data;
    }
}
