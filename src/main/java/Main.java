/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohdm
 */

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.nuig.mohdm.classes.*;

/*
1) Add the students to a number of modules 

2) Add a number of modules to a course.
*/
/*
The program should print out a:
1) List of all the courses and their respective modules

2) List of all students, their usernames, assigned modules and the course(s) they are registered to
*/

public class Main {
    public static void main(String [] args){
        Student s1 = new Student ("Mohamed Moustafa", 22, new DateTime("1998-11-21"),1728);
        Student s2 = new Student ("Jonathen Nicholas", 24, new DateTime("1996-11-21"),1738);
        Student s3 = new Student ("Sofia Badalova", 21, new DateTime("1999-11-21"),1748);
        Student s4 = new Student ("Aparna Pandey", 21, new DateTime("1999-10-11"),1758);
        
        Module prog = new Module("Programming", "CT101");
        Module para = new Module("Paradigms", "CT201");
        Module algo = new Module("Algorithms", "CT102");
        Module hci = new Module("Human Computer Interaction", "CT202");
        
        Course csit = new Course("CS&IT", new DateTime("2020-07-25"), new DateTime("2021-07-29"));
        Course ece = new Course("ECE", new DateTime("2020-07-25"), new DateTime("2021-07-29"));
        Course cs = new Course("CS", new DateTime("2020-07-25"), new DateTime("2021-07-29"));
        
        //Add objects to arraylists
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        
        ArrayList<Module> modules = new ArrayList<Module>();
        modules.add(prog);
        modules.add(para);
        modules.add(algo);
        modules.add(hci);
        
        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(csit);
        courses.add(ece);
        courses.add(cs);
        
        //Set courses for students
        s1.setCourse(cs);
        s2.setCourse(ece);
        s3.setCourse(csit);
        s4.setCourse(csit);
        
        //Add students to modules
        prog.addStudent(s1);
        prog.addStudent(s2);
        prog.addStudent(s3);
        prog.addStudent(s4);
        
        para.addStudent(s1);
        para.addStudent(s3);
        para.addStudent(s4);
        
        algo.addStudent(s1);
        algo.addStudent(s3);
        algo.addStudent(s4);
        
        hci.addStudent(s2);
        hci.addStudent(s3);
        hci.addStudent(s4);
        
        //Add modules to courses
        csit.addModule(prog);
        csit.addModule(algo);
        csit.addModule(para);
        csit.addModule(hci);
        
        ece.addModule(prog);
        ece.addModule(hci);
        
        cs.addModule(prog);
        cs.addModule(algo);
        cs.addModule(para);
        
        //Print Courses
        for(Course c:courses){
            System.out.println(c);
        }
        
        System.out.println("\n");
        
        //Print Students
        for(Student s:students){
            System.out.println(s);
        }
    }
}