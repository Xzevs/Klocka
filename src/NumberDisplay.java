public class NumberDisplay {
    private int limit;
    private int value;

    public NumberDisplay(int maxLimit) {
        value = 0;
        limit = maxLimit;
    }
    public int getValue(){
       return value;
    }
    public void setValue(int newValue) {
        if (newValue < 0 || newValue > limit) {
        } else {
            this.value = newValue;
        }
    }

    public String getDisplayValue() {


        }



}
