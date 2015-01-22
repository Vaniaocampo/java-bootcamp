package Exercise1;

/**
 * @author vania
 */
public class MyTime {
    
    private int hour;
    private int minute;
    private int second;
    
    public MyTime(int hour, int minute, int second){
        
        this.setTime(hour,minute,second);
    }
    
    public void setHour(int hour) throws IllegalArgumentException
    {
        if(hour<0 || hour>23){
            throw new IllegalArgumentException("Invalid hour!");
        }
        else{
            this.hour = hour;
        }  
    }
    
    public void setMinute(int minute) throws IllegalArgumentException
    {
        if(minute<0 || minute>59 ){
            throw new IllegalArgumentException("Invalid minute!");
        }
        else{
            this.minute = minute;
        }  
    }
    
    public void setSecond(int second) throws IllegalArgumentException
    {
        if(second<0 || second>59){
            throw new IllegalArgumentException("Invalid second!");
        }
        else{
            this.second = second;
        }  
    }
    
    public void setTime(int hour, int minute, int second) throws IllegalArgumentException
    {
        if(hour<0 || hour>23 || minute<0 || minute>59 || second<0 || second>59){
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
        else{
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }  
    }
    
    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }
    
    public MyTime nextSecond(){
        
        if(second == 59){
            this.minute = minute +1;
            this.second=00;
           
        }
        else{
            this.second = second+1;
        }
        return this;
    }
    
    public MyTime nextMinute(){
        
        if(minute == 59){
            this.hour = hour +1;
            this.minute=00;
           
        }
        else{
            this.minute = minute+1;
            this.second = 00;
        }
        return this;
    }
    
    public MyTime nextHour(){
        
        this.hour = hour +1;
        this.minute = 00;
        this.second = 00;
        return this;
    }
    
    public MyTime previousSecond(){
        if(second == 00){
            if (minute== 00){
                this.minute = 59;
                this.second=59;
                this.hour = hour -1;
            }
            else{
                this.minute = minute-1;
                this.second=59;
            }
            
           
        }
        else{
            this.second = second-1;
        }
        return this;
    }
    
    public MyTime previousMinute(){
        if(minute == 00){
            this.hour = hour -1;
            this.minute=59;
            this.second=59;
           
        }
        else{
            this.minute = minute-1;
            if(second==0) this.second = 59;
            else this.second=00;
        }
        return this;
    }
    
    public MyTime previousHour(){
        if(hour != 00){
            this.hour = hour -1;
            if (this.minute!=0 || this.second!=0){ // for a Stopwatch 
            this.minute=59;
            this.second=59;
            }
            else{ // for a countDown Timer
                this.minute=00;
                this.second=00;
            }
           
        }
        return this;
    }
    
    @Override
    public String toString(){
        String aux="";
        aux+=" "+hour+" : "+minute+" : "+second;
        return aux;
    }
    
}
