package Assignment1;

import java.util.HashMap;

public class Environment {
    private HashMap<String,String> inputs = new HashMap<>();
    private HashMap<String,String> outputs = new HashMap<>();
    private HashMap<String,String> latches = new HashMap<>();

    public void setInput(String inputName, String value){
        this.inputs.put(inputName,value);
    }
    public String getInput(String inputName){
        return this.inputs.get(inputName);
    }
    public HashMap<String, String> getInputs() {
        return inputs;
    }

    public boolean updateMap(){
        return false;
    }

    public void setOutput(String inputName, String value){
        this.outputs.put(inputName,value);
    }
    public String getOutput(String inputName){
        return this.outputs.get(inputName);
    }
    public HashMap<String, String> getOutputs() {
        return outputs;
    }

    public void setLatch(String inputName, String value){
        this.latches.put(inputName,value);
    }
    public String getLatch(String inputName){
        return this.latches.get(inputName);
    }
    public HashMap<String, String> getLatches() {
        return latches;
    }




}
