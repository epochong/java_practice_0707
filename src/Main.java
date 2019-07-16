/**
 * @author epochong
 * @date 2019/7/8 18:43
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNextInt()){

            int n = cin.nextInt();
            BigInteger a[]= new BigInteger[n];

            for(int i = 0; i < n; i++) {
                String str = cin.next();
                a[i] = new BigInteger(str);
            }
            Comparator cmp = new MyComparator();
            Arrays.sort(a, cmp);
            for (BigInteger s : a
                 ) {
                System.out.println(s.toString());
            }
        }

    }
    static class MyComparator implements Comparator<BigInteger>//从大到小排序
    {
        @Override
        public int compare(BigInteger o1, BigInteger o2) {
            if(o1.compareTo(o2)<=0) {
                return -1;
            } else if(o1.compareTo(o2)==0) {
                return 0;
            } else {
                return 1;
            }
        }

    }
}