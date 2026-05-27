package kz.kbtu.common.generators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class IdGenerator {
    private int counter;
    private Map<String, String> prefixes = new HashMap<>();

    public String generateId(String idType) {
        counter++;
        String pref = idType.substring(0, 2).toUpperCase();
        int i = 3;
        while (prefixes.containsKey(pref) && !prefixes.get(pref).equals(idType)) {
            pref = idType.substring(0, i).toUpperCase();
            i++;
        }
        prefixes.put(pref, idType);
        log.info("Generated id for type {}", idType);
        return pref + String.format("%06d", counter);
    }
}
