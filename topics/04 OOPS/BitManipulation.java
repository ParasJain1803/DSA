public class BitManipulation {
    public static void chechOddEven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 001) {
            System.out.println("odd");
        }
        else System.out.println("even");
    }

    public static int getIthBit(int n, int i) {
        int bitmask = 1<<i;
        if ((n & bitmask) == 0)
            return 0;
        else return 1;
    }

    public static int setIthBit(int n, int i) {
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int clearIthBit(int n, int i) {
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        int x = clearIthBit(n, i);
    //     if (newBit == 1) {
    //         n=setIthBit(n, i);
    //     }
    //     else n=clearIthBit(n, i);
    //     return n;
        int bitmask = newBit<<i;
        return x | bitmask;    
    }

    public static int clearIBits(int n, int i) {
        int bitmask = ~0<<i;
        return n & bitmask;
    }

    public static int clearRangeBits(int n, int i, int j) {
        int a = ~0<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n & bitmask;
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n-1))==0;
    }

    public static int countBits(int n) {
        int count=0;
        while (n != 0) {
            if ((n & 1)==1) {
                count++;
            }  
            n>>=1;  
        }
        return count;
    }

    public static int fastExpo (int n, int exp) {
        int ans = 1;
        while (exp>0) {
            if ((exp & 1) ==1 ) {
                ans *= n;
            }
            n *= n;
            exp >>= 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        //chechOddEven(78);
        //System.out.println(getIthBit(10, 2));
        //System.out.println(setIthBit(10, 2));
        //System.out.println(clearIthBit(10, 1));
        //System.out.println(updateIthBit(10, 2, 1));
        //System.out.println(clearIBits(15, 2));
        //System.out.println(clearRangeBits(10, 2,4));
        //System.out.println(isPowerOfTwo(5685));
        //System.out.println(countBits(15));
        //System.out.println(fastExpo(3, 5));
    }
}