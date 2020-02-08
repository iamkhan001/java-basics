import java.util.Scanner;

public class MainClass {

    private StudentDataProvider dataProvider = new StudentDataProvider();

    public static void main(String[] input) {

        MainClass mainClass = new MainClass();
        mainClass.showMenu();

    }

    private void showMenu(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select your choice");
        System.out.println("1. Add Student | 2. List Student | 3. Update Student | 4. Delete Student | 5. Exit");

        int input;

        try {
            input = scanner.nextInt();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("your input is invalid");
            input = 0;
        }


        System.out.println("Your Option: "+input);

        switch (input) {
            case 1:
                System.out.println("Add Student");
                dataProvider.addStudent();
                showMenu();
                break;
            case 2:
                System.out.println("List Student");
                dataProvider.showAllStudents();
                showMenu();
                break;
            case 3:
                System.out.println("Update Student");
                dataProvider.updateStudent();
                showMenu();
                break;
            case 4:
                System.out.println("Delete Student");
                dataProvider.deleteStudent();
                showMenu();
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid Input");
                showMenu();
                break;
        }

    }


}

