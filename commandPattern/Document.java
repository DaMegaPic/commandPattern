package commandPattern;
import java.util.ArrayList;

public class Document {

    public String fileName;
    public ArrayList<String>lines = new ArrayList<String>();
    
    public Document(String fileName){
        this.fileName = fileName;
        FileManipulator.readFile(fileName);
    }

    public String view(){
        String docStr = this.lines.get(0);
        for(int i = 1;i <= this.lines.size();i++){
            docStr = docStr+this.lines.get(i);
        }
        return docStr;
    }

    public String append(String line){
        this.lines.add(line);
        return "The line has been appended to the document";
    }
    public String write(String line){
        this.lines = null;
        this.lines.add(line);
        return "The line was written to the file";
    }
    public String save(){
        FileManipulator.writeFile(fileName, lines);
        if (lines == null){
            return "Sorry, we cannot save at this time.";
        }
        else return  "The file has been saved";
    }

}
