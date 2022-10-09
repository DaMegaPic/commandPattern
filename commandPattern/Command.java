package commandPattern;

public abstract class Command {
    protected Document document;

    /**
     * @param document takes in the param document of type Document 
     */
    public Command (Document document){
        this.document = document;
    }

    public String execute(){
        return execute();
        
    }
}
