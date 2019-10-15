package HardwareStoreSimulation;

public class PaintingTool extends Tool {

    PaintingTool(int id,String name) {
        tool_name = name;
        tool_id = id + 1000;
        tool_details = "Woodworks tool";

    }

    public double cost(){
        return 5.99;
    }
}
