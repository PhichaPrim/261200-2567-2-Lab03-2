public class Patient {
    private int id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodGroup;
    private String phoneNumber;

    public Patient(int id, String name, int birthYear, double height, double weight, String bloodGroup, String phoneNumber) {
        this.id = id;
        this.name = name;

        if (birthYear <= 0) {
            this.birthYear = 2000;
            System.out.println("Birth year cannot be zero or negative.");
        }else
            this.birthYear = birthYear;

        if (height <= 0) {
            this.height = 175;
            System.out.println("Height must be a positive value.");
        }else
            this.height = height;

        if (weight <= 0) {
            this.weight = 60;
            System.out.println("Weight must be a positive value.");
        }else
            this.weight = weight;

        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
    }

    public int getAge(int currentYear) {
        if (currentYear <= 0) {
            System.out.println("Current year cannot be zero or negative.");
        }
        return currentYear - birthYear;
    }

    public String getBloodGroup(String bloodGroup) {
        return bloodGroup;
    }

    public String getPhoneNumber(String phoneNumber) {
        return phoneNumber;
    }

    public double getBMI() {
        if (height <= 0 || weight <= 0) {
            return 0.0;
        }
        double heightInMeters = height / 100;
        return weight / (heightInMeters * heightInMeters);
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient Blood Group: " + getBloodGroup(bloodGroup));
        System.out.println("Patient Phone Number: " + getPhoneNumber(phoneNumber));
        System.out.println("Patient BMI: " + getBMI());
    }
}
