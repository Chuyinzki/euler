public class Solution15 {

    public static void main(String[] args) {
        System.out.println("Total paths: " + findPathsOpt(20));
    }

    private static int findPathsNaive(int x, int y, int max) {
        int ret = 0;
        if (x == max || y == max)
            return 1;
        if (x < max)
            ret += findPathsNaive(x + 1, y, max);
        if (y < max)
            ret += findPathsNaive(x, y + 1, max);
        return ret;
    }

    private static long findPathsOpt(int in) {
        int max = in + 1;
        if (max <= 0) return -1;
        long[][] arr = new long[max][max];
        for (int x = max - 1; x >= 0; x--) {
            for (int y = max - 2; y >= 0; y--) {
                arr[x][y] = x == max - 1 || y == max - 1 ? 1 : arr[x][y + 1] + arr[x + 1][y];
                arr[y][x] = x == max - 1 || y == max - 1 ? 1 : arr[x][y + 1] + arr[x + 1][y];
            }
        }
        return arr[0][0];
    }
}
