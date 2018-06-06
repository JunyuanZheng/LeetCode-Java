public class Question75 {
    void sortColors(int A[]) {
        int n0 = -1, n1 = -1, n2 = -1;
        for (int i = 0; i < A.length; ++i) {
            if (A[i] == 0)
            {
                A[++n2] = 2; A[++n1] = 1; A[++n0] = 0;
            }
            else if (A[i] == 1)
            {
                A[++n2] = 2; A[++n1] = 1;
            }
            else if (A[i] == 2)
            {
                A[++n2] = 2;
            }
        }
    }

    public static void main(String[] args) {
        Question75 test = new Question75();
        int[] tmp = new int[] { 2,0,2,1,1,0 };
        test.sortColors(tmp);
    }
}
