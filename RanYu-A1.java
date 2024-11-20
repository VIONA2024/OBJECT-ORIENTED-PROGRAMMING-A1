import java.util.ArrayList;

// HealthProfessional class (base class), corresponding to the requirements of Part 1 of the assignment. This part requires creating a base class for health professionals, which should contain the following:
// 1. Required instance variables: ID (only numbers) and name. Here, ID is used to uniquely identify health professionals, and name represents their names.
// 2. Another instance variable for describing basic information unrelated to the type of doctor, represented by department for work department and other information.
// 3. A default constructor for initializing objects with default settings if no parameters are passed when creating an object.
// 4. A second constructor for initializing all instance variables, setting the ID, name, and department of health professionals through passed parameters.
// 5. A method for printing all instance variables to output the ID, name, and department of health professionals.
class HealthProfessional {
    private int ID;
    private String name;
    private String department;

    // Default constructor, meeting the requirement of creating a default constructor in Part 1.
    public HealthProfessional() {
    }

    // Constructor for initializing all instance variables, meeting the requirement of creating a constructor for initializing all instance variables in Part 1.
    public HealthProfessional(int ID, String name, String department) {
        this.ID = ID;
        this.name = name;
        this.department = department;
    }

    // Method for printing all instance variables to output the ID, name, and department of health professionals.
    public void printAllVariables() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }

    // Getter and Setter methods for accessing and modifying private variables, facilitating operations on these properties in other classes. Although not explicitly mentioned in the assignment, this helps follow the encapsulation principle of object-oriented programming and allows safe access and modification of internal data of classes.
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

// GeneralPractitioner class (subclass), corresponding to the requirements of Part 2 of the assignment. This part requires creating a subclass representing general practitioners, inheriting from the HealthProfessional base class. The subclass should have the following:
// 1. At least another relevant instance variable suitable for distinguishing general practitioners from other types of health professionals. Here, isGoodAtFamilyMedicine is used to indicate whether they are good at family medicine.
// 2. A default constructor for initializing general practitioner objects with default settings if no parameters are passed.
// 3. A second constructor for initializing all instance variables (including base class instance variables), initializing the ID, name, department, and whether they are good at family medicine of general practitioners through passed parameters, and initializing base class instance variables by calling the base class constructor with super.
// 4. A method for printing detailed information of health professionals, including the type, for outputting detailed information of general practitioners, including type, ID, name, department, and whether they are good at family medicine.
class GeneralPractitioner extends HealthProfessional {
    private boolean isGoodAtFamilyMedicine;

    // Default constructor, meeting the requirement of creating a default constructor in Part 2.
    public GeneralPractitioner() {
    }

    // Constructor for initializing all instance variables (including base class instance variables), meeting the requirement of creating a constructor for initializing all instance variables in Part 2.
    public GeneralPractitioner(int ID, String name, String department, boolean isGoodAtFamilyMedicine) {
        super(ID, name, department);
        this.isGoodAtFamilyMedicine = isGoodAtFamilyMedicine;
    }

    // Method for printing detailed information of health professionals, including the type, for outputting detailed information of general practitioners, including type, ID, name, department, and whether they are good at family medicine.
    @Override
    public void printAllVariables() {
        if (super.getID() == 1) {
            System.out.println("Health professional details are as follows:");
        }
        System.out.println("Type: General Practitioner");
        super.printAllVariables();
        System.out.println("Good at family medicine: " + isGoodAtFamilyMedicine);
    }

    // Getter and Setter methods for accessing and modifying private variables, facilitating operations on these properties in other classes, such as when setting whether a general practitioner is good at family medicine.
    public boolean isGoodAtFamilyMedicine() {
        return isGoodAtFamilyMedicine;
    }

    public void setGoodAtFamilyMedicine(boolean goodAtFamilyMedicine) {
        this.isGoodAtFamilyMedicine = goodAtFamilyMedicine;
    }
}

// Specialist class (another assumed type of health professional, subclass), corresponding to the requirements of Part 2 of the assignment. Create a subclass representing specialists, inheriting from the HealthProfessional class. It should meet the following conditions:
// 1. At least one additional instance variable for distinguishing types, represented by specialtyField for the area of expertise.
// 2. A default constructor for initializing specialist objects with default settings if no parameters are passed.
// 3. A constructor for initializing all instance variables (including base class instance variables), initializing the ID, name, department, and area of expertise of specialists through passed parameters, and initializing base class instance variables by calling the base class constructor.
// 4. A method for printing detailed information of health professionals, including the type, for outputting detailed information of specialists, including type, ID, name, department, and area of expertise.
class Specialist extends HealthProfessional {
    private String specialtyField;

    // Default constructor.
    public Specialist() {
    }

    // Constructor for initializing all instance variables (including base class instance variables).
    public Specialist(int ID, String name, String department, String specialtyField) {
        super(ID, name, department);
        this.specialtyField = specialtyField;
    }

    // Method for printing detailed information of health professionals, including the type.
    @Override
    public void printAllVariables() {
        if (super.getID() == 4) {
            System.out.println("Health professional details are as follows:");
        }
        System.out.println("Type: Specialist");
        super.printAllVariables();
        System.out.println("Area of expertise: " + specialtyField);
    }

    // Getter and Setter methods for accessing and modifying private variables, facilitating operations on the area of expertise property in other classes.
    public String getSpecialtyField() {
        return specialtyField;
    }

    public void setSpecialtyField(String specialtyField) {
        this.specialtyField = specialtyField;
    }
}

// Appointment class, corresponding to the requirements of Part 4 of the assignment. This part requires creating a class for holding patient appointment information and should contain the following:
// 1. Instance variables related to patient details, where patientName represents the patient's name and mobilePhone represents the patient's mobile phone number.
// 2. An instance variable for appointment time slots, preferredTimeSlot for storing the patient's appointment time, such as 08:00, 10:00, etc.
// 3. An instance variable for the selected doctor, selectedDoctor of type HealthProfessional or its subclass object, representing the doctor selected by the patient.
// 4. A default constructor for initializing appointment objects with default settings if no parameters are passed.
// 5. A constructor for initializing all instance variables, initializing patient name, mobile phone number, appointment time slot, and selected doctor of appointment objects through passed parameters.
// 6. A method for printing all instance variables to output the detailed information of appointment objects, including patient name, mobile phone number, appointment time slot, and detailed information of the selected doctor (by calling the printing method of the selected doctor).
class Appointment {
    private String patientName;
    private String mobilePhone;
    private String preferredTimeSlot;
    private HealthProfessional selectedDoctor;

    // Default constructor.
    public Appointment() {
    }

    // Constructor for initializing all instance variables.
    public Appointment(String patientName, String mobilePhone, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // Method for printing all instance variables.
    public void printAllVariables() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Preferred Time Slot: " + preferredTimeSlot);
        System.out.println("Selected Doctor: ");
        selectedDoctor.printAllVariables();
    }

    // Getter and Setter methods for accessing and modifying private variables, facilitating operations on appointment-related properties in other classes, such as getting or setting patient name and mobile phone number.
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getPreferredTimeSlot() {
        return preferredTimeSlot;
    }

    public void setPreferredTimeSlot(String preferredTimeSlot) {
        this.preferredTimeSlot = preferredTimeSlot;
    }

    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    public void setSelectedDoctor(HealthProfessional selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }
}

// Main class contains the main method for testing the entire system, corresponding to the integration of using classes and objects and appointment collection-related operations in the assignment. In the assignment, the main method needs to perform the following operations:
// 1. Part 3 - Using classes and objects section. This part requires creating different types of health professional objects and printing their detailed information in the main method.
//    - Specifically, create three general practitioner objects and two specialist objects. Here, three general practitioner objects (gp1, gp2, gp3) and two specialist objects (sp1, sp2) are created.
//    - Then call their printing detailed information methods (printHealthProfessionalDetails) respectively to show the detailed information of different types of health professionals, including types (such as "Type: General Practitioner" or "Type: Specialist"), ID, name, department, and their specific properties (such as the family medicine proficiency of general practitioners and the area of expertise of specialists).
//    - Finally, print a separator line ("------------------------------") to distinguish the output of different parts, in line with the assignment requirements for showing information of different types of health professionals and some requirements for output format (distinguishing different parts by separator lines).
// 2. Part 5 - Collection of appointments section. This part requires implementing operations related to appointment collections:
//    - First, declare an ArrayList to store instances of the Appointment class. This meets the requirement of creating an ArrayList in Part 5 and is used to store all appointment information. Here, an ArrayList named appointments of type ArrayList<Appointment> is created.
//    - Then, by calling the create appointment method (createAppointment), add multiple appointments to the appointment list, corresponding to the call of the create appointment method in Part 5, simulating the process of creating appointments and adding them to the collection. Each appointment specifies the patient's name, mobile phone number, appointment time slot, and selected doctor (previously created health professional objects).
//    - After that, call the method for printing existing appointments (printExistingAppointments) to show all appointment information in the current appointment list. If the list is empty, output a prompt message, and then print a separator line.
//    - Then, call the method for canceling appointments (cancelBooking) to try to cancel appointments based on a given mobile phone number. This corresponds to the call of the cancel appointment method in Part 5. If the cancellation is successful, output a corresponding prompt message; otherwise, output an error message indicating that the mobile phone number is not found in existing appointments. Finally, print a separator line again.
//    - Finally, call the method for printing existing appointments again to show the latest appointment situation after the cancellation operation to verify whether the cancellation function has correctly updated the appointment collection.
public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects, create different types of health professional objects and print their detailed information.
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Zhang", "General Medicine Department", true);
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Li", "General Medicine Department", false);
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Wang", "General Medicine Department", true);
        Specialist sp1 = new Specialist(4, "Dr. Zhao", "Surgery", "Cardiology");
        Specialist sp2 = new Specialist(5, "Dr. Sun", "Surgery", "Orthopedics");

        gp1.printAllVariables();
        gp2.printAllVariables();
        gp3.printAllVariables();
        sp1.printAllVariables();
        sp2.printAllVariables();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments, here is the implementation of appointment collection-related operations.
        ArrayList<Appointment> appointments = new ArrayList<>();

        createAppointment(appointments, "Zhang San", "1234567890", "09:00", gp1);
        createAppointment(appointments, "Li Si", "0987654321", "10:30", gp2);
        createAppointment(appointments, "Wang Wu", "1112223333", "14:00", sp1);
        createAppointment(appointments, "Zhao Liu", "4445556666", "15:30", sp2);

        printExistingAppointments(appointments);
        System.out.println("------------------------------");

        cancelBooking(appointments, "0987654321");
        System.out.println("------------------------------");

        printExistingAppointments(appointments);
    }

    // Method for creating appointments, fulfilling the functional requirement of creating appointments and adding them to the ArrayList in Part 5. This method accepts parameters such as appointment list, patient name, mobile phone number, appointment time slot, and selected doctor, creates an appointment object, and adds it to the appointment list to simulate the process of creating new appointments and adding them to the collection.
    public static void createAppointment(ArrayList<Appointment> appointments, String patientName, String mobilePhone, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        Appointment appointment = new Appointment(patientName, mobilePhone, preferredTimeSlot, selectedDoctor);
        appointments.add(appointment);
    }

    // Method for printing existing appointments, fulfilling the functional requirement of printing existing appointment information in the ArrayList in Part 5. This method checks if the appointment list is empty. If it is empty, it outputs a prompt message indicating no existing appointments; otherwise, it iterates through each appointment object in the list and calls its printAllVariables method to print appointment information.
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("There are no existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printAllVariables();
            }
        }
    }

    // Method for canceling appointments, fulfilling the functional requirement of canceling appointments based on mobile phone numbers in Part 5. This method iterates through the appointment list, looks for appointments that match the given mobile phone number. If found, it removes the appointment from the list and outputs a prompt message indicating successful cancellation; otherwise, it outputs an error message indicating that the mobile phone number is not found in existing appointments.
    public static void cancelBooking(ArrayList<Appointment> appointments, String mobilePhone) {
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getMobilePhone().equals(mobilePhone)) {
                appointments.remove(i);
                System.out.println("Booking cancelled successfully.");
                return;
            }
        }
        System.out.println("Mobile phone number not found in existing appointments.");
    }
}