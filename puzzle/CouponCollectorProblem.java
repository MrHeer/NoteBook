public class CouponCollectorProblem {
    private static int findAllRepeat(int N) {
        BitSet bitSet = new BitSet(N);
        BitSet fullBitSet = new BitSet(N);
        fullBitSet.flip(0, N);
        int next = StdRandom.uniform(N);
        int count = 0;
        while (!bitSet.equals(fullBitSet)) {
            bitSet.set(next);
            next = StdRandom.uniform(N);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int count;
        int countTest = 0;
        double avg = 0;
        while (true) {
            count = findAllRepeat(N);
            countTest++;
            avg = avg + (count - avg) / countTest;
            StdOut.println(avg);
        }
    }
}
