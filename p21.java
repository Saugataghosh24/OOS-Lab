class Denominator  extends Thread 
{
    private int n;
    private double d[];
  
    public Denominator(int n, double denom[]) {
      this.n = n;
      this.d = denom;
    }
  
    public void run() {
      for (int i = 0; i <= n; i++) {
        d[i] = factorial(i);
      }
    }
  
    private double factorial(int num) {
      if (num <= 0) {
        return 1;
      } else {
        double ans = 1;
        for (int i = 2; i <= num; i++) {
          ans *= i;
        }
        return ans;
      }
    }
}
  
class Sum extends Thread 
{
    private double d[];
    private double ans;
  
    public Sum(double[] denom) {
      this.d = denom;
      this.ans = 0;
    }
  
    public void run() {
      for (double i : d) {
        ans += 1 /i;
      }
    }
  
    public double getAns() {
      return ans;
    }
}
  
class Main
{
        public static void main(String[] args) throws InterruptedException {
      int n = 10;
      double d[] = new double[n + 1];
  
      Denominator t1 = new Denominator(n, d);
      Sum t2 = new Sum(d);
  
      t1.start();
      t1.join();
      t2.start();
      t2.join();
  
      double ans = t2.getAns();
      System.out.println("Result: " + ans);
    }
}
  