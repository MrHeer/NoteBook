public class BirthdayProblem {
    private static int findFirstRepeat(int N) {
        BitSet bitSet = new BitSet(N);
        int next = StdRandom.uniform(N);
        int count = 0;
        while (!bitSet.get(next)) {
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
            count = findFirstRepeat(N);
            countTest++;
            avg = avg + (count - avg) / countTest;
            StdOut.println(avg);
        }
    }
}
