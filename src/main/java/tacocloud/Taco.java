package tacocloud;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Taco {
    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private final String name;
    private final List<String> ingredients;
}
