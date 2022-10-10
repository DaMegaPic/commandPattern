package commandPattern;
import java.util.Scanner;

/**
 * Write command class that saves properties and methods for the write command
 * @auhor Trectodactyls
 */
public class WriteCommand extends Command {
    private Document doc;
    /**
     * @param doc takes in the param of doc of type Document
     */
    public WriteCommand(Document doc){
        super(doc);
        this.doc= doc;
    }

    /**
     * execute method that executes the write command
     * @return the String that the user has written 
     */
    public String execute(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter text");
        String writestr=  keyboard.nextLine();
        document.write(writestr);
       return"The line was written to the file";        
    } 
}
