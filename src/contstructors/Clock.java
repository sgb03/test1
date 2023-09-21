package learning_2.contstructors;

public class Clock {
    private int hours,minutes;
    
    public Clock(int hours, int minutes){
        this.hours=hours;
        this.minutes=minutes;
    }
    public Clock(int hours) {
        this(hours,0);
    }
    
    public Clock(){
        this(0,0);
    }
    
    public int getHours() {
        return hours;
    }
    
    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public int getMinutes() {
        return minutes;
    }
    
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
