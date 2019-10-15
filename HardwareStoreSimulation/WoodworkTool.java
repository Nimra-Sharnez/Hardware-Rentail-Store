package HardwareStoreSimulation;

public class WoodworkTool extends Tool{

    WoodworkTool(int id,String name) {
        tool_name = name;
        tool_id = id + 4000;
        tool_details = "Woodworks tool";

    }

    public double cost(){
        return 10.99;
    }


}
