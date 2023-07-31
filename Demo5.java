public class Demo5 {
    public static void main(String[] args) {
        int first = 978;
        int second = 3;
        int third = 16;
        int fourth = 1484100;
        
        String reset = "\033[0m";

        System.out.printf("\033[32m%d%s-\033[34m%d%2$s-\033[32m%d%2$s-\033[31m%d\n ",first,reset,second,third,fourth);
    }
}
