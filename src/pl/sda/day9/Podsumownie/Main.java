package pl.sda.day9.Podsumownie;

/**
 * Created by RENT on 2017-07-07.
 */
public class Main {
    public static void main(String[] args) {
        printPositive(5);
        printPositive(0);
        printPositive(-1);

    }

    public static void printPositive(int i) {
//        if (i > 0) {
//            System.out.println(i);
//        } else System.out.println(0);
        int x = ((i > 0) ? i : 0);
        System.out.println((i > 0) ? i : 0);
        // operator warunkowy if(i > 0){return i)else{return 0}


    }

}
