package commandPattern;

import java.util.ArrayList;

public class Document {
    public String fileName;
    public ArrayList<String>lines = new ArrayList<String>();
    
    public Document(String fileName){
        this.fileName = fileName;
    }
    public String view(){
        String docStr = this.lines.get(0);
        for(int i = 1;i <= this.lines.size();i++){
            docStr = docStr+this.lines.get(i);
        }
        return docStr;
    }
    public String append(String line){
        
    }
}
