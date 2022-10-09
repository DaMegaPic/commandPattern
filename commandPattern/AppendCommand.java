package commandPattern;
import java.util.Scanner;

public class AppendCommand extends Command{
    private Document doc;

    /**
     * @param doc takes in the param of doc of type Document
     */
    public AppendCommand(Document doc){
        super(doc);
    }

    public String execute(){
        return doc.append(null);
        
    }
    
}
