public class Demo6TaskB {
    public static void main(String[] args) {
        String name1 ="Alice";
        int age1 = 24;
        String name2 = "Bob";
        int age2 = 30;
        String bar = "\033[38;5;208m|\033[0m";

        System.out.printf("\033[38;5;208m+%s+%s+\033[0m\n","-----------------","-----");
        System.out.printf("| \033[1m\033[34m%-16s\033[0m| \033[1m\033[31;34;24m%s\033[0m |\n","NAME","AGE");
        System.out.printf("\033[38;5;208m+%s+%s+\033[0m\n","-----------------","-----");
        System.out.printf("%s %-16s%1$s \033[35m%s\033[0m  %1$s\n",bar,name1,age1);
        System.out.printf("%s %-16s%1$s \033[35m%s\033[0m  %1$s\n",bar,name2,age2);
        System.out.printf("\033[38;5;208m+%s+%s+\033[0m\n","-----------------","-----");
    }
}