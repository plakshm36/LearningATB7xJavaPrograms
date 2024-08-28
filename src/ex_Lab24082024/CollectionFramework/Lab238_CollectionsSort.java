package ex_Lab24082024.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lab238_CollectionsSort {
    public static void main(String[] args) {


        // Creating object for constructor and passing the parameters.Student - name, id
        Student s1 = new Student(4, "Supriya");
        Student s2 = new Student(2, "Thaku Amit Singh");
        Student s3 = new Student(3, "Muthu");
        Student s4 = new Student(1, "Darshan");

        ArrayList arrayList = new ArrayList();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
        System.out.println(arrayList);
        // Collections.sort(arrayList); // Comparable
          // Collections.sort(arrayList, new SortByID());
        Collections.sort(arrayList, new SortByName());
//        Collections.sort(arrayList, new SortByIDDesc());
        //Collections.sort(arrayList, new SortByNameDesc());
        System.out.println(arrayList);


    }
}

//comparator is an interface using it overiding the methods present in interface.
    class SortByName implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getStudent_name().compareTo(o2.getStudent_name());
        }
    }

    class SortByNameDesc implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.getStudent_name().compareTo(o1.getStudent_name());
        }
    }

    class SortByID implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return Integer.compare(o1.getStudent_id(), o2.getStudent_id());
        }
    }

    class SortByIDDesc implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return Integer.compare(o2.getStudent_id(), o1.getStudent_id());
        }
    }

    // constructor declared with getter and setter to get student id and student name
    class Student {
        private int student_id;
        private String student_name;

        public Student(int student_id, String student_name) {
            this.student_id = student_id;
            this.student_name = student_name;
        }

        public int getStudent_id() {
            return student_id;
        }

        public void setStudent_id(int id) {
            this.student_id = id;

        }

        public String getStudent_name() {
            return student_name;
        }

        public void setStudent_name(String name) {
            this.student_name = name;

        }

        // to string to make beautiful print of the details.
        public String toString() {
            return "Student{" +
                    "id=" + student_id +
                    ", name= '" + student_name + '\'' +
                    '}';


        }
    }
