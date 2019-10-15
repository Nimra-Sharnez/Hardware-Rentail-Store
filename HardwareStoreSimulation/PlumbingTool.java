package HardwareStoreSimulation;

public class PlumbingTool extends Tool {

    PlumbingTool(int id,String name) {
        tool_name = name;
        tool_id = id + 3000;
        tool_details = "Woodworks tool";

    }

    public double cost(){
        return 12.99;
    }
}
