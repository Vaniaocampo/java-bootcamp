package Exercise1;

/**
 * @author vania
 */
public class MyDate { //save as MyDate.java
    
    private int year; // Between 1 to 9999
    private int month; // Between 1 (Jan) to 12(Dec)
    private int day; // Between 1 to 28|29|30|31 
    private static String[] strMonths = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    private static String[] strDays={"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    private static int[] daysInMonths={31,28,31,30,31,30,31,31,30,31,30,31};
    
    public static boolean isLeapYear(int year){
        if((year/4==0 && year/100!=0)||(year/400)==0 ) return true;
        return false;
    }
    
    public static boolean isValidDate(int year, int month, int day){
        
        
        if(year>0 && year<10000){
            if(month>0 && month<13){
                if(day>0 && day<32){
                    
                    switch(day)
                    {
                        case 28: return month==2 && isLeapYear(year)==false;
                                   
                        case 29: return month==2 && isLeapYear(year)==true;
                                    
                        case 30: return month==4 || month==6 || month==9 || month==11;
                            
                        case 31: return month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==11;
                            
                    }
                    
                }
                return false;
            }
            return false;
        }
        return false;
    }
    
    /**
     * 
     * @param year
     * @param month
     * @param day
     * @return 0 for Sunday, 1 for Monday, 2 for Tuesday
     * 3 for Wednesday, 4 for Thursday, 5 for Friday and 6 for Saturday
     */
    public static int getDayOfWeek(int year, int month, int day){
        String cadena = Integer.toString(year);
        String a=cadena.substring(0,2);
        int primerosDigitos = Integer.parseInt(a);
        int auxiliar=0;
        if(primerosDigitos==17 || primerosDigitos==21) auxiliar=4;
        if(primerosDigitos==18 || primerosDigitos==22) auxiliar=2;
        if(primerosDigitos==19 || primerosDigitos==23) auxiliar=0;
        if(primerosDigitos==20 || primerosDigitos==24) auxiliar=6;
        
        String b=cadena.substring(2,cadena.length());
        int ultimosDigitos = Integer.parseInt(b);
        
        int truncar = Math.round(ultimosDigitos/4)-1;
        int sumaParcial = auxiliar + ultimosDigitos + truncar;
        
        int auxiliar2=0;
        
        switch(month){
            case 1:
                if(isLeapYear(year))auxiliar2=6;
                else auxiliar2=0;
                break;
            case 2:
                if(isLeapYear(year))auxiliar2=2;
                else auxiliar2=3;
                break;
            case 3:
                auxiliar2=3;
                break;
            case 4:
                auxiliar2=6;
                break;
            case 5: 
                auxiliar2=1;
                 break;
            case 6:
                auxiliar2=4;
                 break;
            case 7:
                auxiliar2=6;
                 break;
            case 8:
                auxiliar2=2;
                 break;
            case 9:
                auxiliar2=5;
                 break;
            case 10:
                auxiliar2=0;
                 break;
            case 11:
                auxiliar2=3;
                 break;
            case 12:
                auxiliar2=5;
                 break;
            
        }
        sumaParcial= sumaParcial + auxiliar2;
        sumaParcial= sumaParcial + day;
        int dayOfWeek= sumaParcial%7;
        return dayOfWeek;
    }
    
    public MyDate(int year, int month, int day){
        setDate(year,month,day);
    }
    
    public void setDate(int year, int month, int day) throws IllegalArgumentException
    
    {
        if(isValidDate(year, month,day)) {
            this.year=year;
            this.month=month;
            this.day=day;
        }
        else{
             throw new IllegalArgumentException("Invalid year, month, or day!");
        }
    }
    
    public void setYear(int year){
        
        if(year>0 && year<10000){
           this.year=year;
        }
        else{
             throw new IllegalArgumentException("Invalid year!");
        }
    }
    
    public void setMonth(int month){
        
        if(month>0 && month<13){
                this.month=month;
        }
        else{
             throw new IllegalArgumentException("Invalid month!");
        }
            
    }
    public void setDay(int day) throws IllegalArgumentException
    {
        
                if(day>0 && day<32){
                    if(day>27 && day<32){
                    
                    switch(day)
                    {
                        case 28: if(month==2 && isLeapYear(year)==false)
                            this.day=day;
                        else throw new IllegalArgumentException("Invalid day!");    
                        break;
                                   
                        case 29: if(month==2 && isLeapYear(year)==true)
                            this.day=day;
                        else throw new IllegalArgumentException("Invalid day!");  
                            break;
                                    
                        case 30: if(month==4 || month==6 || month==9 || month==11)
                            this.day=day;
                        else throw new IllegalArgumentException("Invalid day!");  
                            break;
                            
                        case 31: if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==11)
                            this.day=day;
                        else throw new IllegalArgumentException("Invalid day!");  
                            break;
                            
                    }
                    }
                    else this.day=day;
                    
                }
                else throw new IllegalArgumentException("Invalid day!");  
             
    }
    public int getYear(){
        return this.year;
    }
    public int getMonth(){
        return this.month;
    }
    public int getDay(){
        return this.day;
    }
    
    
    
    @Override
    public String toString(){
        int dayOfWeek = getDayOfWeek(year,month,day);
        String cadena="";
        cadena+=strDays[dayOfWeek]+" "+ day +" "+ strMonths[(month-1)] +" "+year;
        return cadena;
    }
    
    
}
