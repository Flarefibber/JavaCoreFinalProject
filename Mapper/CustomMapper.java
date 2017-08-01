package JSONSerializer.Mapper;

import JSONSerializer.Serializer.JsonSerializer;
import JSONSerializer.Writer.IJsonWriter;

public class CustomMapper extends AbstractJsonMapper<Object>{
    public CustomMapper(JsonSerializer serializer) {
        this.serializer=serializer;
    }

    @Override
    public void write(Object obj, IJsonWriter writer) {

    }
}
