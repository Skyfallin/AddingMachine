package cse360assignment02;

/**
 * The AddingMachine class contains simple logic for adding, subtracting, and displaying a contained value.
 * @author Skyfallin
 */
public class AddingMachine {

    private int total;
    private String history;

    /**
     * Creates an adding machine and sets total to 0
     */
    public AddingMachine() {
        total = 0;  // not needed - included for clarity
        history = "0";
    }

    /**
     * Displays the value of the adding machine
     * @return the current total of the adding machine
     */
    public int getTotal() {
        return total;
    }

    /**
     * Adds a value to the total
     * @param value the value to be added to the total
     */
    public void add(int value) {
        total += value;
        history += " + " + value;
    }

    /**
     * Subtracts a value from the total
     * @param value the value to be subtracted from the total
     */
    public void subtract(int value) {
        total -= value;
        history += " - " + value;
    }

    /**
     * Displays the history of each transaction of the machine
     * @return history, a string representing the history of the transactions of the machine
     */
    public String toString() {
        return history;
    }

    /**
     * Clears the machine
     */
    public void clear() {
        total = 0;
        history = "0";
    }
}