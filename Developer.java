package JSONSerializer;

import JSONSerializer.Annotation.JsonIgnore;
import JSONSerializer.Annotation.JsonProperty;

public class Developer {
    @JsonIgnore
    private Long id = 1L;
    @JsonProperty (name = "First Name")
    private String firstName = "Ivan";
    @JsonProperty (name = "Last Name")
    private String lastName = "Ivanov";
    @JsonProperty (name = "Specialty")
    private String specialty = "java";
    @JsonProperty (name = "Salary")
    private Double salary = 1000.00;


}
