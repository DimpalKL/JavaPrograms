public class NestedIf {
    public static void main(String[] args) {
        int number = 10;
        if(number <= 10)
        {
            if(number==10){
                System.out.println("Number is Equal to 5");
            }
            else {
                System.out.println("Number is not equal to 5");
            }
        }
        else{
            System.out.println("Number is greater than 10");
        }
    }
}