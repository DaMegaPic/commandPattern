package commandPattern;

/**
 * Command class that creates a command
 * @author Trectodactyls
 */
public abstract class Command {
    protected Document document;

    /**
     * @param document takes in the param document of type Document 
     */
    public Command (Document document){
        this.document = document;
    }

    /**
     * Execute method that executes a command
     * @return String execute
     */
    public String execute(){
        return execute();
    }
}
