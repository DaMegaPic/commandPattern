package commandPattern;
import java.util.Scanner;

public class WriteCommand extends Command {
    private Document doc;
    /**
     * @param doc takes in the param of doc of type Document
     */
    public WriteCommand(Document doc){
        super(doc);
        this.doc= doc;
    }

    public String execute(){
        return doc.write(null);
        
    } 
}
