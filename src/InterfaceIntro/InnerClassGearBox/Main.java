package InterfaceIntro.InnerClassGearBox;

import java.util.Scanner;

public class Main {

    private static Button btnpress = new Button("press");
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        GearBox mcLaren = new GearBox(6);
        GearBox.Gear first = mcLaren.new Gear(1, 12.3);
        System.out.println(first.driveSpeed(1000));
        System.out.println(mcLaren.getGears());

//        class ClickListener implements Button.OnClickListener{
//            public ClickListener(){
//                System.out.println("I've been clicked ");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }

        btnpress.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();


    }


    private static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnpress.onClick();
            }

        }
    }
}
