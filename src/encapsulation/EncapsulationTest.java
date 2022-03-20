package encapsulation;

import java.util.Scanner;

public class EncapsulationTest {
    public static void main(String[] args) {
        Encapsulation person = new Encapsulation();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Publicly The Name: ");

        String Na = input.nextLine();
        //person.setName(Na);
        System.out.print("Enter Publicly The Id: ");
        int Id = input.nextInt();

        // System.out.println("Name: "+Na);

        person.setName(Na,Id);

        System.out.println("Private Name: " + person.getPrint());
 //      System.out.println("Private Id: " + person.getId());
    }


}
