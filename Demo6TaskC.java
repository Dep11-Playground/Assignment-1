public class Demo6TaskC{
    public static void main(String[] args) {
        String bar = "\033[38;5;179m|\033[0m";

        String city1p1="Los", city1p2="Angeles";
        String city2p1="New", city2p2="York";
        String state1 ="California";
        String city2statep1="New", city2statep2="York";
        int  pop1 = 3966936;
        int  pop2 = 8336817;

        System.out.printf("\033[38;5;179m+%s+%s+%s+\033[0m\n","-----------------","-------------","------------");
        System.out.printf("%s \033[1m\033[34m%-16s\033[0m%1$s \033[1m\033[31;34;24m%-11s\033[0m %1$s \033[1m\033[31;34;24m%-11s\033[0m%1$s\n",bar,"CITY","STATE","POPULATION"); 
        System.out.printf("\033[38;5;179m+%s+%s+%s+\033[0m\n","-----------------","-------------","------------");
        System.out.printf("%s %s %-12s%1$s %-12s%1$s \033[38;5;168m%,10d %1$s\n",bar,city1p1,city1p2,state1,pop1);
        System.out.printf("%s \033[38;5;148m%s\033[0m %-12s%1$s \033[38;5;148m%s\033[0m %-7s %1$s \033[38;5;168m%,10d %1$s\n",bar,city2p1,city2p2,city2statep1,city2statep2,pop2);
        System.out.printf("\033[38;5;179m+%s+%s+%s+\033[0m\n","-----------------","-------------","------------");
    }   
}