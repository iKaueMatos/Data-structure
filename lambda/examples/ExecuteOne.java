package lambda.examples;

import java.util.List;
import java.util.function.Consumer;

public class ExecuteOne {
    public static void priintName() {
        Consumer<Student> consumer = (student) -> System.out.println(student);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(consumer);
    }

    public static void printNameStudent() {
        Consumer<Student> consumer = (student) -> {
            System.out.println(student.getName());
        };

        List<Student> studentsList = StudentDataBase.getAllStudents();
        studentsList.forEach(consumer);
    }

    public static void main(String[] args) {
        // priintName();
        printNameStudent();
    }
}
