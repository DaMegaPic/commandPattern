package commandPattern;

public class ViewCommand extends Command{
    private Document doc;
     /**
     * @param doc takes in the param of doc of type Document
     */
    public ViewCommand(Document doc){
        super(doc);
        this.doc= doc;
    }

    public String excute(){
       return doc.view();
        
    }

    
}
