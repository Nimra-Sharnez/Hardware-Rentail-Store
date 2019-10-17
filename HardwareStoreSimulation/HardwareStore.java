package HardwareStoreSimulation;

import java.util.List;


public class HardwareStore {

    ToolFactory factory = new ToolFactory();
    public List<Tool> toolInventory;

    public Tool orderTool(String type,int id,String name){
        Tool newTool = factory.createTool(type,id,name);
        
        return newTool;
        
}
