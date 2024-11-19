class HealthProfessional {
    private int ID;
    private String name;
    private String department;

    // 这就是默认构造函数啦，啥都不做，先给个初始状态
    public HealthProfessional() {
    }

    // 这个构造函数就厉害啦，可以用传入的参数来设置ID、姓名和部门
    public HealthProfessional(int ID, String name, String department) {
        this.ID = ID;
        this.name = name;
        this.department = department;
    }

    // 这个方法会把ID、姓名和部门都打印出来
    public void printAllVariables() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }

    // 下面这些就是Getter和Setter方法啦，用来获取和设置私有变量的值
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

class GeneralPractitioner extends HealthProfessional {
    private boolean isGoodAtFamilyMedicine;

    // 这是默认构造函数，先留着备用
    public GeneralPractitioner() {
    }

    // 这个构造函数可以初始化全科医生的所有信息，包括基类的那些哦
    public GeneralPractitioner(int ID, String name, String department, boolean isGoodAtFamilyMedicine) {
        super(ID, name, department);
        this.isGoodAtFamilyMedicine = isGoodAtFamilyMedicine;
    }

    // 这个方法会打印出全科医生的详细信息，先判断ID是不是1，如果是就打印个标题，然后打印类型、调用基类的打印方法打印基类信息，最后打印是否擅长家庭医疗
    @Override
    public void printAllVariables() {
        if (super.getID() == 1) {
            System.out.println("Details of the health professional are:");
        }
        System.out.println("Type: General Practitioner");
        super.printAllVariables();
        System.out.println("Good at family medicine: " + isGoodAtFamilyMedicine);
    }

    // 下面是Getter和Setter方法，用来获取和设置是否擅长家庭医疗这个属性
    public boolean isGoodAtFamilyMedicine() {
        return isGoodAtFamilyMedicine;
    }

    public void setGoodAtFamilyMedicine(boolean goodAtFamilyMedicine) {
        this.isGoodAtFamilyMedicine = goodAtFamilyMedicine;
    }
}

class Specialist extends HealthProfessional {
    private String specialtyField;

    // 默认构造函数，先放着
    public Specialist() {
    }

    // 这个构造函数可以初始化专科医生的所有信息，包括基类的那些
    public Specialist(int ID, String name, String department, String specialtyField) {
        super(ID, name, department);
        this.specialtyField = specialtyField;
    }

    // 这个方法会打印出专科医生的详细信息，先判断ID是不是4，如果是就打印个标题，然后打印类型、调用基类的打印方法打印基类信息，最后打印专长领域
    @Override
    public void printAllVariables() {
        if (super.getID() == 4) {
            System.out.println("Details of the health professional are:");
        }
        System.out.println("Type: Specialist");
        super.printAllVariables();
        System.out.println("Specialty field: " + specialtyField);
    }

    // 下面是Getter和Setter方法，用来获取和设置专长领域这个属性
    public String getSpecialtyField() {
        return specialtyField;
    }

    public void setSpecialtyField(String specialtyField) {
        this.specialtyField = specialtyField;
    }
}

class Appointment {
    private String patientName;
    private String mobilePhone;
    private String preferredTimeSlot;
    private HealthProfessional selectedDoctor;

    // 默认构造函数
    public Appointment() {
    }

    // 这个构造函数可以初始化预约的所有信息，包括患者姓名、手机号码、预约时间槽和所选医生
    public Appointment(String patientName, String mobilePhone, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // 这个方法会打印出预约的所有信息，包括患者姓名、手机号码、预约时间槽和所选医生的详细信息
    public void printAllVariables() {
        System.out.println("Patient's name: " + patientName);
        System.out.println("Mobile phone: " + mobilePhone);
        System.out.println("Preferred time slot: " + preferredTimeSlot);
        System.out.println("Selected doctor: ");
        selectedDoctor.printAllVariables();
    }

    // 下面是Getter和Setter方法，用来获取和设置预约相关的属性
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

public class Main {
    public static void main(String[] args) {
        GeneralPractitioner gp = new GeneralPractitioner(1, "Doctor Smith", "General Practice", true);
        Specialist sp = new Specialist(4, "Doctor Johnson", "Surgery", "Cardiology");

        Appointment app = new Appointment("John Doe", "1234567890", "09:00", gp);
        app.printAllVariables();

        Appointment app2 = new Appointment("Jane Smith", "9876543210", "10:30", sp);
        app2.printAllVariables();
    }
}   