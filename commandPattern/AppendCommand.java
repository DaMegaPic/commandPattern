package commandPattern;
import java.util.Scanner;

public class AppendCommand extends Command{
    private Document doc;

    public AppendCommand(Document doc){
        super(doc);
    }

    public String execute(){
        return doc.append(null);
        
    }
    
}
