package design;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapSum {

    Map<String, Integer> map;
    Map<String, Integer> base;

    public MapSum() {
        map = new HashMap<>();
        base = new HashMap<>();
    }

    public void insert(String key, int val) {
        StringBuilder sb = new StringBuilder();
        boolean toReplace = base.containsKey(key);
        int replacedVal = Optional.ofNullable(base.get(key)).orElse(0);
        base.put(key, val);
        for (int i = 0; i < key.length(); i++) {
            sb.append(key.charAt(i));
            map.compute(sb.toString(), (k, oldVal) -> {
                        if (oldVal == null) return val;
                        if (toReplace) return oldVal - replacedVal + val;
                        return oldVal + val;
                    }
            );
        }
    }

    public int sum(String prefix) {
        return Optional.ofNullable(map.get(prefix)).orElse(0);
    }
}
