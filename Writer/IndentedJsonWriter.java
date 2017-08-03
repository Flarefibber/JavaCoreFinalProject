package JSONSerializer.Writer;

import java.io.Writer;

public class IndentedJsonWriter extends JsonWriter{
    private int indentSize;
    private int currentLevel;

    public IndentedJsonWriter(){
        super();
        indentSize = 0;
        currentLevel = 0;
    }

    public IndentedJsonWriter(Writer writer){
        super(writer);
        indentSize = 0;
        currentLevel = 0;
    }

    public void setIndentSize(int indentSize) {
        this.indentSize = indentSize;
    }

    public int getIndentSize() {
        return indentSize;
    }
}
