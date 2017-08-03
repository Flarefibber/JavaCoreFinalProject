package JSONSerializer;

import JSONSerializer.Serializer.JsonSerializer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        JsonSerializer jsonSerializer = new JsonSerializer();
        List<String> ar = new ArrayList<String>();
        ar.add("Test1");
        ar.add("Test2");
        ar.add("Test3");
        ar.add("Test4");
        List<Integer> ar2 = new ArrayList<Integer>();
        ar2.add(1);
        ar2.add(2);
        ar2.add(3);
        ar2.add(4);
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("Test1", 1);
        hm.put("Test2", 2);
        hm.put("Test3", 3);
        hm.put("Test4", 4);
        int[] t1 = {1,2,3,4};
        jsonSerializer.setIndent(false);
        System.out.println("\n"+jsonSerializer.serialize(ar)+"\n");
        System.out.println("\n"+jsonSerializer.serialize(ar2)+"\n");
        System.out.println("\n"+jsonSerializer.serialize(t1)+"\n");
        System.out.println("\n"+jsonSerializer.serialize(hm)+"\n");

    }
}
