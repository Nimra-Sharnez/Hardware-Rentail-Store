package HardwareStoreSimulation;

public class YardworkTool extends Tool{

    YardworkTool(int id,String name) {
        tool_name = name;
        tool_id = id + 5000;
        tool_details = "Woodworks tool";

    }

    public double cost(){
        return 11.99;
    }
}
