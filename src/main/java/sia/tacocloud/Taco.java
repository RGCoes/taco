package sia.tacocloud;

import java.util.Date;
import java.util.List;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Taco {

    private long id;

    private Date createdAt;

    @NotNull
    @Size(min=5, message = "Name must be at least 5 characters")
    private String name;

    @Size(min = 1, message = "you must choose at least one ingredient")
    private List<Ingredient> ingredients;
}
