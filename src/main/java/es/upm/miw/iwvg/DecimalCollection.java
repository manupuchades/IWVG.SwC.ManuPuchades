package es.upm.miw.iwvg;

import java.util.ArrayList;
import java.util.List;

public class DecimalCollection {

    private List<Double> collection;

    public DecimalCollection() {
        this.collection = new ArrayList<>();
    }

    public void add(double value) {
        this.collection.add(value);
    }

    public int size() {
        return this.collection.size();
    }

    public double sum() {
        assert collection != null;
        if (this.collection.isEmpty()) {
            throw new ArithmeticException("Empty collection");
        }
        /*
        double sum = 0;
        for (double item : this.collection) {
            sum += item;
        }
        return sum;
        */
        // return this.collection.stream().mapToDouble(value -> value).sum();
        return this.collection.stream().mapToDouble(Double::doubleValue).sum();

    }

    public double higher() {
        assert collection != null;
        if (this.collection.isEmpty()) {
            throw new ArithmeticException("Empty collection");
        }
        double higher = Double.NEGATIVE_INFINITY;
        for (double item : this.collection) {
            if (item > higher) {
                higher = item;
            }
        }
        return higher;
    }
    public void setNumber_in_Pos(int position, double num_to_insert){
        this.collection.add(position, num_to_insert);

    }

    public double getNumber_in_Pos(int position) {
        return this.collection.get(position);
    }

    public void setCollection(List<Double> collection){
        this.collection = collection;
    }
}
