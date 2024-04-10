import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Smart farm system:");
        System.out.println("\n How can we help you today\n");
        System.out.print("1.Add animal\n 2.Add product \n 3.Show report");
        int option;
        Scanner sc  = new Scanner(System.in);
        System.out.println("\nPlease choose one option");
        option=sc.nextInt();
        if(option == 1){
            System.out.println("What type of animal is it?");
            System.out.println("\n 1.Cow \n 2.Goat \n 3. Hen");
            System.out.println(
                    "\n Choose one animal"
            );
            int option1;
            option1 = sc.nextInt();
            String[] allAnimals={"Cow", "Goat","Chicken"};
            int age = 0; String name="welcome";
            int info = 2;
            for(int i = 0; i<= info ; i++){
                if(i == 1){
                    System.out.println("Please add age: ");
                    age = sc.nextInt();
                    System.out.println("Age recorded successfully");
                }
                else if(i== 2){
                    System.out.println("Please fill in the name of the animal: ");
                    name = sc.nextLine();
                    System.out.println("Name added successfuly");
                }
                else{
                    String inputAge =Integer.toString(age);
                    Dictionary <String, String> newAnimal = new Hashtable<>();
                    newAnimal.put("age", inputAge);
                    newAnimal.put("name", name);
                    System.out.println(newAnimal);
                }
            }
        } else if (option == 2) {
            System.out.println("Happy haverst which product do you want to add");
        }
        else{
            System.out.println("We are happy to view reports\n Which reports do you want to see");
            System.out.println("\n 1.Monthly \n2. Daily \n 3.Annual report");
        }
    }
}