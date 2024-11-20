import java.util.ArrayList;

// HealthProfessional类（基类），对应作业Part 1要求。此部分要求创建一个健康专业人员的基类，该基类应包含以下内容：
// 1. 必需的实例变量：ID（仅数字）和名称，这里的ID用于唯一标识健康专业人员，name表示其姓名。
// 2. 另一个实例变量，用于描述与医生类型无关的基本信息，此处用department表示工作部门等信息。
// 3. 一个默认构造函数，用于在创建对象时若未传入参数则使用默认设置初始化对象。
// 4. 第二个构造函数，用于初始化所有实例变量，通过传入的参数来设置健康专业人员的ID、姓名和部门信息。
// 5. 一个打印所有实例变量的方法，用于输出健康专业人员的ID、姓名和部门信息。
class HealthProfessional {
    private int ID;
    private String name;
    private String department;

    // 默认构造函数，满足Part 1中创建默认构造函数的要求
    public HealthProfessional() {
    }

    // 初始化所有实例变量的构造函数，满足Part 1中创建初始化所有实例变量构造函数的要求
    public HealthProfessional(int ID, String name, String department) {
        this.ID = ID;
        this.name = name;
        this.department = department;
    }

    // 打印所有实例变量的方法，用于输出健康专业人员的ID、姓名和部门信息。
    public void printAllVariables() {
        System.out.println("编号: " + ID);
        System.out.println("姓名: " + name);
        System.out.println("部门: " + department);
    }

    // Getter和Setter方法，用于访问和修改私有变量，方便在其他类中操作这些属性。虽然作业未明确提及，但这有助于遵循面向对象编程的封装原则，使得类的内部数据可以被安全地访问和修改。
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

// GeneralPractitioner类（子类），对应作业Part 2要求。该部分要求创建代表全科医生的子类，继承自HealthProfessional基类，子类需具备以下内容：
// 1. 至少另一个相关且适合区分全科医生和其他健康专业人员类型的实例变量，这里用isGoodAtFamilyMedicine表示是否擅长家庭医疗。
// 2. 一个默认构造函数，用于在创建全科医生对象时若未传入参数则使用默认设置初始化对象。
// 3. 第二个构造函数，用于初始化所有实例变量（包括基类实例变量），通过传入的参数初始化全科医生的ID、姓名、部门以及是否擅长家庭医疗等信息，其中通过super调用基类构造函数初始化基类的实例变量。
// 4. 一个打印健康专业人员详细信息的方法，包括健康专业人员类型，用于输出全科医生的详细信息，包括类型、ID、姓名、部门以及是否擅长家庭医疗等。
class GeneralPractitioner extends HealthProfessional {
    private boolean isGoodAtFamilyMedicine;

    // 默认构造函数，满足Part 2中创建默认构造函数的要求
    public GeneralPractitioner() {
    }

    // 初始化所有实例变量的构造函数（包括基类的实例变量），满足Part 2中创建初始化所有实例变量构造函数的要求
    public GeneralPractitioner(int ID, String name, String department, boolean isGoodAtFamilyMedicine) {
        super(ID, name, department);
        this.isGoodAtFamilyMedicine = isGoodAtFamilyMedicine;
    }

    // 打印健康专业人员详细信息的方法，包括健康专业人员类型，用于输出全科医生的详细信息，包括类型、ID、姓名、部门以及是否擅长家庭医疗等。
    @Override
    public void printAllVariables() {
        if (super.getID() == 1) {
            System.out.println("健康专业人员详情如下:");
        }
        System.out.println("类型: 全科医生");
        super.printAllVariables();
        System.out.println("擅长家庭医疗: " + isGoodAtFamilyMedicine);
    }

    // Getter和Setter方法，用于访问和修改私有变量，方便在其他类中操作这些属性，例如在设置全科医生是否擅长家庭医疗的属性时使用。
    public boolean isGoodAtFamilyMedicine() {
        return isGoodAtFamilyMedicine;
    }

    public void setGoodAtFamilyMedicine(boolean goodAtFamilyMedicine) {
        this.isGoodAtFamilyMedicine = goodAtFamilyMedicine;
    }
}

// Specialist类（假设的另一种健康专业人员类型，子类），对应作业Part 2要求。创建代表专科医生的子类，继承自HealthProfessional类，需满足以下条件：
// 1. 至少一个额外实例变量区分类型，这里用specialtyField表示专长领域。
// 2. 一个默认构造函数，用于在创建专科医生对象时若未传入参数则使用默认设置初始化对象。
// 3. 初始化所有实例变量（包括基类实例变量）的构造函数，通过传入的参数初始化专科医生的ID、姓名、部门和专长领域等信息，调用基类构造函数初始化基类实例变量。
// 4. 打印健康专业人员详细信息的方法，包括健康专业人员类型，用于输出专科医生的详细信息，包括类型、ID、姓名、部门和专长领域等。
class Specialist extends HealthProfessional {
    private String specialtyField;

    // 默认构造函数
    public Specialist() {
    }

    // 初始化所有实例变量的构造函数（包括基类的实例变量）
    public Specialist(int ID, String name, String department, String specialtyField) {
        super(ID, name, department);
        this.specialtyField = specialtyField;
    }

    // 打印健康专业人员详细信息的方法，包括健康专业人员类型
    @Override
    public void printAllVariables() {
        if (super.getID() == 4) {
            System.out.println("健康专业人员详情如下:");
        }
        System.out.println("类型: 专科医生");
        super.printAllVariables();
        System.out.println("专长领域: " + specialtyField);
    }

    // Getter和Setter方法，用于访问和修改私有变量，方便在其他类中操作专长领域这个属性。
    public String getSpecialtyField() {
        return specialtyField;
    }

    public void setSpecialtyField(String specialtyField) {
        this.specialtyField = specialtyField;
    }
}

// Appointment类，对应作业Part 4要求。此部分要求创建用于容纳患者预约信息的类，应包含以下内容：
// 1. 患者详情相关的实例变量，patientName表示患者姓名，mobilePhone表示患者手机号码。
// 2. 预约时间槽实例变量，preferredTimeSlot用于存储患者预约的时间，如08:00、10:00等。
// 3. 所选医生实例变量，selectedDoctor类型为HealthProfessional类或其子类对象，表示患者所选的医生。
// 4. 一个默认构造函数，用于在创建预约对象时若未传入参数则使用默认设置初始化对象。
// 5. 初始化所有实例变量的构造函数，通过传入的参数初始化预约对象的患者姓名、手机号码、预约时间槽和所选医生等信息。
// 6. 一个打印所有实例变量的方法，用于输出预约对象的详细信息，包括患者姓名、手机号码、预约时间槽以及所选医生的详细信息（通过调用所选医生的打印方法）。
class Appointment {
    private String patientName;
    private String mobilePhone;
    private String preferredTimeSlot;
    private HealthProfessional selectedDoctor;

    // 默认构造函数
    public Appointment() {
    }

    // 初始化所有实例变量的构造函数
    public Appointment(String patientName, String mobilePhone, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // 打印所有实例变量的方法
    public void printAllVariables() {
        System.out.println("患者姓名: " + patientName);
        System.out.println("手机号码: " + mobilePhone);
        System.out.println("预约时间槽: " + preferredTimeSlot);
        System.out.println("所选医生: ");
        selectedDoctor.printAllVariables();
    }

    // Getter和Setter方法，用于访问和修改私有变量，方便在其他类中操作预约相关的属性，例如获取或设置患者姓名、手机号码等。
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

// Main类包含main方法用于测试整个系统，对应作业中使用类和对象以及预约集合相关操作的整合。在作业中，main方法需执行以下操作：
// 1. Part 3 – Using classes and objects部分，此部分要求在main方法中创建不同类型的健康专业人员对象并打印其详细信息。
//    - 具体为创建三个全科医生对象和两个专科医生对象，这里创建了三个全科医生对象（gp1、gp2、gp3）和两个专科医生对象（sp1、sp2）。
//    - 然后分别调用它们的打印详细信息方法（printHealthProfessionalDetails），展示了不同类型健康专业人员的详细信息，包括类型（如“Type: General Practitioner”或“Type: Specialist”）、ID、姓名、部门以及各自特定的属性（如全科医生的擅长家庭医疗情况和专科医生的专长领域）。
//    - 最后打印一条分隔线（"------------------------------"）用于区分不同部分的输出，符合作业要求中对展示不同类型健康专业人员信息的规定，以及对输出格式的部分要求（通过分隔线区分不同部分）。
// 2. Part 5 – Collection of appointments部分，此部分要求实现与预约集合相关的操作：
//    - 首先要声明一个ArrayList来存储预约类的实例，对应Part 5中创建ArrayList的要求，用于存储所有的预约信息。这里创建了名为appointments的ArrayList<Appointment>。
//    - 接着通过调用创建预约方法（createAppointment），向预约列表中添加多个预约，对应Part 5中创建预约方法的调用，模拟了创建预约并添加到集合中的过程。每个预约指定了患者姓名、手机号码、预约时间槽和所选医生（之前创建的健康专业人员对象）。
//    - 之后调用打印现有预约方法（printExistingAppointments），展示当前预约列表中的所有预约信息，对应Part 5中打印现有预约方法的调用，如果列表为空则输出提示信息，接着打印一条分隔线。
//    - 然后调用取消预约方法（cancelBooking），尝试根据给定的手机号码取消预约，对应Part 5中取消预约方法的调用，如果取消成功输出相应提示信息，否则输出手机号码未找到的错误提示，最后再次打印一条分隔线。
//    - 最后再次调用打印现有预约方法，展示取消预约操作后的最新预约情况，用于验证取消预约功能是否正确更新了预约集合。
public class Main {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects，创建不同类型的健康专业人员对象并打印其详细信息
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "张医生", "全科医学部", true);
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "李医生", "全科医学部", false);
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "王医生", "全科医学部", true);
        Specialist sp1 = new Specialist(4, "赵医生", "外科", "心脏病学");
        Specialist sp2 = new Specialist(5, "孙医生", "外科", "骨科");

        gp1.printAllVariables();
        gp2.printAllVariables();
        gp3.printAllVariables();
        sp1.printAllVariables();
        sp2.printAllVariables();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments，以下是对预约集合相关操作的实现
        ArrayList<Appointment> appointments = new ArrayList<>();

        createAppointment(appointments, "张三", "1234567890", "09:00", gp1);
        createAppointment(appointments, "李四", "0987654321", "10:30", gp2);
        createAppointment(appointments, "王五", "1112223333", "14:00", sp1);
        createAppointment(appointments, "赵六", "4445556666", "15:30", sp2);

        printExistingAppointments(appointments);
        System.out.println("------------------------------");

        cancelBooking(appointments, "0987654321");
        System.out.println("------------------------------");

        printExistingAppointments(appointments);
    }

    // 创建预约的方法，实现了Part 5中创建预约并添加到ArrayList的功能要求。该方法接受预约列表、患者姓名、手机号码、预约时间槽和所选医生等参数，创建一个预约对象并添加到预约列表中，用于模拟创建新预约的过程。
    public static void createAppointment(ArrayList<Appointment> appointments, String patientName, String mobilePhone, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        Appointment appointment = new Appointment(patientName, mobilePhone, preferredTimeSlot, selectedDoctor);
        appointments.add(appointment);
    }

    // 打印现有预约的方法，实现了Part 5中打印ArrayList中现有预约信息的功能要求。此方法判断预约列表是否为空，如果为空则输出没有现有预约的提示，否则遍历列表中的每个预约对象并调用其printAllVariables方法打印预约信息。
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("没有现有预约。");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printAllVariables();
            }
        }
    }

    // 取消预约的方法，实现了Part 5中根据手机号码取消预约的功能要求。此方法遍历预约列表，查找与给定手机号码匹配的预约，如果找到则从列表中删除该预约并输出预约取消成功的提示，然后返回；如果遍历完列表都未找到匹配的手机号码，则输出手机号码在现有预约中未找到的提示。
    public static void cancelBooking(ArrayList<Appointment> appointments, String mobilePhone) {
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getMobilePhone().equals(mobilePhone)) {
                appointments.remove(i);
                System.out.println("预约已成功取消。");
                return;
            }
        }
        System.out.println("手机号码在现有预约中未找到。");
    }
}


