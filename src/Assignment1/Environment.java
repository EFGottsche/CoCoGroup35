package Assignment1;

import java.util.HashMap;

public class Environment {
    private HashMap<String,String> inputs = new HashMap<>();
    private HashMap<String,String> outputs = new HashMap<>();

    public void setInput(String inputName){
        this.inputs.put(inputName,"0");
    }
    public String getInput(String inputName){
        return this.inputs.get(inputName);
    }

    public void setOutput(String inputName){
        this.outputs.put(inputName,"0");
    }
    public String getOutput(String inputName){
        return this.outputs.get(inputName);
    }

}
