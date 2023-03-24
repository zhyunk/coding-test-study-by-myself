package baekjoon;

import java.io.IOException;

public class Test01 {
    public Test01(int launcher) throws IOException {
        if (launcher == 1)  this.main();
        else                this.test();
    }

    public void main() throws IOException {

    }
    public void test() {
        int n = 2;
        String[] s = new String[]{"19", "10"};
        int[] ones = new int[20];
        for (int i = 0; i < n; i++) {
            int name = Integer.parseInt(s[i]);
            for (int j = 0; j < name; j++) {
                if ((name & (1 << j)) > 0) ones[j]++;
            }
        }

        // 이 아랫부분이 아직 미궁.........
        long sum = 0L;
        for (int i = 0; i < ones.length; i++) { // 20은 n의 최대값인 100만이 20자리라서 20
            sum += (1L << i) * ones[i] * (n - ones[i]);
        }
        System.out.println(sum);
    }
}
