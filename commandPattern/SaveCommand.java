package commandPattern;

public class SaveCommand extends Command{
    private Document doc;

    public SaveCommand(Document doc){
        //this.doc= doc;
        super(doc);
    }

    public String execute(){
        //return execute();
        return doc.save();
        
    }
    
}
