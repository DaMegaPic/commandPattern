package commandPattern;

public class ViewCommand extends Command{
    private Document doc;

    public ViewCommand(Document doc){
        super(doc);
        this.doc= doc;
    }

    public String execute(){
        return execute();
        
    }

    
}
