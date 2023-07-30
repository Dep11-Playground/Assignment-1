public class Demo4 {
    public static void main(String[] args) {
        int day = 28;
        int month = 12;
        int year = 2023;
        int hour = 23;
        int minute = 59;
        int second = 59;

        String reset = "\033[0m";

        System.out.printf("\033[32m%d%2s/\033[33m%d%2$s/\033[34m%d%2$s \033[35m%d%2$s:\033[36m%d%2$s:\033[39m%d\n",month,reset,day,year,hour,minute,second);
    }
}
