import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter delivery mode (ROAD / SEA): ");
        String deliveryInput = scanner.nextLine().toUpperCase();

        System.out.print("Enter UI platform (WINDOWS / MACOS): ");
        String uiInput = scanner.nextLine().toUpperCase();

        Logistics logistics = configureLogistics(deliveryInput);
        GUIfactory factory = configureUI(uiInput);

        if (logistics == null || factory == null){
            System.out.println("Error: Unsupported delivery mode or UI platform");
            return;
        }
        DeliveryApplication app = new DeliveryApplication(factory, logistics);
        app.run();
    }


    private static Logistics configureLogistics(String mode) {
        switch (mode) {
            case "ROAD":
                return new RoadLogistics();
            case "SEA":
                return new SeaLogistics();
            default:
                return null;
        }
    }

    private static GUIfactory configureUI(String platform) {
        switch (platform) {
            case "WINDOWS":
                return new WindowsFactory();
            case "MACOS":
                return new MacOSFactory();
            default:
                return null;
        }
    }

}




