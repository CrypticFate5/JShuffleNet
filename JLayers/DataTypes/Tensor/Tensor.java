package JLayers.DataTypes.Tensor;

import JLayers.DataTypes.Shape;

public class Tensor<T> {
    Shape shape;
    public Tensor(int ... shape){
        this.shape = new Shape(shape);
        
    }
}
