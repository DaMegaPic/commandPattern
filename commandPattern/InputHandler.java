package commandPattern;
import java.util.HashMap;

public class InputHandler {
    private HashMap <String, Command> commands = new HashMap<String, Command>();

    public InputHandler(Document document ){
        commands.put("save", new SaveCommand(document));
        commands.put("view", new ViewCommand(document));
        commands.put("append", new AppendCommand(document));
        commands.put("write",new WriteCommand(document))
            
        
    }

    public void inputEntered(String data){

        commands.get(data);
       
    }

}