package HardwareStoreSimulation;

public class ConcreteTool extends Tool {

    ConcreteTool(int id,String name) {
        tool_name = name;
        tool_id = id + 2000;
        tool_details = "Woodworks tool";

    }

    public double cost(){
        return 13.99;
    }
}
