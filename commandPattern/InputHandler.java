package commandPattern;
import java.util.HashMap;

public class InputHandler {
    private HashMap <String, Command> commands;

    public InputHandler(Document document ){
        commands = new HashMap<>();
        commands.put("save", SaveCommand);
        commands.put("view", ViewCommand);
        commands.put("save", AppendCommand);
        commands.put("save", WriteCommand);
    }

    public void inputEntered(String data){
        for (int i = 1;i <= this.commands.size();i++){
            if (Command == "view"){
                ViewCommand.execute();

            }
    }
    }

}