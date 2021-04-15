public class Ex7 {
    public static void main(String[] args) {
        int seconds = 86399;
        int minutes, hours;

        hours = seconds/3600;
        seconds = seconds - hours * 3600;
        minutes = seconds/60;
        seconds = seconds - minutes * 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
