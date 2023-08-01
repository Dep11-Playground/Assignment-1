public class Demo6TaskD {
    public static void main(String[] args) {
        String bar = "\033[38;5;179m|\033[0m";

        String item1 = "Apples";
        String item2 = "Oranges"; 
        int quantity1 = 5, quantity2 = 10; 
        double price1 = 0.99,price2 = 1.49;

        String BOLT = "\033[37;1m";
        String RE = "\033[0m";
        String LINE ="\033[38;5;172m";
        String NUM ="\033[38;5;216m";
        String GREEN ="\033[38;5;22m";
        String BLUE = "\033[38;5;19m";


        System.out.printf("\033[38;5;179m+%s+%s+%s+\033[0m\n","----------","----------","-------");
        System.out.printf("|%s%3$-10s%2$s%6$s|%2$s%1$s%4$-10s%2$s%6$s|%2$s%1$s%5$-7s%2$s%6$s|\n",BOLT,RE," ITEM"," QUANTITY"," PRICE",LINE);
        System.out.printf("%s+%5$s%s%1$s+%s+%5$s%s%1$s+\n",LINE,"----------","----------","-------",GREEN);
        System.out.printf("|%4$s%1$-10s%5$s|%4$s%9$s%2$9d%5$s |%4$s%7$s%8$2s%4$s%3$.2f%5$s |\n",item1,quantity1,price1,RE,LINE,NUM,GREEN,"$",BLUE);
        System.out.printf("|%4$s%1$-10s%5$s|%4$s%9$s%2$9d%5$s |%4$s%7$s%8$2s%4$s%3$.2f%5$s |\n",item2,quantity2,price2,RE,LINE,NUM,GREEN,"$",BLUE);
        System.out.printf("\033[38;5;179m+%s+%s+%s+\033[0m\n","----------","----------","-------");
    }
}
