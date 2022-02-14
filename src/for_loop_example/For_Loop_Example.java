package for_loop_example;
public class For_Loop_Example {
    public static void main(String[] args) {
        // TODO code application logic here
        // initialisation
        int sum = 0;
        //FIXED LOOP WHEN WE KNOW EXACTLY THE NUMBER OF TIMES..
        for (int j=1;j<10;j++){
            sum = sum + j;
        }
        System.out.println("The sum of first 10 natural "
                + "numbers is " + sum);
               
    }
    
}
