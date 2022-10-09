package commandPattern;

public class SaveCommand extends Command{
    private Document doc;

    public SaveCommand(Document doc){
        super(doc);
        this.doc= doc;
    }

    public String execute(){
        return execute();
        
    }
    
}
