import java.util.*;

public class Main {
    public static void main(String[] args) {
        while(true){
            mainfunction();
        }
    }
    public static void mainfunction() {

        String file = "grades.txt";
        ClassRoom test = new ClassRoom();
        test.loadGrades("grades.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Student Grade Programme\n");
        System.out.println("Select below \n [q]quit programme \n [1] view all students \n [2] find student by name \n [3] show class average \n");
        String data = sc.nextLine();
        switch (data.toLowerCase()){
            case "q":
                System.exit(0);
                break;
            case "1":
                test.viewallStudents();
                break;
            case "2":
                Scanner s = new Scanner(System.in);
                String name  = s.next();
                String cap = name.substring(0, 1).toUpperCase() + name.substring(1);
                System.out.println(test.getStudentbyName(cap));
                break;
            case "3":
                System.out.println(test.calculateClassAverage());

        }

    }     
}
