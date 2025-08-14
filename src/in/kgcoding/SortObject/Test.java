package in.kgcoding.SortObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> data = new ArrayList<>();
        Student s1 = new Student(19,"anubhav");
        Student s2 = new Student(18,"rashi");
        Student s3 = new Student(20,"mahendra");
        Student s4 = new Student(19,"ravi");

        data.add(s1);
        data.add(s2);
        data.add(s3);
        data.add(s4);
        data.sort(Comparator.comparingInt(s -> s.age));
        System.out.println(data);
    }
}
