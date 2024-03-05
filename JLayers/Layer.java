package JLayers;

import JLayers.DataTypes.Shape;
import JLayers.DataTypes.Tensor.Tensor;
import JLayers.DataTypes.Tensor.TensorMap;

abstract public class Layer {
    protected Shape input_shape;
    protected Shape output_shape;
    protected TensorMap parameters;

    public void setInputShape(Shape shape){
        this.input_shape = shape;
    }
    public void setOutputShape(Shape shape){
        this.output_shape = shape;
    }
    public void setInputShape(int ... shape){
        this.input_shape = new Shape(shape);
    }
    public void setOutputShape(int ... shape){
        this.output_shape = new Shape(shape);
    }

    abstract TensorMap forward(Tensor input);
    protected void updateParameters(String key,Tensor value){
        
    }
    abstract TensorMap backward(Tensor input);
}
