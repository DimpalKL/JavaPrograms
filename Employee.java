class Employee {
    int id=101;
    String name = "Tom";
    double salary= 30000;
}
class Test{
    public static void main(String[] args) {
        Employee emp=new Employee();
        System.out.println(emp.id);
        System.out.println(emp.name);
        System.out.println(emp.salary);

    }
}