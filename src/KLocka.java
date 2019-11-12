public class KLocka {

    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;

    public KLocka() {
    this.hours = new NumberDisplay(24);
    this.minutes = new NumberDisplay (59);
    }
    public KLocka (int hour, int minute){
        this();
        this.hours.setValue(0);
        this.minutes.setValue(0);
    }
    public void timeTick() {

    }
    public void setTime (int hour,int minute) {

    }
}
