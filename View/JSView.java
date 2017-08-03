package JSONSerializer.View;

import JSONSerializer.Controller.JSController;
import JSONSerializer.Developer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class JSView {
    private JSController controller = new JSController();
    private static boolean isExit = false;
    private static Scanner scanner = new Scanner(System.in);
    private static int choice;

    public void showStartMenu(){
        while (true) {
            printMenu();
            doChoice();
            runMenu();
            if (isExit) return;
        }
    }

    private static void printMenu() {
        System.out.println("\n=====================================================");
        System.out.println("==================Make your choice:==================");
        System.out.println("     1: Launch the demo");
        System.out.println("     2: Exit");
        System.out.println("=====================================================\n");
    }

    private void runMenu() {
        switch (choice)  {
            case 1: demo(); break;
            default: setIsExit();
        }
    }

    private void doChoice() {
        do {
            choice = readInt("Your choice is: \n");
        } while (choice < 1 || choice > 2);
    }

    private void demo(){

        List<String> ar = new ArrayList<String>();
        ar.add("Test1");
        ar.add("Test2");
        ar.add("Test3");
        ar.add("Test4");
        List<Integer> ar2 = new ArrayList<Integer>();
        ar2.add(1);
        ar2.add(2);
        ar2.add(3);
        ar2.add(4);
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("Test1", 1);
        hm.put("Test2", 2);
        hm.put("Test3", 3);
        hm.put("Test4", 4);
        int[] t1 = {1,2,3,4};
        controller.setIndent(false);
        System.out.println("\n"+controller.serialize(ar)+"\n");
        System.out.println("\n"+controller.serialize(ar2)+"\n");
        System.out.println("\n"+controller.serialize(t1)+"\n");
        System.out.println("\n"+controller.serialize(hm)+"\n");
        Developer developer = new Developer();
        System.out.println("\n"+controller.serialize(developer)+"\n");
    }

    private static int readInt(String request) {
        System.out.print(request);
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print(request);
            }
        }
    }

    private static void setIsExit() {
        JSView.isExit = true;
    }
}
