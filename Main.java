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