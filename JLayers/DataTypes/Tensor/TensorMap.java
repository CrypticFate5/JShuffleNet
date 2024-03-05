package JLayers.DataTypes.Tensor;

import java.util.HashMap;

public class TensorMap{
    private HashMap<String,Tensor> named_tensor;
    public void add(String key,Tensor value){
        named_tensor.put(key, value);
    }
    public void set(String key,Tensor value){
        named_tensor.put(key,value);
    }
    public Tensor get(String key){
        return named_tensor.get(key);
    }
}
