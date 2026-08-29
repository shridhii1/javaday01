import java.util.Scanner;

public class SmartTrafficAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle number: ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Enter vehicle speed: ");
        int speed = sc.nextInt();

        System.out.print("Enter speed limit: ");
        int speedLimit = sc.nextInt();

        System.out.print("Enter driver age: ");
        int age = sc.nextInt();

        System.out.print("Is helmet worn? (1 for Yes, 0 for No): ");
        int helmet = sc.nextInt();

        System.out.print("Is seat belt worn? (1 for Yes, 0 for No): ");
        int seatBelt = sc.nextInt();

        System.out.print("Is license valid? (1 for Yes, 0 for No): ");
        int license = sc.nextInt();

        System.out.print("Is it an emergency vehicle? (1 for Yes, 0 for No): ");
        int emergency = sc.nextInt();

        int excessSpeed = speed - speedLimit;
        int fine = 0;
        int violationFlags = 0;

        if (speed > speedLimit && emergency == 0) {
            violationFlags |= 1;
            fine += 2000;
        }

        if (helmet == 0) {
            violationFlags |= 2;
            fine += 500;
        }

        if (seatBelt == 0) {
            violationFlags |= 4;
            fine += 500;
        }

        if (license == 0) {
            violationFlags |= 8;
            fine += 1500;
        }

        if (age < 18) {
            violationFlags |= 16;
            fine += 1000;
        }

        String speedStatus;
        if (speed > speedLimit && emergency == 0) {
            speedStatus = "OVER SPEED";
        } else {
            speedStatus = "NORMAL";
        }

        String helmetStatus;
        if (helmet == 1) {
            helmetStatus = "VALID";
        } else {
            helmetStatus = "VIOLATION";
        }

        String seatBeltStatus;
        if (seatBelt == 1) {
            seatBeltStatus = "VALID";
        } else {
            seatBeltStatus = "VIOLATION";
        }

        String licenseStatus;
        if (license == 1) {
            licenseStatus = "VALID";
        } else {
            licenseStatus = "INVALID";
        }

        String riskLevel;
        if (violationFlags == 0) {
            riskLevel = "LOW";
        } else if (fine <= 1000) {
            riskLevel = "MEDIUM";
        } else {
            riskLevel = "HIGH";
        }

        System.out.println("SMART TRAFFIC ANALYZER");
        

        System.out.println("Vehicle Number   : " + vehicleNumber);
        System.out.println("Speed            : " + speed + " km/h");
        System.out.println("Speed Limit      : " + speedLimit + " km/h");
        System.out.println("Excess Speed     : " + (excessSpeed > 0 ? excessSpeed : 0) + " km/h");

        System.out.println();
        System.out.println("Speed Status     : " + speedStatus);
        System.out.println("Helmet Status    : " + helmetStatus);
        System.out.println("Seat Belt Status : " + seatBeltStatus);
        System.out.println("License Status   : " + licenseStatus);

        System.out.println();
        System.out.println("Total Fine       : ₹" + fine);
        System.out.println("Risk Level       : " + riskLevel);
        System.out.println("Violation Flags  : " + violationFlags);

        sc.close();
    }
}