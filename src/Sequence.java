public class Sequence {

    // 1 num = 0
    // 2 num = 1
    // n num = (n-2 + n-1)
    long fib(int depth) {

        long first = 0;
        long second = 1;
        long results = 1;

        if (depth < 1) {
            return -1;
        } else if (depth == 1) {
            return 0;
        } else {
            for (int i = 1; i <= (depth-2); i++) {
                results = first + second;
                first = second;
                second = results;
            }
            return results;
        }
    }

}