package HardwareStoreSimulation;

public class ToolFactory {

    public Tool createTool(String type, int id, String name){

        if(type == "painting tool"){return new PaintingTool(id,name);}
        else if(type == "concrete tool"){return new ConcreteTool(id,name);}
        else if(type == "plumbing tool"){return new PlumbingTool(id,name);}
        else if(type == "woodwork tool"){return new WoodworkTool(id,name);}
        else if(type == "yardwork tool"){return new YardworkTool(id,name);}

        else{throw new IllegalArgumentException();}



    }
}
