package tacocloud;

import java.util.List;

import lombok.Data;

@Data
public class Taco {
    private final String name;
    private final List<String> ingredients;
}
