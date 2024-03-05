package JModels;

import java.util.Vector;
import JLayers.Layer;

public class Model{
    private int layer_count = 0;
    private Vector<Layer> layers;
    Model(){
        layers = new Vector<Layer>();
    }
    public void addLayer(Layer layer){
        layer_count+=1;
        layers.add(layer);
    }
}