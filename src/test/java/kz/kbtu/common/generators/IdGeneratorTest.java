package kz.kbtu.common.generators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class IdGeneratorTest {
    @Test
    public void generateId_normalCase() {
        IdGenerator generator = new IdGenerator();
        Map<String, String> prefixes = new HashMap<>();
        prefixes.put("MA", "Match");
        generator.setCounter(5);
        generator.setPrefixes(prefixes);
        String id = generator.generateId("sponsor");

        Assertions.assertEquals("SP000006", id);
    }

    @Test
    public void generateId_rapidPrefixCase() {
        IdGenerator generator = new IdGenerator();
        Map<String, String> prefixes = new HashMap<>();
        prefixes.put("MA", "Match");
        generator.setCounter(5);
        generator.setPrefixes(prefixes);
        String id = generator.generateId("Map");
        String id2 = generator.generateId("Mapper");

        Assertions.assertEquals("MAP000006", id);
        Assertions.assertEquals("MAPP000007", id2);
    }
}
