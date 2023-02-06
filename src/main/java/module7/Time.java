package module7;

public class Time {

    public static final Time SECOND = new Time(0, 0, 1);
    public static final Time HOUR = new Time(1, 0, 0);
    private final int hours;
    private final int minutes;
    private final int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }


    private int convertTimeToSeconds(Time time) {
        return time.getHours() * 3600 + time.getMinutes() * 60 + time.getSeconds();
    }

    public Time addTime(Time time) {
        int thisSeconds = convertTimeToSeconds(this);
        int otherSeconds = convertTimeToSeconds(time);
        int sum = thisSeconds + otherSeconds;
        return new Time(sum / 3600, (sum % 3600) / 60, sum % 60);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
