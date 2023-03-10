import java.util.Arrays;

public class Machine {
    private Item[][] items;
    
    //constructor
    public Machine (Item[][] items) {
        this.items = new Item[items.length][items[0].length];
        for (int i = 0; i < items.length ; i++) {
            for (int j = 0; j < items[i].length ; j++) {
                this.items[i][j] = new Item(items[i][j]);                
            }
        }    
    }
    
    //getter
    public Item getItem (int row, int spot) {
        return new Item(this.items[row][spot]);
    }

    //setter
    public void setItem (Item item, int row, int spot) {         
        this.items[row][spot] = new Item(item);
    }

    /**
     * Function name – dispense
     * @param row (int)
     * @param spot (int)
     * @return (boolean)
     * 
     * Inside the function:
     *  1. Checks if the requested item has a quantity bigger than 0.
     *      • if so: decreases its quantity by one and returns true.
     *      • otherwise: returns false.
     */
    public boolean dispense (int row, int spot) {        
        if (this.items[row][spot].getQuantity() > 0) {
            this.items[row][spot].setQuantity(this.items[row][spot].getQuantity()-1);
            return true;            
        } else {
            return false;
        }

    }

    //toString
    public String toString(){
        String temp = "";
        for (int i = 0; i < items.length; i++) {
            temp += "\t ";
            for (int j = 0; j < items[i].length; j++) {
               temp += items[i][j].toString() + " "; 
            }
            temp += "\n\n ";
        }
        temp += "\t************************************************";

        return temp;
    }
}
