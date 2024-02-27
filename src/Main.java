import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=== Library System ===");

        int option;
        do {
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");

            System.out.print("Choose option (1-3)\t: ");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter your NIM\t: ");
                    String nim = scan.next();

                    int digitNim = nim.length();

                    if (digitNim != 15){
                        System.out.println("Gaono NIM ngonoki!");
                    } else {
                        System.out.println("Successful Login as Student");
                    }
                    break;
                case 2:
                    System.out.print("Enter your username (syaiful)\t: ");
                    String un = scan.next();

                    System.out.print("Enter your password (alib)\t\t: ");
                    String pass = scan.next();

                    if (un.equals("syaiful") && pass.equals("alib")){
                        System.out.println("Successful Login as Admin");
                    }else {
                        System.out.println("Admin user Not Found!");
                    }
                    break;
                case 3:
                    System.out.println("Exit the program.");
                    break;
                default:
                    System.out.println("Optione mok 1-3 lee");
            }
        } while (option != 3);

        scan.close();
    }
}