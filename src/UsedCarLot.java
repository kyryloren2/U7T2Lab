import java.util.ArrayList;

/**
 * This class represents a Used Car Lot
 *
 * @author Kyrylo Orlov
 */
public class UsedCarLot {
    /** The cars in the car lot */
    private ArrayList<Car> inventory = new ArrayList<Car>();

    /**
     * Instantiates a used car lot object and
     * initializes the inventory to an empty ArrayList
     */
    public UsedCarLot() {
        this.inventory = inventory;
    }

    /**
     * Returns the inventory of the used car lot
     *
     * @return the inventory
     */
    public ArrayList<Car> getInventory() {
        return inventory;
    }

    /**
     * Adds a car to the end of the inventory
     *
     * @param newCar the car to add
     */
    public void addCar(Car newCar) {
        inventory.add(newCar);
    }

    /**
     * Swaps the Car at index1 with the Car at index2 and returns true. If
     * index1 or index2 are out of bounds of the inventory or are negative,
     * no changes are made to the inventory and false is returned.
     *
     * @param index1 Index for the first Car on the lot
     * @param index2 Index for the second Car on the lot
     * @return True if swap was successful, false if swap not successful
     */
    public boolean swap(int index1, int index2) {
        if(index1 < inventory.size() && index2 < inventory.size() && index1 >= 0) {
            Car replacedCar = inventory.set(index1, inventory.get(index2));
            inventory.set(index2, replacedCar);

            return true;
        } else {
            return false;
        }
    }

    /**
     * Adds a Car to the inventory list at the index specified
     * by indexToAdd; this method increases the size of inventory by 1
     * <p>
     * PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
     *
     * @param indexToAdd Index in the inventory to add the car
     * @param carToAdd Car object to add to the lot
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /**
     * "sells" the Car located at indexOfCarToSell which
     * removes it from the inventory list and shifting the remaining
     * Cars in the inventory list to the left to fill in the gap;
     * this method reduces the size of inventory by 1
     * <p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell The index of the car to sell
     * @return the Car that is being "sold" (removed from the lot)
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        return inventory.remove(indexOfCarToSell);
    }

    /* "sells" the Car located at indexOfCarToSell,
       but instead of removing it and shifting the inventory
       list to the left, REPLACE the Car at indexOfCarToSell
       with NULL, thus creating an "empty parking spot" on the lot;
       this method does NOT reduce the size of inventory by 1

       PRECONDITION: indexOfCarToSell &lt; inventory.size()

       This method returns the Car that is being "sold" (replaced with null)
     */

    /**
     * "sells" the Car located at indexOfCarToSell,
     * but instead of removing it and shifting the inventory
     * list to the left, REPLACE the Car at indexOfCarToSell
     * with NULL, thus creating an "empty parking spot" on the lot;
     * this method does NOT reduce the size of inventory by 1
     * <p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell The index of the Car to sell
     * @return the Car that is being "sold"
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        return inventory.set(indexOfCarToSell, null);
    }

    /* moves Car located at index indexOfCarToMove to index destinationIndex;
       if destinationIndex > indexOfCarToMove, moves the Car to the right in
       inventory; if destinationIndex < indexOfCarToMove, moves the
       Car to the left in the inventory. All other cars in the inventory
       should shift accordingly

       PRECONDITIONS: indexOfCarToMove &lt; inventory.size()
                      destinationIndex &lt; inventory.size()
     */

    /**
     * Moves Car located at index indexOfCarToMove to index destinationIndex;
     * if destinationIndex > indexOfCarToMove, moves the Car to the right in
     * inventory; if destinationIndex &lt; indexOfCarToMove, moves the
     * ar to the left in the inventory. All other cars in the inventory
     * should shift accordingly
     * <p>
     * PRECONDITIONS: indexOfCarToMove &lt; inventory.size()
     *                destinationIndex &lt; inventory.size()
     *
     * @param indexOfCarToMove The index of the Car to move
     * @param destinationIndex The index where the Car should be moved
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car carToMove = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, carToMove);
    }
}
