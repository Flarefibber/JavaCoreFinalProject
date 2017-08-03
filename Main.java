package JSONSerializer;

import JSONSerializer.Serializer.JsonSerializer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        JsonSerializer jsonSerializer = new JsonSerializer();
        List<String> ar = new ArrayList<String>();
        ar.add("Test1");
        ar.add("Test2");
        ar.add("Test3");
        ar.add("Test4");
        jsonSerializer.setIndent(false);
        System.out.println(jsonSerializer.serialize(ar));
    }
}
