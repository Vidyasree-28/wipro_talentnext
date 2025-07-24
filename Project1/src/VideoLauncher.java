import java.util.Scanner;

public class VideoLauncher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore vs = new VideoStore();
        int choice;

        do {
            System.out.println("\nMAIN MENU");
            System.out.println("=========");
            System.out.println("1. Add Videos:");
            System.out.println("2. Check Out Video:");
            System.out.println("3. Return Video:");
            System.out.println("4. Receive Rating:");
            System.out.println("5. List Inventory:");
            System.out.println("6. Exit:");
            System.out.print("Enter your choice (1..6): ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the video you want to add: ");
                    vs.addVideo(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter the name of the video you want to check out: ");
                    vs.doCheckout(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter the name of the video you want to return: ");
                    vs.doReturn(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Enter the name of the video you want to rate: ");
                    String name = sc.nextLine();
                    System.out.print("Enter the rating for this video: ");
                    int rating = sc.nextInt();
                    sc.nextLine(); // consume newline
                    vs.receiveRating(name, rating);
                    break;
                case 5:
                    vs.listInventory();
                    break;
                case 6:
                    System.out.println("Exiting...!! Thanks for using the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter between 1 and 6.");
            }
        } while (choice != 6);

        sc.close();
    }
}
