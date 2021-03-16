import java.util.Scanner;

public class ShowStudent {
   public static void main(String[] args) {
       Scanner show = new Scanner(System.in);
       System.out.println("Enter Id Number:");
       int Id = show.nextInt();
       System.out.println("Enter number of Credit Hours earned : ");
       int Hours = show.nextInt();
       System.out.println("Enter number of Points: ");
       int Points = show.nextInt();
       Student s = new Student(Id, Hours, Points);
       System.out.println(s);
   }
}
