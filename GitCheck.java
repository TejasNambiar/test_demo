import java.util.*;

class GitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hungry?");
        String answer = sc.nextLine();
        if(answer.equalsIgnoreCase("yes"))
            System.out.println("come have some bread");
        else
            System.out.println("run along");
    }
}