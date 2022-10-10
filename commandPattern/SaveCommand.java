package commandPattern;
/**
 * Save command class that saves properties and methods for the save command
 * @auhor Trectodactyls
 */
public class SaveCommand extends Command{
    private Document doc;
    /**
     * @param doc takes in the param of doc of type Document
     */
    public SaveCommand(Document doc){
        super(doc);
        this.doc= doc;
    }

    /**
     * execute method that executes the save commeand
     * @return the new saved document
     */
    public String execute(){
        System.out.println("The file has been saved.");
        return doc.save();
        
    }
    
}
