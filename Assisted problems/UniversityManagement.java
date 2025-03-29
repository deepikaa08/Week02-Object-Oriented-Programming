import java.util.ArrayList;
import java.util.List;
class Professor {
    private String name;
    public Professor(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void showProfessorDetails() {
        System.out.println("Professor: " + name);
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
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in course: " + course.getCourseName());
    }
    public void showStudentDetails() {
        System.out.println("\nStudent: " + name);
        System.out.println("Enrolled Courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

class Course {
    private String courseName;
    private Professor professor;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }
    public String getCourseName() {
        return courseName;
    }
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getName() + " assigned to course: " + courseName);
    }
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }
    public void showCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        } else {
            System.out.println("Professor: Not assigned");
        }
        System.out.println("Enrolled Students:");
        if (students.isEmpty()) {
            System.out.println("No students enrolled.");
        } else {
            for (Student student : students) {
                System.out.println("- " + student.getName());
            }
        }
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Smith");
        Professor prof2 = new Professor("Dr. Johnson");
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Artificial Intelligence");
        course1.assignProfessor(prof1);
        course2.assignProfessor(prof2);
        Student student1 = new Student("AAA");
        Student student2 = new Student("BBB");
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course2);
        student1.showStudentDetails();
        student2.showStudentDetails();
        course1.showCourseDetails();
        course2.showCourseDetails();
    }
}
