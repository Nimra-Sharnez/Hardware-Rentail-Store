package HardwareStoreSimulation;

public class AccessoryKit extends Addon {

    Tool tool;

    public AccessoryKit(Tool tool){
        this.tool = tool;
    }

    public String getTool_details(){
        return tool.tool_details + " with an extension cord";
    }

    public double cost(){
        return tool.cost() + 3.0;
    }
}
