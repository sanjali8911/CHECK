import java.util.*;
public class Table {
    public static void main(String args[]) {
System.out.println("Welcome to menu driven program; press 1 to start");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
while (a == 1) {
    System.out.println("enter number 1-100");
    int b = sc.nextInt();
if (b<100 && b>=90) {System.out.println("Good, For next number press 1");
} else if (b<90 && b>=60){System.out.println("Okay okay workhard next time, For next number press 1");}
else if (b<60 && b>0) {System.out.println("Stop Get Some Help, For next number press 1");}
else {System.out.println("HAPPY HAPPY HAPPY, For next number press 1");};
a = sc.nextInt();
} 
    }
}