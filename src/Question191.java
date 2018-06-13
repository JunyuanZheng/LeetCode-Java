public class Question191 {
    public int hammingWeight(int n) {
        int counter = 0;
        for (int i = 0; i < 32; i += 1) {
            counter = counter + ((n & 1) == 1 ? 1 : 0);
            n >>>= 1;
        }
        return counter;
    }
}
