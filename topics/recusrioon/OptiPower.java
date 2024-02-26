public class OptiPower {
    public static void main(String[] args) {
        System.out.println(Power(2, 10));
        System.out.println(optimizedPower(2, 30));  
    }

    public static int Power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x*Power(x, n-1);
    }

    public static int optimizedPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        if (n%2 == 0) {
            return halfPowerSq;
        }
        return x * halfPowerSq;
    }
}
