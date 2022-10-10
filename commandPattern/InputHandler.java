package commandPattern;
import java.util.HashMap;

/**
 * input handler class that stores the potential user inputs
 * @author Trectodactyls
 */
public class InputHandler {
    private HashMap <String, Command> commands;

    /**
     * Input Handler that executes a specific method according to the user input
     * @param document that represents the document the user is working in
     */
    public InputHandler(Document document ){
        commands = new HashMap <String, Command>();
        commands.put("save", new SaveCommand(document));
        commands.put("view", new ViewCommand(document));
        commands.put("append", new AppendCommand(document));
        commands.put("write",new WriteCommand(document));
    }

    /**
     * input entered method that saves the user input
     * @param data that repsents the user input
     */
    public void inputEntered(String data){
        commands.get(data);
        if (commands.containsKey(data)){
            commands.get(data).execute();
        }
    }

}