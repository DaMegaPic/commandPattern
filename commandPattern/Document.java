package commandPattern;
import java.util.ArrayList;
/**
 * Document class that saves the properties of a document
 * @author Trectodactyls
 */

public class Document {

    public String fileName;
    public ArrayList<String>lines = new ArrayList<String>();

    /**
     * Creating a document with a file name
     * @param fileName that saves the name of the file
     */
    public Document(String fileName){
        this.fileName = fileName;
        FileManipulator.readFile(fileName);
    }

    /**
     * view method that allows the user to view what is in a document
     * @return String within the document
     */
    public String view(){
        return fileName;
    }

    /**
     * append method that allows the user to add text to a file
     * @param line that represents the line of the document
     * @return String that shows the user that the method was successful 
     */
    public String append(String line){
        this.lines.add(line);
        return "The line has been appended to the document";
    }

    /**
     * write method that allows the user to write what they want to add to the file
     * @param line that represents the line of the document
     * @return String that tells the user that the method was successful
     */
    public String write(String line){
        lines.clear();
        this.lines.add(line);
        return "The line was written to the file";
    }

    /**
     * save method that allows the user to save the changes that they made to a document
     * @return String that shows the user whethor or not the file could be saved
     */
    public String save(){
        FileManipulator.writeFile(fileName, lines);
        if (lines == null){
            return "Sorry, we cannot save at this time.";
        }
        else return  "The file has been saved";
    }

}
