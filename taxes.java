import java.util.Scanner;

public class taxes{
    public static void main(String[] args) {
        double inSalary;
        double inAge;
        double inDependents;  
        double total;
        double kidsbenefits;
    
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your salary:");
        inSalary = scan.nextInt();

        if (inSalary > 0 && inSalary < 10000){
            total = 0;
            System.out.println("Enter how many kids you have:");
            inDependents = scan.nextInt();
            if (inDependents == 1){   
                total = 1000.0;

            }else{
                kidsbenefits = (((inDependents - 1) * 500) + 1000.0);
                total = total + kidsbenefits;
            }
            inAge = scan.nextInt();
            System.out.println("You will recieve:" + total);

            

        }

        if (inSalary > 10000 && inSalary < 25000){
            total = (inSalary * .9);
            System.out.println("Enter how many kids you have:");
            inDependents = scan.nextInt();
            if (inDependents == 1){   
                total = (total + 1000.0);

            }else{
                kidsbenefits = (((inDependents - 1) * 500) + 1000.0);
                total = total + kidsbenefits;
            }
            System.out.println("Enter your age:");
            inAge = scan.nextInt();
            if (inAge >= 81){
                total = inSalary + kidsbenefits;
            }
            if (inAge <= 80 && inAge >= 72){
                total = (inSalary * .66) + kidsbenefits;
            }
            if (inAge <= 72 && inAge >= 64){
                total = (inSalary * .33) + kidsbenefits;
            }
            if (inAge <= 63 && inAge >= 22){
                total = (inSalary) + kidsbenefits;
            }
            if (inAge <= 80 && inAge >= 72){
                total = (inSalary / .25) + kidsbenefits;
            }
            if (inAge <= 80 && inAge >= 72){
                total = (inSalary / .5) + kidsbenefits;
            }
            System.out.println("You will recieve:" + total);

            
            inDependents = scan.nextInt();

        }
        





    }
}