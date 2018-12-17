Main.java
 
package com.company;
 
import java.util.Collections;
 
public class Main {
 
    public static void main(String[] args) {
        StudentList example = new StudentList();
        for(Student student:example.list){
            System.out.println(student.toString());
        }
        Collections.sort(example.list, new SortingStudentsByGPA());
        System.out.println("Послесортировки:");
        for(Student student:example.list){
            System.out.println(student.toString());
        }
    }
}
 
StudemtList.java
 
package com.company;
 
import java.util.ArrayList;
 
public class StudentList {
    Student one = new Student("Maksim", "Ivanov", 4);
    Student two = new Student("Artem","Petrov", 5);
    Student three = new Student("Oleg", "Makarov", 3);
    ArrayList<Student>list = new ArrayList<>();
    StudentList(){
        list.add(one);
        list.add(two);
        list.add(three);
    }
}
 
SortingStudentsByGPA.java
 
package com.company;
 
import java.util.Comparator;
public class SortingStudentsByGPA implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if(((Student)o1).getGPA()>((Student)o2).getGPA()){
            return -1;
        }
        else return 1;
    }
}
 
Student.java
 
package com.company;
 
public class Student {
    String name;
    String lastname;
    int GPA;
 
    public Student(String name, String lastname, int GPA) {
        this.name = name;
        this.lastname= lastname;
        this.GPA= GPA;
    }
 
    public String getName() {
        return name;
    }
 
    public String getLastname() {
        return lastname;
    }
 
    public int getGPA() {
        return GPA;
    }
 
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname+ '\'' +
                ", GPA=" + GPA +
                '}';
    }
}