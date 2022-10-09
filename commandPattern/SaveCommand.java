package commandPattern;

public class SaveCommand extends Command{
    private Document doc;
    /**
     * @param doc takes in the param of doc of type Document
     */
    public SaveCommand(Document doc){
        super(doc);
        this.doc= doc;
    }

    public String execute(){
        return doc.save();
        
    }
    
}
