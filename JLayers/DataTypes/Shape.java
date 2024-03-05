package JLayers.DataTypes;

import java.util.Vector;

public class Shape {
    private Vector<Integer>shape;
    public Shape(int ... shape){
        this.shape = new Vector<Integer>();
        for (int i : shape) {
            this.shape.add(i);
        }
    }
}
