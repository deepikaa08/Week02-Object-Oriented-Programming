import java.util.ArrayList;
import java.util.List;
class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }
    public String getCourseName() {
        return courseName;
    }
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            System.out.println(student.getName() + " enrolled in " + courseName);
        }
    }
    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }
}
class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this); // maintain association on both sides
        }
    }
    public void showCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}
class School {
    private String name;
    private List<Student> students;
    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Added student " + student.getName() + " to " + name);
    }
    public void showAllStudents() {
        System.out.println("Students in " + name + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}
public class SchoolSystem {
    public static void main(String[] args) {
        School school = new School("Greenwood High");
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        school.addStudent(s1);
        school.addStudent(s2);
        s1.enrollInCourse(math);
        s1.enrollInCourse(science);
        s2.enrollInCourse(science);
        System.out.println();
        s1.showCourses();
        s2.showCourses();
        System.out.println();
        math.showEnrolledStudents();
        science.showEnrolledStudents();
        System.out.println();
        school.showAllStudents();
    }
}
