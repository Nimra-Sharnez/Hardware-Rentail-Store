package HardwareStoreSimulation;

public class ExtensionCord extends Addon {
    Tool tool;

    public ExtensionCord(Tool tool){
        this.tool = tool;
    }

    public String getTool_details(){
        return tool.tool_details + " with an extension cord";
    }

    public double cost(){
        return tool.cost() + 2.0;
    }


}