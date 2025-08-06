class Solution {
    private int[] t;

    public int numOfUnplacedFruits(int[] f, int[] b) {
        int n = b.length;
        if (n == 0) {
            return 0;
        }

        this.t = new int[4 * n];
        build(1, 0, n - 1, b);
        
        int u = 0;
        for (int q : f) {
            int i = findLeftmostBasket(1, 0, n - 1, q);
            
            if (i == -1) {
                u++;
            } else {
                markBasketAsUsed(1, 0, n - 1, i);
            }
        }
        
        return u;
    }

    private void build(int o, int s, int e, int[] b) {
        if (s == e) {
            t[o] = b[s];
            return;
        }
        int m = s + (e - s) / 2;
        int l = 2 * o;
        int r = 2 * o + 1;
        build(l, s, m, b);
        build(r, m + 1, e, b);
        t[o] = Math.max(t[l], t[r]);
    }

    private void markBasketAsUsed(int o, int s, int e, int i) {
        if (s == e) {
            t[o] = -1;
            return;
        }
        int m = s + (e - s) / 2;
        int l = 2 * o;
        int r = 2 * o + 1;
        if (i <= m) {
            markBasketAsUsed(l, s, m, i);
        } else {
            markBasketAsUsed(r, m + 1, e, i);
        }
        t[o] = Math.max(t[l], t[r]);
    }

    private int findLeftmostBasket(int o, int s, int e, int c) {
        if (t[o] < c) {
            return -1;
        }
        
        if (s == e) {
            return s;
        }

        int m = s + (e - s) / 2;
        int l = 2 * o;
        int r = 2 * o + 1;
        
        if (t[l] >= c) {
            return findLeftmostBasket(l, s, m, c);
        } else {
            return findLeftmostBasket(r, m + 1, e, c);
        }
    }
}