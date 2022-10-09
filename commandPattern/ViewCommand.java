package commandPattern;

/**
 * View command class that saves properties and methods for the view command
 * @auhor Trectodactyls
 */
public class ViewCommand extends Command{
    private Document doc;
     /**
     * @param doc takes in the param of doc of type Document
     */
    public ViewCommand(Document doc){
        super(doc);
        this.doc= doc;
    }

    /**
     * execute method that execute the view command
     * @return the document for the user to view
     */
    public String excute(){
       return doc.view();
        
    }

    
}
