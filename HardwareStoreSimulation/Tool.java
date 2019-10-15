package HardwareStoreSimulation;

public abstract class Tool {
    public String tool_name;
    public int tool_id = -1;
    public String tool_details = "unknown";
    public double tool_price;


    public int Tool(){
        return tool_id;
    }


    public abstract double cost();

    public String getTool_details(){
     return tool_details;
    }

}
