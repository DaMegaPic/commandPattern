package commandPattern;

public class ViewCommand extends Command{
    private Document doc;
     /**
     * @param doc takes in the param of doc of type Document
     */
    public ViewCommand(Document doc){
        super(doc);
    }

    public String execute(){
       return doc.view();
        
    }

    
}
