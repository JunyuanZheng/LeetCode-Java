import java.util.Iterator;
import java.util.List;

public class Question251 {
    static class Vector2D implements Iterator<Integer> {
        List<List<Integer>> vectors;
        int cur;
        int idx;

        public Vector2D(List<List<Integer>> vec2d) {
            this.vectors = vec2d;
            this.cur = 0;
            this.idx = 0;
        }

        @Override
        public Integer next() {
            return vectors.get(cur).get(idx++);
        }

        @Override
        public boolean hasNext() {
            while(cur < vectors.size()){
                if(idx < vectors.get(cur).size())
                    return true;
                else{
                    cur++;
                    idx = 0;
                }
            }
            return false;
        }
    }
}
