package com.my016.API;

import com.my016.pojo.Student;
import com.my016.pojo.Teacher;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentBean {
    static {

    }
    public static List<Student> getStudentArrayList(){

        Student s1 = new Student("016",19,'男',"1145141919810",new Teacher("520"));
        Student s2 = new Student("017",109,'男',"1145141919810",new Teacher("rticle/details/114173362\n"));
        Student s3 = new Student("018",189,'男',"1145141919810",new Teacher("群主推荐"));
        Student s4 = new Student("019",1,'男',"1145141919810",new Teacher("520"));
        Student s5 = new Student("020",9,'女',"1145141919810",new Teacher("520"));
        Student s6 = new Student("021",129,'男',"1145141919810",new Teacher("我在这里，等风也等你＝，→＝你在的时候 全世界都是你，你不在的时候 你就是全世界"));
        Student s7 = new Student("0134",119,'男',"1145141919810",new Teacher("520"));
        Student s8 = new Student("016123354",119,'男',"1145141919810",new Teacher("520"));
        Student s9 = new Student("016321312",192,'男',"1145141919810",new Teacher("对我来说，重要的事情只剩下了三件。\n" +
                "如果要把它们从轻到重排列\n" +
                "我想应该是这样\n" +
                "我爱你 爱你 你"));
        Student s10 = new Student("01213123126",159,'女',"1145141919810",new Teacher("入目无别人，四下皆是你， "));
        Student s11 = new Student("0165446",189,'男',"1145141919810",new Teacher("520"));
        Student s12 = new Student("017866",199,'男',"1145141919810",new Teacher("我有一个超能力哦\n" +
                "超~~~~~~喜欢你"));
        Student s13 = new Student("009-16",190,'男',"1145141919810",new Teacher("520"));


        List<Student> list = new LinkedList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        list.add(s7);
        list.add(s8);
        list.add(s9);
        list.add(s10);
        list.add(s11);
        list.add(s12);
        list.add(s13);
        return list;
    }
}
