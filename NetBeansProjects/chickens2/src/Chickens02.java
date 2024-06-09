public class Chickens02 {
    private static int s, t, q;
    public static void main(String[] args) {
        
s = 100;
t = 121;
q = 117;
int dailyAverage = (s + t + q) / 3;
int monthlyAverage = 30 * dailyAverage;
double monthlyProfit = 0.18 * monthlyAverage;

     System.out.println("Daily Average:   " +dailyAverage);
     System.out.println("Monthly Average: " +monthlyAverage);
     System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
