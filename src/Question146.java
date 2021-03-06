import java.util.LinkedHashMap;
import java.util.Map;

public class Question146 {
    class LRUCache {
        private final int CAPACITY;
        LinkedHashMap<Integer, Integer> map;

        public LRUCache(int capacity) {
            CAPACITY = capacity;
            map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true){
                @Override
                protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                    return size() > CAPACITY;
                }
            };
        }

        public int get(int key) {
            return map.getOrDefault(key, -1);
        }

        public void set(int key, int value) {
            map.put(key, value);
        }
    }
}
