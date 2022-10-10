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
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter text");
        String writestr=  keyboard.nextLine();
        document.append(writestr);
       return"The line has been appended to the document."; 
        
    }
    
}
