import java.util.*;
import java.io.*;

public class ClassRoom{
    private String courseName;
    private ArrayList<String> studentNames = new ArrayList<String>();
    private ArrayList<Integer> studentGrades = new ArrayList<Integer>();
    private int numStudents = 0;


    public void loadGrades(String filepath){
        try {
            BufferedReader br = new BufferedReader( new InputStreamReader(new FileInputStream(filepath)));
            this.courseName = br.readLine(); // catches the first line fo the text file
            // System.out.println(this.courseName);
            String line;
            while ((line = br.readLine()) != null){
                
                addStudent(line);
                this.numStudents ++;

        }} catch (FileNotFoundException e) {
            System.out.println(e);
        }catch (Exception ex){
            System.out.println(ex);
        }
        
    }
    // custom method to return number of students in file
    public int numberofStudents(){
        return this.numStudents;
    }

    public double findMaxGradeIndex(){
        // returns the index of the maximum total grade
        int i;
        int max = studentGrades.get(0);
        for (i = 1; i < studentGrades.size(); i++)
        if (studentGrades.get(i) > max)
            max = studentGrades.get(i);
            double m = max;
     
    return m;
    
    }

    public double findMinGradeIndex(){
        // returns the index of the minimum total grade
        int i;
        int min = studentGrades.get(0);
        for (i = 1; i < studentGrades.size(); i++)
        if (studentGrades.get(i) < min)
            min = studentGrades.get(i);
            double d = min;
            
        return d; 
    }

    public String getStudentNameByIndex(int index){
        // returns name of student based on index
        return studentNames.get(index);

    }

    public String  getStudentbyName(String name){
        String result = "";
        if (studentNames.contains(name)){
            for(int i=0; i < studentNames.size(); i++) {
                String s = studentNames.get(i);
                if(name.equals(s)) {
                    result = getStudentNameByIndex(i)+ " " + getGradeByIndex(i);
                    break;
        }else{
            continue;
        }
    }
    }return result ;
}

    public double getGradeByIndex(int index){
        // retuns grade of student based on index
        return studentGrades.get(index);
    }

    private void addStudent(String element){
        // adding students and grades to respective arrays
        String name = element.split(" ")[0];
        studentNames.add(name);
        int firstgrade = Integer.parseInt(element.split(" ")[1]);
        int secondgrade = Integer.parseInt(element.split(" ")[2]);
        int thirdgrade = Integer.parseInt(element.split(" ")[3]);
        int fourthgrade = Integer.parseInt(element.split(" ")[4]);
        int fifthgrade = Integer.parseInt(element.split(" ")[5]);
        int sixthgrade = Integer.parseInt(element.split(" ")[6]);
        int seventhgrade = Integer.parseInt(element.split(" ")[7]);
        int lastgrade = Integer.parseInt(element.split(" ")[8])*3;
        int totalGrade = firstgrade+secondgrade+thirdgrade+fourthgrade+fifthgrade+sixthgrade+seventhgrade+lastgrade;
        int finalgrade = totalGrade/10;
        studentGrades.add(finalgrade);
    }

    public void viewallStudents(){
        int i;
        String student = "";
        for (i=0;i < studentNames.size();i++){
          student  = getStudentNameByIndex(i)+ " "+ getGradeByIndex(i);
          System.out.println(student);
        }
    }

    public double calculateClassAverage(){
        int sum = 0;
        double f = 0.0;
        for(int i=0; i< studentGrades.size(); i++){
            sum = sum + studentGrades.get(i);
            int finsum = sum/studentGrades.size();
            f = finsum;

        // return sf;
    }
    return f;
}
}
