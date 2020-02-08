import java.util.ArrayList;
import java.util.Scanner;

public class StudentDataProvider {

    private ArrayList<Student> studentList;

    StudentDataProvider() {
        studentList = new ArrayList<>();
    }

    public void showAllStudents() {

        if (studentList.size() > 0) {
            int i =0;
            for (Student student : studentList) {
                System.out.println(i+" > "+student.getRollNo() +": "+student.getName());

                i++;
            }

            System.out.println("Total Students: "+studentList.size());

        }else {
            System.out.println("Student list is empty");
        }
    }

    public void showAllStudentsWithIndex() {

        for (int i=0; i < studentList.size(); i++) {

            Student student = studentList.get(i);

            System.out.println(i+" > "+student.getRollNo() +": "+student.getName());
        }

        System.out.println("Total Students: "+studentList.size());
    }

    public void addStudent() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Roll no: ");
        int input;

        try {
            input = scanner.nextInt();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("your roll no is invalid");
            return;
        }

        for (Student student : studentList) {

            if (student.getRollNo() == input) {
                System.out.println("Student already exist with roll no "+input);
                return;
            }

        }

        System.out.println("Enter Name: ");
        String name = scanner.next();

        Student student = new Student(input, name);
        studentList.add(student);

        System.out.println("Student Added Successfully!");

    }


    public void updateStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Index: ");



        System.out.println("Enter Roll no of student to update");
        int input;

        try {
            input = scanner.nextInt();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("your input is invalid");
            return;
        }


        for (Student student : studentList) {

            if (student.getRollNo() == input) {

                System.out.println("Enter New Roll no: ");

                try {
                    input = scanner.nextInt();
                }catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("your input is invalid");
                    input = 0;
                }

                System.out.println("Enter New Name: ");
                String name = scanner.next();

                student.setName(name);
                student.setRollNo(input);

                System.out.println("Student Updated Successfully!");

                return;
            }

        }


        System.out.println("Cannot find student "+input);



    }

    public void deleteStudent() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Index: ");

        int index;

        try {
            index = scanner.nextInt();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("your index is invalid");
            return;
        }

        if (index >= studentList.size()) {
            System.out.println("your index is invalid");
            return;
        }

        studentList.remove(index);

        System.out.println("Student Deleted Successfully!");

    }

}
