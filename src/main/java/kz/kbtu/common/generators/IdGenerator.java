package kz.kbtu.common.generators;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class IdGenerator {
    private static int counter = 0;

    public static String generateId(String idType) {
        counter++;
        return idType.substring(0, 2).toUpperCase() + String.format("%06d", counter);
    }

}
