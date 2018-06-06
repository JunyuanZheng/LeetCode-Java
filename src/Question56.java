import share.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Question56 {
    public List<Interval> merge(List<Interval> intervals) {
        intervals.sort(Comparator.comparingInt(a -> a.start));
        List<Interval> result = new ArrayList<>();
        for (Interval interval : intervals) {
            if (result.size() == 0) {
                result.add(interval);
            } else if (result.get(result.size() - 1).end >= interval.start) {
                Interval tmp = result.get(result.size() - 1);
                result.remove(result.size() - 1);
                tmp.end = Math.max(interval.end, tmp.end);
                result.add(tmp);
            } else {
                result.add(interval);
            }
        }
        return result;
    }
}
