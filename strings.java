import java.util.Scanner;

public class strings {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0,'P');
        System.out.println(sb);

        sb.insert(4,'S');
        System.out.println(sb);

        sb.delete(4,5);
        System.out.println(sb);

        sb.append("e");
        System.out.println(sb);

        System.out.println(sb.length());

        //reversing a string
        for(int i=0 ; i<sb.length()/2 ; i++){
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}
