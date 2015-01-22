package Exercise1;

/**
 * @author vania
 */
public class TestMyTime {
     public static void main(String[] args) {
      
      // Declare and allocate an instance of class MyTime called time1  
        System.out.println("Creating a instance of class MyTime called time1...");
        MyTime time1 = new MyTime(19,54,03);
        System.out.println(time1);
        System.out.println("Updating my time to the next second...");
        System.out.println(time1.nextSecond().toString());
        System.out.println("Updating my time to the next minute...");
        System.out.println(time1.nextMinute().toString());
        System.out.println("Updating my time to the next hour...");
        System.out.println(time1.nextHour().toString());
        
        System.out.println("Creating a instance of class MyTime called time2...");
        MyTime time2 = new MyTime(19,51,00);
        System.out.println(time2);
        
        System.out.println("Updating my time to the previous second...");
        System.out.println(time2.previousSecond().toString());
        System.out.println("Updating my time to the previous minute...");
        System.out.println(time2.previousMinute().toString());
        System.out.println("Updating my time to the previous hour...");
        System.out.println(time2.previousHour().toString());
        
        System.out.println("Countdown Timer...(previous 80 seconds) for MyTime:"+time1.toString());
        
        for(int i=0; i<81; i++){
            System.out.println(time1.previousSecond().toString());
        
        }
        
        System.out.println("StopWatch...(next 25 minutes) for MyTime:"+time1.toString());
        
        for(int i=0; i<26; i++){
            System.out.println( time1.nextMinute().toString());
        }
    }
    
}
