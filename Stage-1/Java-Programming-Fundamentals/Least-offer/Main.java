    import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            String[] items = new String[n];
            double[] discounts = new double[n];

            double minDiscount = Double.MAX_VALUE;
            for(int i=0; i<n; i++){
                items[i] = sc.next();
                discounts[i] = (Double.parseDouble(items[i].split(",")[2])/100)*Double.parseDouble(items[i].split(",")[1]) ;
                if(discounts[i] < minDiscount)
                    minDiscount = discounts[i];
            }
            sc.close();

            for(int i=0; i<n;i++){
                if(discounts[i] == minDiscount)
                    System.out.println(items[i].split(",")[0]);
            }
        }
    }