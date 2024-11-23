public class ConstructorExample {
    public static void main(String[] args) {
        Students st = new Students("Dimpal",13,"ISE");
        Students st2 = new Students("Ananya",22,"CSE");
        Students st3 = new Students("Alien",15,"ECE");

        st.display();
        st2.display();
        st3.display();


    }
}
class Students{
    String name;
    int rollNo;
    String branch;

    public Students(String name, int rollNo, String branch)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
    }
    public void display() {
        System.out.println("Student name: " + name);
        System.out.println("Student rollNo: " + rollNo);
        System.out.println("Student branch: " + branch);
    }
}
