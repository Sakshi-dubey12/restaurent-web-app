import java.util.Scanner;

public class billing {
    public static void format(String date,String name)
    {
        System.out.println(" ");
        System.out.println("/t  GREAT OBSERVER RESTURANT CLUB");
        System.out.println("==============================================================================");
        System.out.println("Date :" +date);
        System.out.println("Innovice To :" +name);
        System.out.println(" ");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Items");
        System.out.println("\t\t\t QTY");
        System.out.println("\t\t\t Total");
        System.out.println("--------------------------------------------------------------------------------");
    }
    public static void printBill(String item, int qty,float price)
    {
        System.out.print(" "+item);
        System.out.print("\t\t\t    "+ qty);
        System.out.println("\t\t\t  "+qty*price);
        System.out.println(" ");
    }
    public static void calculate_Bill(float[] price , int[] quantities)
    {
        float total = 0;
        for (int i = 0; i < price.length; i++)
        {
            total += price[i] * quantities[i];
        }
        float discount = (float) (0.1 * total);
        float netTotal = total - discount;
        System.out.println("\n---------------------------------------------------------------------------------");
        System.out.println("Discount:                                          10% \t\t\t"+discount);
        System.out.println("\n---------------------------------------------------------------------------------");
        System.out.println("Total Amount :\t\t\t\t\t"+netTotal);
        System.out.println("\n---------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("\t\t\t Thank's and Visit Again !!! \n\n");
    }

    public static void main(String[] args) {
        System.out.println("\t\n Welcome to the resturant billing code using java\n");
      //  format("1/1/2024","Sakshi Dubey");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER CUSTOMER NAME:");
        String input_name = scanner.nextLine();

        System.out.println("Enter the number of order requested by the customer");
        int input_number = scanner.nextInt();

        String[] items= new String[input_number];
        int[] quantities = new int[input_number];
        float[] prices = new float[input_number];


        for(int i =0; i< input_number;i++)
        {
            System.out.println(" ");
            System.out.println("Enter Item:"+(i+1)+": ");
            System.out.println("Please Enter the Item Name : ");
            scanner.nextLine();
            items[i] = scanner.nextLine();
            System.out.println("Enter Quantity of Items :");
            quantities[i] = scanner.nextInt();
            System.out.println("Enter the Per Unit Charge of Item : ");
            prices[i] = scanner.nextFloat();
            System.out.println(" ");

        }
        format("1/1/2024","Sakshi Dubey");

        for(int i = 0; i <input_number; i++)
        {
            printBill(items[i], quantities[i] , prices[i]);
        }
    }
}
