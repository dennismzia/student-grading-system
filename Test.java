public class Test {
    public static void main(String[] args) {
        ClassRoom test = new ClassRoom();
        test.loadGrades("grades.txt");
        // System.out.println(test.findMaxGradeIndex());
        // System.out.println(test.findMinGradeIndex());
        // System.out.println(test.getStudentNameByIndex(3));
        // System.out.println(test.numberofStudents());
        // System.out.println(test.getGradeByIndex(0));
        // System.out.println(test.getStudentNameByIndex(0));
        System.out.println(test.getStudentbyName("Mandi"));
        // System.out.println(test.viewallStudents());
        // test.viewallStudents();
        // System.out.println(test.calculateClassAverage());
    }
    
}
