package Pertemuan08.code;
import java.util.Scanner;
public class PostfikMain15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infix) : ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        Postfix15 post = new Postfix15(total);
        P = post.konversi(Q);
        System.out.println("Postfix : " + P);
    }
}
