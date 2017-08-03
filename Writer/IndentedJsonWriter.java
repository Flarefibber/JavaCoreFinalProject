package JSONSerializer.Writer;

import java.io.Writer;

public class IndentedJsonWriter extends JsonWriter {
    private int indentSize = 4;


    private int currentLevel;

    public IndentedJsonWriter() {
        super();
    }

    public IndentedJsonWriter(Writer writer) {
        super(writer);
    }

    public void setIndentSize(int indentSize) {
        this.indentSize = indentSize;
    }

    public int getIndentSize() {
        return indentSize;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    @Override
    public void writeObjectBegin() {
        super.writeObjectBegin();
        for (int i = 0; i < ++currentLevel; i++){
            for (int j = 0; j < indentSize; j++){
                stringBuilder.append(' ');
            }
        }
    }

    @Override
    public void writeObjectEnd() {
        for (int i = 0; i < --currentLevel; i++){
            for (int j = 0; j < indentSize; j++){
                stringBuilder.append(' ');
            }
        }
        super.writeObjectEnd();
    }
}
