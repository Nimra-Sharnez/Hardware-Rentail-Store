package HardwareStoreSimulation;

public class ProtectiveGearPackage extends Addon {

    Tool tool;

    public ProtectiveGearPackage(Tool tool){
        this.tool = tool;
    }

    public String getTool_details(){
        return tool.tool_details + " with an extension cord";
    }

    public double cost(){
        return tool.cost() + 3.0;
    }
}
