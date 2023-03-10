# Vending Machine

This is a simple command-line application that simulates a vending machine. The application prompts the user to select a row and a column for a product, and then dispenses this product and sells it to the user.

# Features
Displays available products and their prices
Validates user input for row and column selection
Dispenses product
Maintains inventory and sales data


## Preview
![usage](https://github.com/doughtyphilipe/Vending_Machine/blob/main/vendingmachine.gif)

## Main function

This code revolves around the while loop shown below. We will prompt the user to select a row and a column(spot) from the shown product, and then we will sell that product by calling the dispense function.

```java
        while (true) {
            System.out.println(machine);
        
            System.out.print("Pick a row: "); 
            // pick up row.
            int row = scan.nextInt();
            System.out.print("Pick a spot in the row: "); 
            // pick up spot.
            int spot = scan.nextInt();

            //dispense from machine from [row,spot]
            boolean sold = machine.dispense(row, spot);

            //print machine
            System.out.println("\n" + machine);            

            
            if (sold) {
                System.out.print("\nEnjoy your drink! Press 1 to purchase another: ");
                scan.nextLine();                
                if (scan.nextInt() != 1) {
                    break;
                }
            } else {
                System.out.print("\nSorry, we're out of this item. Press 1 to purchase another: ");              
                if (scan.nextInt() != 1) {
                    break;
                }
            }
```

