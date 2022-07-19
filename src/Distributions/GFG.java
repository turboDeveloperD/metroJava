
package Distributions;

/**
 *
 * @author VILAN
 */
public class GFG {
    public int nCr(int n, int r)
    {
        if (r > n / 2)
            r = n - r;
      
        int aux = 1;
        for (int i = 1; i <= r; i++) {
            aux *= (n - r + i);
            aux /= i;
        }
      
        return aux;
    }
      
    public double binomialProbability(int n, int k, double p)
    {
        return nCr(n, k) * (double)Math.pow(p, k) * 
               (double)Math.pow(1 - p, n - k);
    }
}
