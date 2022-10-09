package commandPattern;
import java.util.Scanner;

public class WriteCommand extends Command{
    private Document doc;

    public WriteCommand(Document doc){
        //this.doc= doc;
        super(doc);
    }

    public String execute(){
        //return execute();
        return doc.write(null);
        
    } 
}
