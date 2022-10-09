package commandPattern;

public class SaveCommand extends Command{
    private Document doc;

    public SaveCommand(Document doc){
        super(doc);
    }

    public String execute(){
        return doc.save();
        
    }
    
}
