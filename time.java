import java.util.Calendar;

class Time {
    public static void main(String[] args) {
        String time = Calendar.getInstance().getTime().toString();
        System.out.println("It is now " + time);
    }
}
