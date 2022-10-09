package commandPattern;
import java.util.Scanner;

public class AppendCommand extends Command{
    private Document doc;

    public AppendCommand(Document doc){
        //this.doc= doc;
        super(doc);
    }

    public String execute(){
        //return execute();
        return doc.append(null);
        
    }
    
}
