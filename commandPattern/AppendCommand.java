package commandPattern;
import java.util.Scanner;

/**
 * Append command class that saves properties and methods for the append command
 * @auhor Trectodactyls
 */
public class AppendCommand extends Command{
    private Document doc;

    /**
     * @param doc takes in the param of doc of type Document
     */
    public AppendCommand(Document doc){
        super(doc);
        this.doc = doc;
    }

    /**
     * execute method that executes the append command
     * @return the new appended document
     */
    public String execute(){
        return doc.append(null);
        
    }
    
}
