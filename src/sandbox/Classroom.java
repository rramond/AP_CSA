//package sandbox;
//import java.util.ArrayList;
//public class Classroom {
//
////    public static class Student{
////        private String fname;
////        private String lname;
////        private int grade;
////        private String fullName;
////
////        public Student(String firstName, String lastName, int grade){
////            this.fname = firstName;
////            this.lname = lastName;
////            this.grade = grade;
////            this.fullName = firstName + "-" + lastName;
////        }
////    }
//
//    private ArrayList<Student> roster;
//
//    public Classroom(String[] names, int[] grades){
//        this.roster = new ArrayList<Student>();
//        for(int i = 0; i < names.length; i++)
//            roster.add(new Student(names[i], grades[i]));
//    }
//
//    public ArrayList<Student> topHalf() {
//        ArrayList<Student> topH = new ArrayList<Student>();
//        for(int i = 0; i < roster.size() / 2; i++ ) topH.add(roster.get(i));
//        return topH;
//    }
//}
