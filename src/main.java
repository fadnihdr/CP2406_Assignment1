import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean inMenu = true;
        while (inMenu == true) {
            int choice = menu();
            switch (choice) {
                case 1: {
                    int numPlayers = input("How many players");
                    while (numPlayers > 5 || numPlayers == 0 || numPlayers < 3) {
                        System.out.println("Invalid number");
                        numPlayers = input("How many players. (3-5)");
                    }
                    inMenu = false;
                    startGame(numPlayers);
                    break;
                }
                case 2: {
                    int exitChoice;
                    exitChoice = input("Are you sure you want to exit?\n1. Yes\n2. No");
                    if (exitChoice == 1) {
                        System.out.println("Thankyou for playing!");
                        System.exit(0);
                    } else {
                        break;
                    }
                }
            }
        }
    }

    private static void startGame(int playerCount) {

    }

    private static int menu() {
        System.out.println("Menu");
        System.out.println("1. Start game\n2. Exit");
        int choice = input("What would you like to do?");
        return choice;
    }

    private static int input(String inputMessage) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println(inputMessage + ": ");
        number = sc.nextInt();
        return number;
    }
}
