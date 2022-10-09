package commandPattern;

public class ViewCommand extends Command{
    private Document doc;

    public ViewCommand(Document doc){
        //this.doc= doc;
        super(doc);
    }

    public String execute(){
        //return execute();
       return doc.view();
        
    }

    
}
